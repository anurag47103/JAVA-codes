package patterns;
import java.util.Scanner;
public class Pattern10 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int num1 =1;
		
		for(int i=1 ; i<=n ; i++) {
			for(int j=n/2 ; j>=num1 ;j--) {
				System.out.print("  ");
				
			}for(int j=1 ; j<=num1  ;j++) {
				System.out.print("* ");
			}System.out.println();
			if(i<=n/2) num1++;
			else num1--;
		}

}
}
//        *
//      * * 
//    * * *
//  * * * *
//* * * * *
//  * * * *
//    * * *
//      * *
//        *