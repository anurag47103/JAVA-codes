package topicQuestions.recursion;

public class PalindromeByRecursion {

	public static void main(String[] args) {
			String s = "cssqc";
			System.out.println(palindrome(s , 0 , s.length()-1)); 
			

	}
	
	static boolean palindrome(String s) {
		int l = s.length();
		if(l == 1 || l==0) return true;
		if(s.charAt(0) == s.charAt(l-1)) {
			return palindrome(s.substring(1 , l-1));
		}
		else return false;
	}
	
	static boolean palindrome(String s , int start , int end) {
		if(start >= end) return true;
		return (s.charAt(start) == s.charAt(end)) && palindrome(s , start+1 , end-1);
	}
	
	

}
