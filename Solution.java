import java.util.Scanner;

public class Solution {
		static int missing , repeated;
   public static void main(String[] args) {
	   
	  	Scanner sc = new Scanner(System.in);
			int t = sc.nextInt();
			
			while(t-->0) {
	        int n = sc.nextInt();
	        int arr[] = new int[n];
	        for(int i=0 ; i<n ;i++) {
	            arr[i] = sc.nextInt();
	        }
	        int k = n+1;
	        for(int i=0 ; i<n ;i++) {
	        	arr[arr[i]%k - 1] += k; 
	        }
	        for(int i=0 ; i<n ;i++) {
	        	if (arr[i]/k == 0) missing = i+1;
	        	if(arr[i]/k == 2) repeated = i+1;
	        }
	        System.out.println(repeated + " " + missing); 
			}
   }
}
