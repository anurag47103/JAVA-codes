package topicQuestions.Searching;

public class BinarySearch {

	public static void main(String[] args) {
		int a[] = {10,15};
		
		int find = 20;
		System.out.println(binarySearch(a,find));
		System.out.println(binarySearchByRecursion(a,find));
		
	}
	public static int binarySearch(int a[] ,int find) {
		int n = a.length;
		int low = 0;
		int high = n-1;
		int mid;
		while(low<=high) {
			mid = (high + low)/2;
			if(a[mid] < find) low = mid +1;
			else if(a[mid] > find) high = mid -1;
			else return mid;
		}
		return -(low+1);
	}
	static int binarySearchByRecursion(int a[] , int find) {
		int n = a.length;
		return binarySearchRecursion(a , find , 0 , n-1);
	}
	
	static int binarySearchRecursion(int a[] , int find , int low , int high) {
		int mid = (high + low) / 2;
		if(low>high) return -1;
		if(a[mid] < find ) return binarySearchRecursion(a , find, mid+1 , high);
		else if(a[mid] > find) return binarySearchRecursion(a , find , low, mid-1);
		else return mid;
	}
}
