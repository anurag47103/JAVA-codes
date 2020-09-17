package topicQuestions.Searching;
import java.awt.Point;
public class RepeatingElementInConsecutiveSortedArray {
//	static class Point {
//		int repeated_number;
//		int count;
//		
//		Point() {};
//		Point(int repeated_number , int count) {
//			this.repeated_number = repeated_number;
//			this.count = count;
//		}
//	}

	public static void main(String[] args) {
		int arr[] = {2,3,4,5,5};
		int n = arr.length;
		System.out.println(repeatingElement(arr , n).x + " " + repeatingElement(arr,n).y);

	}
	
	public static Point repeatingElement(int arr[] , int n) {
		int low = 0;
		int high = n-1;
		while(low<high) {
			int mid = low + (high-low)/2;
			if(arr[mid]==arr[0] + mid) low = mid + 1;   //left side has no repeating element
			else high = mid;
		}
		
		return new Point (arr[low] , n - (arr[n-1] - arr[0]) );
	} 

}

