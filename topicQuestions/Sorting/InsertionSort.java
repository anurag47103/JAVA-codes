package topicQuestions.Sorting;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class InsertionSort {
	
	public static void main(String[] args) throws NumberFormatException, IOException {
//		int arr[] = {10, 5, 3, 9, 2};
		
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		while(t-->0) {
		    String v = br.readLine();
		    String[] s2 = v.split(" ");
		    int n = Integer.parseInt(s2[0]);
		    int k = Integer.parseInt(s2[1]);
			String s = br.readLine();
			int arr[] = new int[n];
			String[] s1 = s.split(" ");
			for(int i=0 ; i<n ; i++) {
				arr[i] = Integer.parseInt(s1[i]);
			}
			
			if(n>1) sortABS(arr , n , k);
			System.out.println(Arrays.toString(arr));
		}
	}
	
	static void sortABS(int arr[], int n,int k) {
      
      for(int j=1 ; j<n ;j++) {
          int key = arr[j];
          int i=j-1;
          while(i>=0 && (  Math.abs(k-arr[i]) > Math.abs(k-key)  )) {
              arr[i+1] = arr[i];
              i--;
          }
          arr[i+1] = key;
      }
        
    }
}
