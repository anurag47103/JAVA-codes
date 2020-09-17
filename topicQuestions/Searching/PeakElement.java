package topicQuestions.Searching;

public class PeakElement {

	public static void main(String[] args) {
		int arr[] = {5,20,40,30,20,50,60};
		int n = arr.length;
		System.out.println(peakElement(arr , n));
  
	}
	static int peakElement(int arr[] , int n) {   // O(logn)
		int low = 0;
		int high = arr.length - 1;
		while(low <= high) {
			int mid = (high+low) / 2;
			if( (mid==0 || arr[mid] > arr[mid-1] )&&(mid ==n-1 || arr[mid] > arr[mid+1]) ) return arr[mid];
			
			if(mid>0 && arr[mid-1] > arr[mid]) high = mid - 1;
			else low = mid + 1;
		}
		return -1;
	}
}
