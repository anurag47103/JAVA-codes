package topicQuestions.Sorting;

public class CountInversionsInArray {

	
	public static void main(String[] args) {
		
		int arr[] = {2,4,1,3,5};
		System.out.println(inversions(arr , 0 , arr.length-1));
	}
	
	public static int inversions(int arr[] , int l , int r) {
		int res = 0;
		if(r>l) {
			int m = l + (r-l)/2;
			res += inversions(arr , l , m);
			res += inversions(arr , m+1 , r);
			res += countInversions(arr , l , m , r);
		}
		return res;
	}
	
	public static int countInversions(int arr[] , int l , int m , int r) {
		int res = 0;
		int left[] = new int[m-l+1];
		int right[] = new int[r-m];
		
		for(int i=0 ; i<left.length ;i++) {
			left[i] = arr[l+i];
		}
		for(int i=0 ; i<right.length ;i++) {
			right[i] = arr[m+1+i];
		}
		int k=l;
		int p1 = 0;
		int p2 = 0;
		
		while(p1<left.length && p2<right.length) {
			
			if(left[p1] == right[p2]) arr[k++]=left[p1++];
			
			else if(left[p1] < right[p2]) {
				arr[k++]=left[p1++];
			}
			
			else {
				System.out.println(arr[k] + " " + right[p2]);
				arr[k++] = right[p2++];
				res=res + (left.length-p1);  /* if left[p1] > right[p2] then all the elements after
												the p1 index will be greater than p1 element as its sorted
												and hence will be greater than the right[p2] element
											*/	
			}
		}
		while(p1<left.length) {
			arr[k++] = left[p1++];
		}
		while(p2<right.length) {
			arr[k++] = right[p2++];
		}
		
		return res;
	}
}
