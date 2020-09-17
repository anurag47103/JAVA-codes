package topicQuestions.Searching;

public class SearchInSortedRotatedArray {

	public static void main(String[] args) {
		
		int arr[] = {100,200,300,400,20,30,40};
		int find = 20;
		System.out.println(search(arr , find));
		System.out.println(search2(arr , find));
	}
	static int search(int arr[] , int find) {    //My Soution O(logn) not recomended formed by hit and try logics
		int low = 0;
		int high = arr.length-1;
		
		while(low <= high) {
			int mid = (low+high)/2;
			if(arr[mid] == find) return mid;
			else if(arr[mid] < find && arr[mid]>arr[0]) low = mid + 1;
			else if(arr[mid] < find && arr[mid]<arr[0] && find > arr[0]) high = mid - 1;  
			else if(arr[mid] < find && arr[mid]<arr[0] && find < arr[0]) low = mid + 1;
			
			if(arr[mid] > find && arr[mid] > arr[0] && find<arr[0]) low = mid + 1;
			else if(arr[mid] > find && arr[mid] < arr[0] && find<arr[0]) high = mid - 1;
			else if(arr[mid] > find && find > arr[0]) high = mid - 1;
			
		}
		return -1;
	}
	
	static int search2(int arr[] , int find) {  //Best Solution O(logn)
		int low = 0;
		int high = arr.length-1;
		
		while(low <= high) {
			int mid = (low+high)/2;
			if(arr[mid] == find) return mid;
			
			if(arr[mid] >  arr[0]) {     //Left side is sorted
				if(find < arr[mid] && find >= arr[low]) high = mid - 1; //to check if find is in the left side i.e between arr[low] to arr[mid-1]
				else low = mid + 1;
			}
			else {						//Right half sorted
				if(find > arr[mid] && find <= arr[high]) low = mid + 1; //to check if find is in the right side as right side is now sorted i.e between arr[mid+1] to arr[high]
				else high = mid - 1;
			}
		}
		return -1;
	}
}
