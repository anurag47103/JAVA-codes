package videocourse;
import java.util.Scanner;
public class MatrixMultiplication {

	public static void main(String[] args) {
			
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter row and coloumn of a");
		int rowsOfa = sc.nextInt();
		int colsOfa = sc.nextInt();
		System.out.println("Enter coloumn of b");
		int colsOfb = sc.nextInt();
		
		int a[][] = new int[rowsOfa][colsOfa];
		int b[][] = new int[colsOfa][colsOfb];
		int c[][] = new int[colsOfa][colsOfb];
		System.out.println("Enter elements of a: ");
		for (int i=0 ; i<rowsOfa ; i++) {
			for (int j=0 ; j<colsOfa ; j++) {
				a[i][j] = sc.nextInt();
			}
		}
		
		System.out.println("Enter elemenats of b: ");
		for (int i=0 ; i<colsOfa ; i++) {
			for (int j=0 ; j<colsOfb ; j++) {
				b[i][j] = sc.nextInt();
			}
		}
		
		for(int i=0 ; i<colsOfa ; i++) {
			for(int j=0 ; j<colsOfa ;j++) {
				c[i][0] = c[i][0] + a[i][j] * b[j][0]; 
			}
		}
		
		System.out.println("Elements of c: ");
		for (int i=0 ; i<colsOfa ; i++) {
			for (int j=0 ; j<colsOfb ; j++) {
				System.out.print(c[i][j] + " ");
			}System.out.println();
		}
		
		sc.close();
	}

}