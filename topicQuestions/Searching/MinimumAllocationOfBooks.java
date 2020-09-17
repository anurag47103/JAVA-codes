package topicQuestions.Searching;

public class MinimumAllocationOfBooks {

	public static void main(String[] args) {
		int arr[] = {12,34,67,90};
		int n = arr.length;
		int m = 2;
		System.out.println(maximumPages(arr , n , m));
	}
	
	public static int maximumPages(int arr[] , int n , int m) {
		 int sum = 0;
		    int max_element = 0;
		    for(int i=0 ; i<n ; i++) {
		      sum += arr[i];
		      max_element = Math.max(arr[i] , max_element);
		    } 
		    int start = max_element;
		    int end = sum;
		    int res = -1;
		    while(start<=end) {
		        int mid = start + (end-start)/2;
		        if(isValid(arr , n , m ,mid) ){
		            end = mid - 1;
		            res = mid;
		        } 
		        else start = mid + 1;
		    }
		    return res;
	}
	
	public static boolean isValid(int a[] , int n , int m , int k) {
	    int students = 1;
	    int current_pages = 0;
	    
	    for(int i=0 ; i<n ;i++) {
	        if(current_pages + a[i] <= k) current_pages += a[i];
	        else {
	            current_pages = a[i];
	            students++;
	        }
	        if(students>m) return false;
	    }
	    
	    return true;
	}
}
