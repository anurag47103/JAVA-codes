package topicQuestions.Sorting;

import java.util.Arrays;

public class Segregate0s1s2sInAnArray {

	public static void main(String[] args) {
		int arr[] = {0,1,0,0,2,2,1,0,1,0,2};
		segregate(arr);
		System.out.println(Arrays.toString(arr));

	}
	
	public static void segregate(int arr[]) {
		int l = 0;
		int m = 0;
		int h = arr.length-1;
		
		while(arr[l] == 0) l++;
		l--;
		m=l+1;
		while(arr[h] == 2) h--;
		h++;
		
		
		while(m<h) {
		
			if(arr[m]==1) m++;
			
			
			if(m<h && arr[m]==2) {
				h--;
				swap(arr , m , h);
				
			}
			if(arr[m]==0) {
				l++;
				swap(arr , m , l);
				
			}
		}
	}

	public static void segregate2(int arr[]) {
		int l = 0;
		int m = 0;
		int h = arr.length - 1;
		
		while(m<=h) {
			
			switch (arr[m]) {
			
			case 0:  
				swap(arr , m , l);
				l++;
				m++;
				break;
		
			case 1:
				m++;
				break;
				
			case 2: 
				swap(arr , m , h);
				h--;
				break;
			}
		}
	}
	
	public static void swap(int arr[] , int pos1 , int pos2) {
		int temp = arr[pos1];
		arr[pos1] = arr[pos2];
		arr[pos2] = temp;
	}
}
