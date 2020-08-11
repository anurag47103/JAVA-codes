package patterns;
import java.util.Scanner;
public class Pattern12 {

	public static void main(String[] args) {
			
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.close();
		
		int num1 =-1;
		int num2 =1;
		for (int i=1; i<=n ; i++) {
			for( int j=n-1 ; j>=i ;j--) {
				System.out.print("  ");
			}System.out.print(num2 + " ");
			
			for(int j=1 ; j<=num1 ; j++) {
				System.out.print("0 ");
				
			}if(i>1) System.out.print(num2 + " ");
			System.out.println();
			num1 = num1 +2;
			num2++;
		}
		
	}

}

//        1 
//      2 0 2
//    3 0 0 0 3
//  4 0 0 0 0 0 4
//5 0 0 0 0 0 0 0 5  
