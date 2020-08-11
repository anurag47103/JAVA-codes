package patterns;
import java.util.Scanner;
public class Pattern8 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.close();
		
		for ( int i=0 ; i<=n-1 ; i++) {
			for (int j=1 ; j<=2*i ; j++) {
				System.out.print("  ");
			}
			for (int j=1 ; j<=n-i ; j++) {
				System.out.print("* ");
		}System.out.println();
		
		
	}
	}
}

//* * * * *
//    * * * *
//        * * *
//            * *
//                *