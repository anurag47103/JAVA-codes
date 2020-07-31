package practiseProblems;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayDivideGame {

	public static void main(String[] args) {
				
		Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while(t-->0) {
            int n = sc.nextInt();
            int a[] = new int[n];
            for(int i=0 ; i<n ;i++) {
                a[i] = sc.nextInt();
            }
            int indexBreak = -1;
            int broke = 0;
            for(int j=0 ; j<n ;j++) {
            	if(a[j]<Arrays.stream(a , j+1 , n).min().getAsInt()) {
       
            
            for(int i=0 ; i<n-1 ; i++) {
                
	            	int lmax = Arrays.stream(a , indexBreak+1 , i+1).max().getAsInt();
	            	int rmin = Arrays.stream(a,i+1,n).min().getAsInt();
	            	
	            	if(lmax<rmin) {
	            		broke++;
	            		indexBreak=i;
	            	}
                }
            	}
            }
            if(broke%2==0) System.out.println("Ashish");
            else System.out.println("Jeel");
            }
            
        }
	}  




