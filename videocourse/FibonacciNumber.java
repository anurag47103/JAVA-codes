package videocourse;
import java.util.Scanner;
public class FibonacciNumber {

	public static void main(String[] args) {
		//fibonacci numbers
		//01123581324
		
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		int a=0,b=1;
		
		System.out.println(a);
		System.out.println(b);
		
		for(int i=number-2 ; i>0 ; i--) {
		int c = a+b;
		a=b;
		b=c;
		System.out.println(c);
		
		}

	}
}


