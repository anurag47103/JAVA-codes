package topicQuestions.Arrays;
import java.util.ArrayDeque;
public class SlidingWindowSum {

	public static void main(String[] args) {
		int a[] = {1 , 4 ,20 ,3 ,10 ,5};
		int sum = 33;
		int n = a.length;
		System.out.println(slidingWindowSum2(a , n , sum));
	}
	static boolean slidingWindowSum(int a[] , int n , int sum) {   //My Solution time O(n) and space O(n)
		ArrayDeque<Integer> window = new ArrayDeque<>();
		int tempSum = 0;
		for(int i=0 ; i<n ; i++) {
			if(tempSum < sum) {
				tempSum+=a[i];
				window.addLast(a[i]);
			}
			else if(tempSum > sum) {
				tempSum -= window.removeFirst();
				i--;
			}
			else return true;
			
		}
		return false;
	}
	
	static boolean slidingWindowSum2(int a[] , int n , int sum) {  //Best Solution time O(n) and space O(1)
																   //virtual window
		int start = 0;
		int tempSum = 0;
		for(int i=0 ; i<n ; i++) {
			if(tempSum < sum) {
				tempSum += a[i];
				
			}
			else if(tempSum > sum) {
				tempSum -= a[start];
				start++;
				i--;
			}
			else return true;
		}
		return false;
	}
}
