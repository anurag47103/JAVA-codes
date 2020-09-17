package topicQuestions.Sorting;

import java.util.Arrays;

public class PartitionOfTheArray {

	public static void main(String[] args) {
		
		int arr[] = {3,8,7,6,12,10};
		hoaresPartition(arr , 0 , arr.length-1);
		System.out.println(Arrays.toString(arr));
			
	}
	
	public static void naivePartition(int arr[] , int p) {   //O(n) time with O(n) space (needed three traversal of array)
		int l=0;
		int h = arr.length-1;
		int temp[] = new int[arr.length];
		int index = 0;
		swap(arr , p , h);
		for(int i=l ; i<=h ; i++) {
			if(arr[i] <= arr[h]) {
				temp[index]=arr[i];
				index++;
			}
		}
		for(int i=l ; i<=h ; i++) {
			if(arr[i] > arr[h]) {
				temp[index] = arr[i];
				index++;
			}
		}
		for(int i=l ; i<=h ; i++) {
			arr[i] = temp[i-l];
		}
	}

	public static int lomutoPartition(int arr[] , int l, int h ) {   // O(n) time O(1) space
		int p = l + (int)( Math.random() * (h-l+1));
		swap(arr , p , h);
		int pivot = arr[h];
			
		int i = l-1;
		for(int j=l ; j<=h-1 ; j++) {
			if(arr[j] <= pivot) {
				i++;
				arr[i] = getItself(arr[j], arr[j] = arr[i]);  //Swapping arr[i+1] with arr[j]
			}
		}
		arr[i+1] = getItself(arr[h], arr[h] = arr[i+1]);  //  arr[h] and arr[i+1]
		return i+1;
	}
	
	public static int hoaresPartition(int arr[] , int l , int h) {
		int p = l + (int)( Math.random() * (h-l+1));  //selecting random pivot between l & h
		swap(arr , p , l);	//and swapping it to first position
		int pivot = arr[l];	
		int left = l-1;
		int right = h+1;
		
		
		while(true) {
			do {
				left++;
			}while(arr[left] < pivot);
			
			do {
				right--;
			}while(arr[right] > pivot);
			
			if(left >= right) return right;
				
			swap(arr , left , right);
		}
		
	}

	public static int getItself(int itself, int dummy) {
	    return itself;
	}
	
	static void swap(int[] array , int position1 , int position2) { 
		int temp = array[position1];  
		array[position1] = array[position2];  
		array[position2] = temp;  
	}
	
}
