package videocourse;
import java.util.Scanner;
import java.util.regex.*;
public class AnagramOfString {

	public static void main(String[] args) {
		
		//My solution
		Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt();
		for(int l=0 ; l<t ; l++ ) {
			
		boolean isAnogram=false;
		
		String string1 = sc.next();
		String string2 = sc.next();
		
		if (string1.length() != string2.length()) {
			System.out.println("they are not anagrams");
		}
			String arraySt2[] = string2.split("");
			
			for(int i=0;i<=string1.length() - 1 ; i++) {
				if(string1.contains(arraySt2[i])) isAnogram=true;
				else {
					isAnogram=false;
					break;
				}
				string1 = string1.replaceFirst(arraySt2[i], "*");
			}
			if(isAnogram==true) System.out.println("they are Anograms ");	
			else System.out.println("they are not Anograms");
				
			
		//Video solution
		String a = sc.next();	
		String b = sc.next();
		
		boolean visited[] = new boolean[b.length()];
		boolean isAnagram = false;
		
		if(a.length() == b.length()) {
			for (int i=0 ; i<a.length() ; i++) {
				char c = a.charAt(i);
				isAnagram = false;
				for (int j=0 ; j<b.length(); j++) {
					if (b.charAt(j) == c && !visited[j]) {
						visited[j] = true;
						isAnagram = true;
						break;
					}
				}if(!isAnagram) {
				break;
			}
			}
		}if(isAnagram) {
			System.out.println("Anagram");
		}else  System.out.println("not Anagram");
		
			}
		}
}
	
