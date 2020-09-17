package topicQuestions.Searching;

public class TwoPointerSum {

	public static void main(String[] args) {
		int arr[] = {3,5,6,8,12,13};
		int sum = 15;
		System.out.println(findSuminSorted(arr , sum , 0));
		System.out.println(findTriplet(arr , sum));

	}
	static boolean findSuminSorted(int arr[] , int sum , int low) {
		int n = arr.length;
	//	int low = 0;
		int high = n-1;
		while(low<high) {
			if(arr[low] + arr[high] == sum ) return true;
			else if(arr[low] + arr[high] < sum) low++;
			else high--;
		}
		return false;
	}
	
	static boolean findTriplet(int arr[] , int sum) {
		for(int i=0 ; i<arr.length ; i++) {
			if(findSuminSorted(arr , sum - arr[i] , i+1)) {
				return true;
			}
			
		}
		return false;
	}
}
