package practiseProblems;
import java.util.Scanner;
public class Cipher {

	public static void main(String[] args) {
			
		Scanner sc = new Scanner(System.in);
		
		String s = sc.next();
		int key = sc.nextInt();
		int b[] = new int[s.length()];
		
		for(int i=0 ; i<s.length() ;i++) {
			b[i] = (int)s.charAt(i);
		}
		for(int i=0 ; i<s.length() ;i++) {
			if(b[i]>=(int)'A'&b[i]<=(int)'Z' )  change(b,key,s,(int)'A',(int)'Z',i);
			
			else if(b[i]>=(int)'a'&b[i]<=(int)'z') change(b,key,s,(int)'a',(int)'z',i);
			
			else if(b[i]>=(int)'0'&b[i]<=(int)'9') change(b,key,s,(int)'0',(int)'9',i); ;
		
		}
		for(int i=0 ; i<s.length();i++) {
			System.out.print((char)b[i]);
		}
	}
	static void change(int[] b , int key , String s , int start , int end , int i) {
		
		b[i] +=key;
	while(b[i]>end) {
		int temp = b[i]-end;
		b[i] = start + temp -1 ;
	}
  }  
}
