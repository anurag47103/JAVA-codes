package topicQuestions.Searching;

public class RepeatingElement {

	public static void main(String[] args) {
		
		/*  Only one elements repeats (any number of times)
		 *  All elements from 0 to max(arr) are present
		 *  Arraysize >= 2
		 */    
		int arr[] = {0 , 2 , 1 ,3 , 2 , 2};
		int n = arr.length;
		System.out.print(repeatingElement(arr , n));

	}
	
	public static int repeatingElement(int arr[] , int n ) {  //O(n) time O(1) space ans no change to original array
		int slow = arr[0] + 1;
		int fast = arr[0] + 1;
		do {
			slow = arr[slow] + 1;
			fast = arr[arr[fast] + 1] + 1;
		}while(slow!=fast);
		
		slow = arr[0] + 1;
		while(slow!=fast) {
			slow = arr[slow] + 1;
			fast = arr[fast] + 1;
		}
		return slow - 1;
	}

}
