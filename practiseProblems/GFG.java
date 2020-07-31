package practiseProblems;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class GFG {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0) {
		int n = sc.nextInt();
		int x = sc.nextInt();
		int a[] = new int[n];
		
		for(int i=0 ;i<a.length ;i++) {
		    a[i] = sc.nextInt();
		}
		
		Triplet2 g = new Triplet2();
			if(g.findTriplets(a,n,x)) {
				System.out.println("1");
			}
			else System.out.println("0");
		}
	}
}
class Triplet2 {
		public boolean findTriplets(int arr[] , int n , int x) {
	        //add code here.
	        for(int i=0 ; i<n-2 ;i++) {
	            if(twoSum(Arrays.copyOfRange(arr, i+1, n) , x-arr[i])) return true;
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