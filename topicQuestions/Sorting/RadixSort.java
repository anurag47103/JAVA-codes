package topicQuestions.Sorting;
import java.util.*;
public class RadixSort {

	public static void main(String[] args) {
		int arr[] = {232,6,8,319,50,100};
		radixSort(arr);
		System.out.println(Arrays.toString(arr));

	}
	public static void radixSort(int arr[]) {
		int max = Integer.MIN_VALUE;
		for(int i=0 ; i<arr.length ; i++) 
			max = Math.max(max , arr[i]);
		
		int k = 1;
	    while(max/k > 0) {
	    	countingSort(arr , k);
	    	k*=10;
	    }
	}
	
	public static void countingSort(int arr[] , int k) {
		int count[] = new int[10];
		for(int i =0 ; i<arr.length ; i++) {
			count[(arr[i]/k) % 10]++;
		}
		
		for(int i=1 ; i<10 ; i++) count[i] += count[i-1];
		
		int output[] = new int[arr.length];
		for(int i=arr.length-1 ; i>=0 ; i--) {
			output[count[(arr[i]/k) % 10] - 1] = arr[i];
			count[(arr[i]/k) % 10]--;
		}
	
		for(int i=0 ; i<arr.length ; i++) {
			arr[i] = output[i];
		}
		
 		
	}

}
