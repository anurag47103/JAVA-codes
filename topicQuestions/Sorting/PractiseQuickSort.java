package topicQuestions.Sorting;
import java.util.*;
public class PractiseQuickSort {

	public static void main(String[] args) {
		int arr[] = {5,3,7,34,21,23,8,13,19,2,65};
		quickSortByHoarePartition(arr , 0 , arr.length-1);
		System.out.println(Arrays.toString(arr));

	}
	public static void quickSortByLomutoPartition( int arr[] , int l , int h) {
		if(l>=h) return;
		int p = lomutoPartition(arr , l , h);
		quickSortByLomutoPartition(arr , l , p-1);
		quickSortByLomutoPartition(arr , p+1 , h);
	}
	
	public static void quickSortByHoarePartition( int arr[] , int l , int  h) {
		if(l<h) {
			int p = hoaresPartition(arr , l , h);
			quickSortByHoarePartition(arr , l , p);
			quickSortByHoarePartition(arr , p+1 , h);
		}
	}
	
	public static int lomutoPartition(int arr[] , int l , int h) {
		int p = l + (int)( (h-l+1) * Math.random());
		swap(arr , h , p);
		int pivot = arr[h];
		int i = l-1;
		
		for(int j=l ; j<h; j++) {
			if(arr[j]<pivot) {
				i++;
				swap(arr , j , i);
			}
		}
		i++;
		swap(arr, i , h);
		return i;
	}
	
	public static int hoaresPartition(int arr[] , int l , int h) {
//		int p = l + (int)( (h-l+1) * Math.random());
//		swap(arr , l , p);
		int pivot = arr[l];
		int i = l-1;
		int j = h+1;
		
		while(i<j) {
			do {
				i++;
			}while(arr[i]<pivot);
			
			do {
				j--;
			}while(arr[j]>pivot);
			
			
			swap(arr , i , j);
			
		}
		return i;
		
		
	}
	
	public static void swap( int arr[] , int pos1 , int pos2) {
		int temp = arr[pos1];
		arr[pos1] = arr[pos2];
		arr[pos2] = temp;
	}
	
	

}
