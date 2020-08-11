package practiseProblems;

import java.util.Scanner;

public class DigitProblem {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
	    long x = sc.nextLong();
	    int k = sc.nextInt();
	    int l = (int)Math.log10(x) +1;
	    long a[] = new long[l];
	    
	    for(int i=0 ;i<l ; i++) {
	        a[l-1-i]=x%10;
	        x/=10;
	    }
	    for(int i=0 ; i<k ;i++) {
	        a[i] = 9;
	    }
	    
	    for(long item :a){
	        System.out.print(item);
	    }
	    sc.close();
	}
	}


	


