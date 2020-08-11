package videocourse;
import java.util.Scanner;
public class PalindromeNumber {

	public static void main(String[] args) {
		
		//To check whether a number is palindrome or not
		//example 54677645 , 6556 , 232 , 2332 , 44
		
		//My solution
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int temp =n;
//		int[] num = new int[200];
//		boolean isPalindrome = true;
//		int i=1;
//		int l=(int)Math.log10(n)+1;
//		
//		while(temp>0) {  
//			
//			num[i] = temp % 10;
//			temp/=10;
//			i++;
//		
//	} i=1;
//		for (int k=0;k<=l/2;k++) {
//		  if (!(num[i+k]==num[l-k])) {
//			  isPalindrome = false;
//			  }
//		}
//		System.out.println("isPaindrome " + isPalindrome);
//	
//		//My solution after watching half the vedio 
//		int r = 0;
//		int[] lastDigit = new int[200] ;
//		
//		while (temp>0) {
//			lastDigit[i] = temp % 10;
//			temp/=10;
//			i++;
//		}   i = 3;
//			r = r + lastDigit[1] * 10 + lastDigit[2];
//		
//		while(i<=l) {
//			r = r *10 +lastDigit[i];
//			i++;
//			}
//		
//		System.out.println(r);
//		
//		if (r==n)  System.out.print("it is a palindrome number");
//		else System.out.println("its not a palindrome number");
			
		//Exact solution
		temp = n;
		int reverseNumber = 0;
		
		
		while (temp >0) {
			int lastDigit2 = temp % 10;
			reverseNumber = reverseNumber * 10 + lastDigit2;
			temp /= 10;
		}
		System.out.println(reverseNumber);
		
		if (reverseNumber == n) System.out.println("The number is a PALINDROME NUMBER ");
		else System.out.println("The number is not a palindrome number");
		
		sc.close();
		
	}
}