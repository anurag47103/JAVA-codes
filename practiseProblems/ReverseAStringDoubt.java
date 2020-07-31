package practiseProblems;
import java.util.Scanner;
public class ReverseAStringDoubt {

	public static void main(String[] args) {
			
		Scanner sc = new Scanner(System.in);	
		
		String s = sc.nextLine();
//		String a[] = s.split(" ");
//		int l = a.length;
//		   
//		for(int i=0 ; i<l/2; i++) {
//			String temp = a[l- i -1];
//			a[l-i-1] = a[i];
//			a[i]=temp;
//		}
//		
//		
//		for(int i=0 ; i<l; i++) {
//			if(!a[i].isEmpty()) System.out.print(a[i] + " ");;
//		}
	System.out.println(reverseWords(s));
		
	}
	 public static String reverseWords(String s) {
	     	
			
			
			String a[] = s.split(" ");
			int l = a.length;
			   
			for(int i=0 ; i<l/2; i++) {
				String temp = a[l- i -1];
				a[l-i-1] = a[i];
				a[i]=temp;
			}
	        int j=0;
	        String b[] = new String[l];
			for(int i=0 ; i<l; i++) {
				if(!a[i].isEmpty()){
	            b[j]=a[i].concat(" ");
	            j++;
	            }
			}
			for(String item :b) {
				System.out.println(item);
			}
	        String d = "";
	        for(int i=0 ; i<b.length ;i++) {
	            d = d.concat(b[i]);
	        }
	        // String c[] = new String[b.length];
	        // for(int i=0 ; i<b.length ; i++) {
	        //     c[i] = b[i];
	        // }
	        return d;
	    }
	}


