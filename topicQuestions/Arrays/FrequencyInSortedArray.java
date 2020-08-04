package topicQuestions.Arrays;

import java.util.ArrayList;

public class FrequencyInSortedArray {

	public static void main(String[] args) {
				
			int[] a = {10,10,20,30,30};
			int n = a.length;
			frequency(a , n);
		}
	
	static void frequency(int[] a , int n) {
		int i=1;
		int freq=1;
		while(i<n) {
			while(i<n && a[i]==a[i-1]) {
				freq++;
				i++;
			}
			
			System.out.println(a[i-1] + " " + freq);
			if(i==n-1) System.out.println(a[i] + " " +freq);
			i++;
			freq=1;
		}
	}

}
