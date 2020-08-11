package datastructures.mapInterface;
import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;


public class Maps {

	public static void main(String[] args) {
				
		Map<String ,Integer> numbers = new HashMap<>();	
		
		numbers.put("one", 1);
		numbers.put("two" , 2);
		numbers.put("three" , 3);
		numbers.put("four" , 4);
		
		System.out.println(numbers);

		Scanner sc = new Scanner(System.in);
	    int t = sc.nextInt();
	    while(t-->0) {
	        int n = sc.nextInt();
	       ArrayDeque<Integer> mq = new ArrayDeque<>();
	        while(n-->0) {
	           
	            int nowSize =1 ;
	            while(!mq.isEmpty()) {
    	            if(mq.peekLast() == 1) {
    	                mq.removeLast();
    	                nowSize++;
    	            }
    	            else {
    	                mq.removeLast();
    	                mq.addLast(1);
    	                break;
    	            }
	            }
	            System.out.println(mq);
	           if(mq.isEmpty()) {
	                mq.add(1);
	                while(nowSize-->1) {
	                    mq.add(0);
	                }
	            }//if
	           
	            for(int j=0 ; j<nowSize-1 ;j++) {
	                mq.add(0);
	            }
	            
	            
	            System.out.println(mq);
	            
	            Object a[] = mq.toArray();
	            
	            for(int j=0 ; j<mq.size();j++) {
	            System.out.print(a[j]);
	            }
	            System.out.print(" ");
	        }//n
	        System.out.println();
	    } //t
	    sc.close();
	}
}	 