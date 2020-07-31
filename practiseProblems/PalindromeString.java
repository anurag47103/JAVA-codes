package practiseProblems;
import java.util.Scanner;
public class PalindromeString {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int reverseNum = 0;
		
		String name = sc.next();
		
		int l = name.length();
		char a[] = name.toCharArray();
		char b[] = new char[l];
		
		boolean isPalindrome = true;
		
		for(int i=0 ; i<l ; i++) {
			b[i] = a[l-i-1];
		}
		for(int i=0 ; i<l ; i++) {
			if(b[i]!=a[i]) {
			isPalindrome = false;
			break;
			}
			
		}if(isPalindrome) System.out.println("YES");
			else System.out.println("NO"); 
		
		}

	}
