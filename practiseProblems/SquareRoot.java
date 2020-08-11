package practiseProblems;
import java.util.Scanner;
public class SquareRoot {

	public static void main(String[] args) {
				
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		
		double sqrt1=0;
		int sqrt = 0;
		
		if(num==1) System.out.println("1");
		else {
			
			for(int i=1 ; i<=num/2 ; i++) {
				int rem = num%i;
				int num2 = num/i;
				
				if(rem==0 && num2==i) {
					 sqrt = i;
					break;
				}
			}
			
			if(sqrt!=0) System.out.println(sqrt);
			else {
			
				for( double j=0; j<=num ; j+=.000001) {
					double num2 = num/j;
					double num3 = num2/j;
					if(num3>0.9999991 && num3<1.0000001 ) {
						 sqrt1 = j;
						break;
					}
					
				}System.out.println(sqrt1);
			}
		}
		sc.close();
	}
}