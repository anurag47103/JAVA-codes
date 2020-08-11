package practiseProblems;

import java.util.ArrayDeque;
import java.util.Scanner;

public class ReverseAnArray {

	public static void main(String[] args) {
		 Scanner sc= new Scanner(System.in);
		 int t= sc.nextInt();    
		 while(t-->0) {
		     int n = sc.nextInt();
		     int d = sc.nextInt();
		     
		     ArrayDeque<Integer> ad = new ArrayDeque<>();
		     while(n-->0) {
		         int temp = sc.nextInt();
		         ad.addLast(temp);
		     }
		   
		     while(d-->0) {
		         int temp = ad.removeFirst();
		         ad.addLast(temp);
		     }
		    
		     while(n-->0) {
		         System.out.print(ad.removeFirst() + " ");
		     }
		     System.out.println();
		 }
		 
		 sc.close();
		 }
	}
