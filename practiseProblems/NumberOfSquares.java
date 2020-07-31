package practiseProblems;

import java.util.Scanner;

public class NumberOfSquares {

	public static void main(String[] args) {

		
		


		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		int n = sc.nextInt();

		//		System.out.println(gcd(a,b));
//		Math.floor(a);
//	}
//	public static int gcd(int a , int b) {
//		if(a==0) return b;  								//HCF
//		else return gcd(b%a , a);
		
		
		GP obj1 = new GP();
		System.out.println(obj1.termOfGP(a , b ,n));
     
  }
   

	}
class GP 
{
    
    public double termOfGP(int A,int B,int N)
    {
        //Your code here
         if(N==1) return A;
    else if(N==2) return B;
    else {
        // return A + (N-1)*(B-A) ;
    	System.out.println(B/A);
    	System.out.println(N-1);
        return A * Math.pow((double)B/(double)A , N-1);
    }
    }

}
