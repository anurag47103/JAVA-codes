package topicQuestions.Arrays;

public class RotateAnArray {

	public static void main(String[] args) {
				
		int a[] = {3 ,2 ,5 ,6, 0};
		int d = 3;
		int n = a.length;
		
		int b[] = rotate3(a , n , d);
		
		for(int item:b) {
			System.out.println(item);
		}
	}
	
	static int[] rotate1(int[] a , int n , int d) {
		while(d-->0) {
			int temp = a[0];
			for(int i=1 ; i<n ; i++) {
				a[i-1] = a[i];
				
			}
			a[n-1] = temp;
		}
		return a;
	}
	
	static int[] rotate2(int[] a , int n , int d) {
		int temp[] = new int[d];
		for(int i=0 ; i<d ;i++) {
			temp[i] = a[i];
		}
		for(int i=d ; i<n ;i++) {
			a[i-d] = a[i];
		}
		int j=0;
		for(int i=n-d ; i<n ; i++) {
			a[i] = temp[j];
			j++;
		}
		return a;
	}

	static int[] rotate3(int[] a , int n , int d) {      //best solution O(n) time and O(1) space
		
		reverse(a , 0 , n-d);
		reverse(a , d , n-1);
		reverse(a , 0 , n-1);
		return a;
	}
	
	static int[] reverse(int[] a , int low , int high) {
		while(low<high) {
			int temp = a[low];
			a[low] = a[high];
			a[high] = temp;
			low++;
			high--;
		}
		return a;
	}
}
