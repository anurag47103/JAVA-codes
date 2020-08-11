package patterns;
import java.util.Scanner;
public class Pattern7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);	
		int n = sc.nextInt();
		sc.close();
		//My solution
		for(int i=1 ; i<=n ; i++) {
			if (i<=2) {
				for (int j=1 ; j<=i ; j++) {
					System.out.print("* ");
				}
			}
				else if (i<=n-1) {
					System.out.print("* ");
					for ( int j=1 ; j<=i-2 ; j++) {
						System.out.print("  ");
					}System.out.print("* ");
				}
				else {
					for(int j=1 ; j<=n ; j++) {
					System.out.print("* ");
					}
				}System.out.println();
			}
		
		//Exact solution
		System.out.println("* ");
		for (int i=1 ; i<=n-2 ; i++) {
			System.out.print("* ");
			for (int j=1 ; j<i ; j++) {
				System.out.print("  ");
			}System.out.print("* ");
			System.out.println();
		
		}if (n>1) {
			for (int j=1 ; j<=n ;j++ ) {
				System.out.print("* ");
		}
	}
	}
}


//  *
//  * *
//  *   *
//  *     *
//  * * * * * 