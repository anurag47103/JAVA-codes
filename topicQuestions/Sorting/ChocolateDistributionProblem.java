package topicQuestions.Sorting;

import java.util.Arrays;

public class ChocolateDistributionProblem {

	public static void main(String[] args) {
		int arr[] = {7,3,2,4,9,12,56};
		System.out.println(minDiff(arr , 3));
	}
	
	static int minDiff(int arr[] , int m) {
		if(m>arr.length) return -1;
		Arrays.sort(arr);
		int p1 = 0;
		int p2 = m-1;
		int minDiff = Integer.MAX_VALUE;
		while(p2<arr.length) {
			int diff = arr[p2++] - arr[p1++];
			minDiff = Math.min(minDiff , diff);
		}
		return minDiff;
	}

}
