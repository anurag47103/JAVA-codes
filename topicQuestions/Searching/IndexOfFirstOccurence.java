package topicQuestions.Searching;

public class IndexOfFirstOccurence {

	public static void main(String[] args) {
		
		int a[] = {1,10,10,10,20,20,40};
		int find = 10;
		System.out.println(firstIndex(a , find));
	}
	
	public static int firstIndex(int a[] , int find) {    //O(logn)
		int low = 0;
		int high = a.length-1;
		int mid;
		while(low <= high) {
			mid = (high + low) / 2;
			if(a[mid] < find) low = mid + 1;
			else if(a[mid] > find) high  = mid -1 ;
			else {
				if(mid == 0 || a[mid - 1] != a[mid]) return mid;
				else high = mid - 1;
			}
		}
		return -1;
	}

}
