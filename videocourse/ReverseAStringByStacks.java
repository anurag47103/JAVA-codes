package videocourse;

import java.util.Scanner;
import java.util.Stack;

public class ReverseAStringByStacks {

	public static void main(String[] args) {
				
		Scanner sc = new Scanner(System.in);
		int t = Integer.parseInt(sc.nextLine());
		
		while(t-->0) {
		    String s = sc.nextLine();
		    String a[] = s.split("[.]");
		    
		    Stack<String> st = new Stack<String>();
		    for(int i=0 ; i<a.length ;i++) {
		        st.push(a[i]);
		    }
		    
		    while(st.isEmpty() == false) {
		        System.out.print(st.pop());
		       if(st.isEmpty() == false)  System.out.print(".");
		    }
		    System.out.println();
		}
	}
}