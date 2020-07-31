package practiseProblems;

import java.util.ArrayList;
import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Scanner;

public class K_LargestElements {

	public static void main(String[] args) {
				
		  Scanner sc = new Scanner(System.in);
	        
	        int t = sc.nextInt();
	        while(t-->0) {
	        	PriorityQueue<Integer> pq = new PriorityQueue<>();
	           
	        	int n = sc.nextInt();
	            int k = sc.nextInt();
	            
	            for(int i=0 ; i<k ; i++) {
	                int num = sc.nextInt();
	                pq.add(num);
	            }
	            for(int i=k ;i<n ;i++) {
	                int num = sc.nextInt();
	                if(pq.peek() < num) {
	                    pq.remove();
	                    pq.add(num);
	                }
	            }
	             ArrayList<Integer> al = new ArrayList<>(pq);
	             Collections.sort(al , Collections.reverseOrder());
	             
	             for(int item :al){
	                 System.out.print(item + " ");
	             }
	             System.out.println();
	        }
		}                 
	}