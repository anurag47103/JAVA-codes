package practiseProblems;

import java.util.Scanner;

public class MinimumCost {

	public static void main(String[] args) throws Exception {
		
		
		Scanner sc = new Scanner(System.in);
	       int n = sc.nextInt();
	       int k = sc.nextInt();
	       int arr[] = new int[n];
	       for(int i=0 ; i<n ; i++) {
	           arr[i] = sc.nextInt();
	       }
	       System.out.print(Solve(k , arr));
	   //    sc.close();
	    }
	static long Solve(int k, int[] arr){				
	        // Write code here
		int n = arr.length;
		int j=0;     //j will point to negative numbers
		
		for(int i=0; i<n ;i++) {      //i will point to positive numbers
			if(arr[i] <=0) continue;
			
			while(i-j>k) j+=1;      //j will increment if distance between i & j becomes more than k
			
			while(arr[i]>0 && Math.min(n-1,j) <=i+k) {  //if the positive number becomes less than 0
				if(arr[j] >= 0) { 						//j should be less than i + k
					j++;								//j should not cross the array length
					continue;
				}
				
				int temp = Math.min(arr[i],Math.abs(arr[j]));
				arr[i] -= temp;
				arr[j] += temp;
				
				if(arr[j] >= 0) j++;
				
			}
		}
		 
	    
	     long sum = 0;
	     for(int i=0 ; i<n ;i++) {
	    	 sum+=Math.abs(arr[i]);
	     }
	     return sum;

	}
	
	
}
