package topicQuestions.Arrays;

public class MaximumCircularSubarray {

	public static void main(String[] args) {
		int a[] = {5,-2,3,4};
		int n = a.length;
		System.out.println(overallSum(a , n));
	}
	static int maxSumCir(int a[] , int n) {       //My Solution O(n^2) 
		int cir[] = new int[n*2 -1];
		for(int i=0 ; i<n ;i++) {
			cir[i] = a[i];
		}
		for(int i=0 ; i<n-1 ; i++) {
			cir[i+n] = a[i];
		}
		int sum[] = new int[cir.length];
		sum[0] = cir[0];
		for(int i=1 ; i<cir.length ;i++) {
			sum[i] = cir[i] + sum[i-1];
		}
	
		return maxDiffLimited(sum , sum.length , n );
		
	} 
	
	static int maxDiffLimited(int[] sum , int n , int k) {
		int res = 0;
		
		for(int j=0 ; j<=n-k ;j++) {
			int currentMin = sum[j];
			int maxDiff = sum[j+1] - sum[j];
			for(int i=j ; i<j+k ;i++) {
				if(j==0) maxDiff = Math.max(Math.max(maxDiff , sum[i] - currentMin) , sum[i]);
				else maxDiff = Math.max(maxDiff , sum[i] - currentMin);
				currentMin = Math.min(currentMin , sum[i]);
			}
			res = Math.max(maxDiff , res);
		}
		return res;
	}

	static int maxSumCir2(int a[] , int n) {     //Naive Solution O(n^2)
		int res = 0;
		for(int i=0 ; i<n ;i++) {
				int max = a[0];
				int sum = a[0];
			for(int j=1 ; j<n ;j++ ) {
				int index = (i+j) % n;
				sum += a[index];
				max = Math.max(max , sum);
			}
			res = Math.max(max , res);
			
		}
		return res;
	}

	static int normalMaxSum(int a[] , int n) {    //Standard Kadane algorithm O(n)
		int maxSum = a[0];
		int maxEnding  = a[0];
		for(int i=1 ; i<n ;i++) {
			maxEnding = Math.max(maxEnding + a[i] , a[i]);
			maxSum = Math.max(maxEnding , maxSum);
		}
		return maxSum;
	}
	
	static int overallSum(int a[] , int n) {
		int normalMaxSum = normalMaxSum(a , n);
		if(normalMaxSum < 0 ) return normalMaxSum;   //if normalMaxSum is negative it means all the elements in the array are negative
		
		int arr_sum = 0;
		for(int i=0 ; i<n ; i++) {
			arr_sum += a[i];         // arr_sum is sum of the array
			a[i] = -a[i];			// inverting the array
		}
		int CircularMaxSum = arr_sum + normalMaxSum(a , n);
		return Math.max(normalMaxSum , CircularMaxSum);
	}

}
