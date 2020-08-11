package videocourse;
import java.util.Scanner;
public class AnagramOfStringMySolution {

	public static void main(String[] args) {
			
		Scanner sc = new Scanner(System.in);
		
		String word1 = sc.next();
		String word2 = sc.next();
		
		int l1 = word1.length();
		int l2 = word2.length();
		
		char a1[] = word1.toCharArray();
		char a2[] = word2.toCharArray();
		
		boolean anagram = true;
		for(int i=0 ; i<l1 ; i++) {
			anagram =false;
			for(int j=0 ; j<l2 ; j++) {
				if( a1[i]==a2[j] ) {
					a2[j] = '*';
					anagram =true;
					break;
				}		
			}
			if (anagram == false) break;
		}
		if(anagram == true & l1==l2) System.out.println("It's an ANAGRAM ");
		else System.out.println("not an ANAGRAM");
		sc.close();
	}

}
