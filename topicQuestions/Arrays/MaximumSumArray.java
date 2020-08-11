package topicQuestions.Arrays;
public class MaximumSumArray {

	public static void main(String[] args) {
		int a[] = {5,-2,3,4,5,-2,3 };
		int n = a.length;
		System.out.println(maxSum2(a,n));
		System.out.println(maxSum(a,n));

	}
	static int maxSum(int a[] , int n) {   //My Solution O(n)
		int sum[] = new int[n];
		sum[0] = a[0];
		for(int i=1 ; i<n ; i++) {
			sum[i] = a[i] + sum[i-1];
		}
		int result = tempMaxDiff(sum , n);
		return result;
	}
	static int tempMaxDiff(int a[] , int n) {
		int  currentmin = a[0];
		int maxDiff = a[1] - a[0];
		for(int i=1 ; i<n ;i++) {
			maxDiff = Math.max(Math.max(a[i] - currentmin , maxDiff) , a[i]);
			currentmin = Math.min(currentmin , a[i]);
		}
		return maxDiff;
	}
	
	static int maxSum2(int a[] , int n) {   //Best Solution O(n)
		int maxEnding = a[0];
		int maxSum = maxEnding;
		for(int i=1 ; i<n ;i++) {
			maxEnding = Math.max(a[i] , maxEnding + a[i] );
			maxSum = Math.max(maxSum , maxEnding);
		}

		return maxSum;
	}
}

	
