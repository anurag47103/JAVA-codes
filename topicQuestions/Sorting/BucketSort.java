package topicQuestions.Sorting;
import java.util.*;
public class BucketSort {
	
	public static void main(String[] args) {
		
		int arr[] = {20,40,80,30,70};
		int k = 4;
		bucketSort(arr , k);
		System.out.println(Arrays.toString(arr));
	}
	
	public static void bucketSort(int arr[] , int k) {
		ArrayList<ArrayList<Integer>> bucket = new ArrayList<>();
		
		for(int i=0 ; i<k ; i++)
		bucket.add(new ArrayList<Integer>());
		
		int max = Integer.MIN_VALUE;
		for(int i=0 ; i<arr.length ; i++) {
			max = Math.max(max , arr[i]);
		}
		max++;
		
		for(int i=0 ; i<arr.length ; i++) {
			int bIndex = (k * arr[i])/max;
			bucket.get(bIndex).add(arr[i]);	
		}
		
		for(int i=0 ; i<k ; i++)
			Collections.sort(bucket.get(i));
	
		for(int i=0 ; i<k ; i++) {
			for(int j=0 ; j<bucket.get(i).size() ; j++) 
			arr[i] = bucket.get(i).get(j);
		}
	
	}
}
