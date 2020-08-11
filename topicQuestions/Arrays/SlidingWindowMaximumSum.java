package topicQuestions.Arrays;
import java.util.ArrayDeque;
public class SlidingWindowMaximumSum {

	public static void main(String[] args) {
		int a[] = {1, 8, 30, -5, 20, 7};
		int n = a.length;
		int k = 3;
		slidingWindowMaximum(a , n , k);

	}
	static int slidingWindowMaxSum(int a[] , int n , int k) {
		int sum = 0;
		int maxSum = 0;
		for(int i=0 ; i<n ;i++) {
			if(i<k) sum += a[i];
			else sum += a[i] - a[i-k];
			maxSum = Math.max(maxSum , sum);
		}
		return maxSum;
	}
	static void slidingWindowMaximum(int a[] , int n, int k) {

		ArrayDeque<Integer> window = new ArrayDeque<>();
		window.add(0);
		for(int i=1 ; i<n ; i++) {
			
			if(window.getFirst() <= i-k) window.removeFirst();
			
			while(window.isEmpty() == false) {
				if(a[i] >= a[window.getLast()] ) {
					window.removeLast();
				}
				else {
					 window.addLast(i);
					 break;
				}
			}
			if(window.isEmpty()) window.add(i);
			
			if(i>=k-1) System.out.println(a[window.getFirst()]);
		}
	}
}
