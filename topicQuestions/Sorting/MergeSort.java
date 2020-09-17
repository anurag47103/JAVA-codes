package topicQuestions.Sorting;

import java.util.Arrays;

public class MergeSort {

	public static void main(String[] args) {
		int arr[] = {10,5,30,15,7};
//		int arr[] = {12 , 11, 13 , 5, 6, 7 , 4};
		mergeSort(arr);

		System.out.println(Arrays.toString(arr)); 
		
	}
	
	public static void mergeSort(int arr[]) {
		mergeSorting(arr , 0 , arr.length-1);
	}
	
	public static void mergeSorting(int arr[], int l , int r) {
		
		if(r>l) {
			int mid = l + (r-l)/2;
			mergeSorting(arr , l , mid);
			mergeSorting(arr , mid+1 , r);
			merge(arr , l , mid , r);      
		}
	}
	
	public static void merge(int arr[] , int l ,int m ,  int r) {
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
				if(left[p1] <= right[p2]) arr[k++]=left[p1++];
				else arr[k++] = right[p2++];
			}
			while(p1<left.length) {
				arr[k++] = left[p1++];
			}
			while(p2<right.length) {
				arr[k++] = right[p2++];
			}
			
	}
	
}
