package videocourse;

import java.util.Scanner;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class tripletsZeroSum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0) {
			int n =sc.nextInt();
			int a[] = new int[n];
			for(int i=0 ; i<n ;i++) {
				a[i] = sc.nextInt();
			}
			Triplet3 g = new Triplet3();
			if(g.findTriplets(a,n)) {
				System.out.println("1");
			}
			else System.out.println("0");
		}
		sc.close();
	}
	
}
	
	class Triplet3
	{
	    // Function to check if triplet is present 
	    // arr[]: input array
	    // n: size of the array
		public boolean findTriplets(int arr[] , int n) {
	        //add code here.
	        for(int i=0 ; i<n-2 ;i++) {
	            if(twoSum(Arrays.copyOfRange(arr, i+1, n) , -arr[i])) return true;
	        }
	        return false;
	   
	    
		}
		boolean twoSum(int a[] , int sum) {
		    Set<Integer> hs = new HashSet<>();
		    for(int i=0 ; i<a.length ; i++) {
		    	 hs.add(a[i]); 
		    	 if(hs.contains(sum-a[i])) return true;
		    }
		   return false;
		    
		}
	}


