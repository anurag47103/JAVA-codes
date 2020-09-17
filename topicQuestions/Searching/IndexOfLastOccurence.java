package topicQuestions.Searching;

public class IndexOfLastOccurence {

	public static void main(String[] args) {
		int a[] = {1,10,10,15,20,20,40};
		int find = 10;
		System.out.println(lastIndex(a , find));
		
	}
	static int lastIndex(int a[] , int find) {   // O(logn)
		int low = 0;
		int high = a.length-1;
		int mid;
		while(low <= high) {
			mid = (high + low) / 2;
			if(a[mid] < find) low = mid + 1;
			else if(a[mid] > find) high  = mid -1 ;
			else {
				if(mid == a.length-1 || a[mid + 1] != a[mid]) return mid;
				else low = mid +1;
			}
		}
		return -1;
	}
}
