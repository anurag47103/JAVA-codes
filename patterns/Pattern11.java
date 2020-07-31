package patterns;
import java.util.Scanner;
public class Pattern11 {

	public static void main(String[] args) {
		
		Scanner sc =new Scanner(System.in);
		int n= sc.nextInt();
		int num2=1;
		int num1=1;
			for(int i=1 ;i<=n ; i++) {
				for(int j=n/2 ; j>=num2 ; j--) {
					System.out.print("* ");
				}
				
				for(int j=1 ; j<=num1 ; j++ ) {
					System.out.print("  ");
					
				}
				for(int j=n/2 ; j>=num2 ; j--) {
					System.out.print("* ");
				}System.out.println();
				
				if(i<=n/2) num1 = num1 +2;
				else num1 = num1 - 2;
				
				if(i<=n/2) num2++;
				else num2--;
			}
		
	}

}
//* * *   * * *
//* *       * *
//*           *
//
//*           *
//* *       * *
//* * *   * * *