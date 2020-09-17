package topicQuestions.Sorting;
import java.util.Arrays;
public class CountingSort {

	public static void main(String[] args) {
		int arr[] = {1,0,4,4,1,1};
		int k = 5;
		countingSort(arr , k);
		System.out.println(Arrays.toString(arr));
	}
	
	public static void countingSortNaive(int arr[] , int k) {
		int count[] = new int[k];
		for(int i=0 ; i<arr.length ; i++) {
			count[arr[i]]++;
		}
		int index = 0;
		for(int i=0 ; i<k ; i++) {
			for(int j=0 ; j<count[i] ; j++) {
				arr[index++] = i;
			}
		}
	}
	
	public static void countingSort(int arr[] , int k) {
		int count[] = new int[k];
		for(int i=0 ; i<arr.length ; i++) {
			count[arr[i]]++;
		}
		for(int i=1 ; i<k ; i++) {
			count[i] += count[i-1];
		}
		int output[] = new int[arr.length];
		for(int i=arr.length-1 ; i>=0 ; i--) {
			output[count[arr[i]]-1] = arr[i];
			count[arr[i]]--;
		}
		for(int i=0 ; i<arr.length ; i++) {
			arr[i] = output[i];
		}
	}

}
