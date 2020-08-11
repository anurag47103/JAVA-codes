package topicQuestions.Arrays;

public class MaximumDifference {

	public static void main(String[] args)  {    
		int a[] = {10,9,5,2,-1,2};       
		int n = a.length;     
		System.out.println(maximumDiff3(a , n ));
		           

	}
	static int maximumDiff(int[] a , int n) {    //Naive Solution O(n^2)
		int max = Integer.MIN_VALUE;
		for(int i=0 ; i<n ;i++) {
			for(int j=i+1 ; j<n ;j++) {
				if( (a[j] - a[i]) > max ) max = a[j] - a[i];
			}
		}
		return max;
	}
	
	static int maximumDiff2(int[] a , int n , int low , int high) {  //My Solution O(n)
		
		int max = a[high] - a[low];
		
		for(int i=2 ; i<n ;i++) {
			if(max<0) {
				high++;
				low++;
				if(high>=n) continue;
				if(a[high] - a[low] > max) max = a[high] - a[low]; 
			}
			if(a[i] > a[high]) {
				high = i;
				if(a[high] - a[low] > max)  max = a[high] - a[low]; 
			}
			else if(a[i] < a[low]) {
				low = i;
				if(low>=n-1) continue;
				high = low+1;
				if(a[high] - a[low] > max)  max = a[high] - a[low];
			}
			
			
		}
		return max;
	}

	public static int maximumDiff3(int[] a , int n ) {  //Best Solution O(n)
		int max = a[1] - a[0];
		int minValue = a[0];
		
		for(int j=1 ; j<n ; j++) {
			
			max = Math.max(a[j] - minValue , max);
			minValue = Math.min(minValue , a[j]);
		}
		
		return max;
	}
}
