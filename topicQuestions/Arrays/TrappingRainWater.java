package topicQuestions.Arrays;

import java.util.*;

public class TrappingRainWater {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a[] = new int[n];
		for(int i=0 ; i<n ;i++) {
			a[i] = sc.nextInt();
		}
		
		System.out.println(rainWater2(a,n));
		sc.close();
	}
	
	
	
	
	static int rainWater1(int a[] , int n) {     //Naive Solution O(n^2)
		int res = 0;
		for(int i=1 ; i<n-1 ; i++) {
			int lmax = a[i];
			for(int j=0 ; j<i ;j++)	lmax = Math.max(lmax , a[j]);

			int rmax = a[i];   
			for(int j=i+1 ; j<n ;j++) rmax = Math.max(rmax , a[j]);
			
			res += Math.min(rmax,lmax) - a[i];
		}
		return res;
	}

	static int rainWater2(int a[] , int n) {	//Best Solution O(n)
		int res = 0;
		int[] lmax = new int[n];
		int[] rmax = new int[n];
		lmax[0] = a[0];
		for(int i=1 ; i<n ; i++) {
			lmax[i] = Math.max(a[i] , lmax[i-1]);
		}
//		for(int item : lmax) System.out.print(item + " ");
//		System.out.println();
		rmax[n-1]=a[n-1];
		for(int i=n-2 ; i>=0 ;i--) {
			rmax[i] = Math.max(a[i] , rmax[i+1]);
		}
//		for(int item:rmax) System.out.print(item + " ");
//		System.out.println();
		for(int i=1 ; i<n-1 ;i++) {
		res += Math.min(rmax[i] , lmax[i]) - a[i];
//		System.out.println(Math.min(rmax[i] , lmax[i]) - a[i] + " ");
		}
		return res;
	}
} 
//12
//3 4 4 6 0 6 6 1 8 4 9 6

//10
//6 1 8 9 2 7 9 5 4 2

//12
//5 0 2 1 3 2 6 2 3 2 1 2