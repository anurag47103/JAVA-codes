package practiseProblems;
import java.util.Scanner;
public class ReverseAString {

	public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			String s = sc.nextLine();
			System.out.print(reverseWords(s));
			sc.close();
	}

	public static String reverseWords(String s) {
		
		String ans ="";
		int i = s.length() - 1;
		
		while(i>=0) {
			
			while(i>=0 && s.charAt(i)==' ') i--;
			
			int j = i;
			
			while(i>=0 && s.charAt(i)!=' ') i--;
			if(ans.isEmpty()) {
				ans = ans.concat(s.substring(i+1 , j+1)); 
			}else {
				ans = ans.concat(" " + s.substring(i+1 , j+1));
			}
			 
		}
	
		return ans;
		
	}
}
