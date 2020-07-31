package videocourse;

import java.util.Scanner;

public class AnagramOfStringArraySolution {

	public static void main(String[] args) {
			
		Scanner sc = new Scanner(System.in);
		
		String a =sc.next();
		String b =sc.next();
	
		boolean isAnagram = true;
		
		int al[] = new int[256];
		
		for(char item: a.toCharArray()) {
			int index = (int)item;
			al[index]++;					//increasing the value in the array of index (index)
		}									//if string a contains char c then al[99]=1
		for(char item: b.toCharArray()) {
			int index = (int) item;
			al[index]--;					//decreasing when it appears in b string
		}									//if string b contains char c then al[99]=0
		for(int i=0 ; i<256 ; i++) {
			if(al[i] != 0) {
				isAnagram = false;
				break;
			}
		}if(isAnagram) System.out.println("Anagram");
	     else System.out.print("not Anagram");
		

		}
	}


