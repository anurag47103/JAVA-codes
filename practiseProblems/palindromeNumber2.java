package practiseProblems;
import java.util.Scanner;
import java.lang.Math;
public class palindromeNumber2 {

	public static void main(String[] args) {
			
		//checking a Palindrome number
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the number");
		int num = sc.nextInt();
		
		int temp = num;
		int l = (int)Math.log10(num)+1;
		int reverse = 0;
		
		for(int i=0 ; i<l ; i++) {
			int lastDigit = temp%10;
			temp/=10;
			reverse += lastDigit*(int)Math.pow(10,l-i-1);
			
			
		}
		System.out.println(reverse);
		if(num==reverse) System.out.println("it is a Palindrome number");
		else System.out.println("not a Palindrome number");
		sc.close();
	}

}
