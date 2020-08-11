package topicQuestions.Arrays;

public class MaximumLengthOfEvenOddSubarray {

	public static void main(String[] args) {
		int a[] = {10,12,14,7,8};
		int n = a.length;
		System.out.println(maxLength(a , n));

	}
	static int maxLength(int[] a,  int n) {
		boolean evenStarted = false;
		boolean oddStarted = false;
		int count=0;
		int maxCount = 1;
		for(int i=0 ; i<n ;i++) {
			if(a[i]%2 == 0 && evenStarted == false) {
				count++;
				evenStarted=true;
				oddStarted = false;
				maxCount = Math.max(maxCount , count);
				
			}
			else if(a[i]%2 == 0 && evenStarted) {
				count = 1;
			}
			else if(a[i]%2 != 0 && oddStarted == false) {
				count++;
				oddStarted = true;
				evenStarted = false;
				maxCount = Math.max(maxCount , count);
				
			}
			else if(a[i]%2 != 0 && oddStarted) {
				count =1;
			}
		}
		return maxCount;
	}
	static int maxLength2(int[] a,  int n) {
		
		int count=0;
		int maxCount = 1;
		for(int i=1 ; i<n ;i++) {
				if( (a[i]%2==0 && a[i-1]%2!=0) || (a[i]%2!=0 && a[i-1]%2==0)  ) {
					count++;
					maxCount = Math.max(maxCount , count);
				}
		}
		return maxCount;
	}
}
