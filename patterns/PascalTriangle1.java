package patterns;
import java.util.Scanner;
public class PascalTriangle1 {

	public static void main(String[] args) {
			
		Scanner sc = new Scanner(System.in);
		
		int line = sc.nextInt();
		sc.close();
		for(int i=0 ; i<line ; i++) {
			
			for(int j=0 ; j<line-i-1 ;j++ ) System.out.print(" ");
			
			for(int j=0 ; j<=i ; j++) {
				System.out.print(binomialCoeff(i,j) + " ");
			}
			System.out.println();
		}
	}
	
	
	
	static int binomialCoeff(int n, int k) {
	     
	        int res = 1; 
	          
	        if (k > n - k) 
	        k = n - k; 
	              
	        for (int i = 0; i < k; i++) 
	        { 
	            res *= (n - i); 
	            res /= (i + 1); 
	        } 
	        return res; 
	    } 
	}
		



