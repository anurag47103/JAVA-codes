package topicQuestions.Searching;

public class SearchInInfiniteSortedArray {

	public static void main(String[] args) {
		int arr[] = {1,2,3,4,30,40,50,70,100,120,245,342,546,765,789,878};
		int find = 878;
		System.out.println(search2(arr , find));

	}
	
	static int search(int arr[] ,int find) {  //Naive Solution O(position)
		int i = 0;
		while(arr[i] <= find) {
			if(arr[i]==find) return i;
			i++;
		}
		return -1;
		
	}
	
	static int search2(int arr[] , int find) {  //O(log(position))
		int i=0;
		int low = 0;
		int high = 0;
		while(i<arr.length) { 
			if(arr[i] == find) return i;
			else if(arr[i] < find) {
				if(i==0) i++;
				else i*=2;
			}
			else {
				high = i;
				break;
			}
		}
		if(high==0) high = arr.length;
		while(low <= high) {
			int mid = (low+high)/2;
			if(arr[mid] == find) return mid;
			else if(arr[mid] < find) low = mid + 1;
			else high = mid - 1;
		}
		return -1;
	}
}
