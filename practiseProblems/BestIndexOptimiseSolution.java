package practiseProblems;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;


public class BestIndexOptimiseSolution {
		
	public static void main(String[] args) throws Exception {
		
		Scanner sc = new Scanner(System.in);
		int l = sc.nextInt(); 
		
		
		int num[] = new int[l];
		for(int i=0 ; i<l ; i++) {
			num[i] = sc.nextInt();
		}
		
		long NumSum[] = new long[l];
		long tempSum = 0;
		for(int i=0 ; i<l ;i++) {
			NumSum[i] = num[i] + tempSum;
			tempSum = NumSum[i];
		}
		
			
		long sum = 0;
		long max = Long.MIN_VALUE;
		
		for(int i=0 ; i<l ;i++) {
			if(i!=0) sum = NumSum[lastIndex(l,i)] -  NumSum[i-1];
			else sum = NumSum[lastIndex(l,i)] ;
			
			if(sum>max) max = sum;
		}
		System.out.println(max);
	}	

	static int lastIndex(int numOfElements , int currentIndex) {
		
		int steps = (int)((Math.sqrt(8*(numOfElements - currentIndex)+1)-1)/2);
		int numOfSumElement = (steps*(steps+1)) / 2;
		int lastIndex = currentIndex + numOfSumElement -1;
		return lastIndex;
	}
			
}

