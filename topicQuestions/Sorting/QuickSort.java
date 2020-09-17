package topicQuestions.Sorting;

import java.util.Arrays;

public class QuickSort {

	public static void main(String[] args) {
//		int arr[] = {3,8,7,6,12,10};
		int arr[] = {9,8,7,6,5,4,3,2,1};
		quickSortLomutoByTailRecursion(arr , 0 , arr.length - 1);
		System.out.println(Arrays.toString(arr));

	}
	
	public static void quickSortLomutoByTailRecursion(int arr[] , int l , int h) {
		while(l<h) {
			int p = PartitionOfTheArray.lomutoPartition(arr , l , h);
			quickSortLomuto(arr , l , p-1);
			l = p + 1;
		}
	}
	
	public static void quickSortLomuto(int arr[] , int l , int h) {
		if(l<h) {
			int p = PartitionOfTheArray.lomutoPartition(arr , l , h);
			quickSortLomuto(arr , l , p-1);
			quickSortLomuto(arr, p+1 , h);
		}
	}
	
	public static void quickSortHoareByTailRecursion(int arr[] , int l , int h) {
		while(l<h) {
			int p = PartitionOfTheArray.hoaresPartition(arr , l , h);
			quickSortHoareByTailRecursion(arr , l , p);
			l = p + 1;
		}
	}
	
	public static void quickSortHoare(int arr[] , int l , int h) {
		if(l<h) {
			int p = PartitionOfTheArray.hoaresPartition(arr , l , h);
			quickSortHoare(arr , l , p);
			quickSortHoare(arr, p+1, h);
		}
	}
}
