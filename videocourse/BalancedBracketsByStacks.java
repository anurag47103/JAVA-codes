package videocourse;
import java.util.Scanner;
import java.util.Stack;
import java.util.Arrays;

public class BalancedBracketsByStacks {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
			Stack<Character> st = new Stack<>();
			int t = Integer.parseInt(sc.nextLine());
			while(t-->0){
				st.clear();
			    String s = sc.nextLine();
			    for(int i=0 ; i<s.length() ;i++) {
			        char toPut = s.charAt(i);
			        
			        if(toPut == '{' || toPut == '[' || toPut == '(' ) {
			            st.push(toPut);
			        }
			        
			        else if(st.isEmpty()) break;
			        
			        else {
			            if( (st.peek() == '{' && toPut == '}') || (st.peek() == '[' && toPut == ']') || (st.peek() == '(' && toPut == ')')) {
			                st.pop();
			            }else {
			            	st.push(toPut);
			            }
			        }
			    }
			    if(st.isEmpty()) System.out.println("balanced");
			    else System.out.println("not balanced");
			   
			    
			}
		}
	
	}


