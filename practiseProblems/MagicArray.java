package practiseProblems;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MagicArray {
		
	public static void main(String[] args) throws NumberFormatException, IOException {
		
//Scanner sc = new Scanner(System.in);  
//		
//		long sum =0;
//	    
//        int n = sc.nextInt();
//        long al[] = new long[n];
//        for(int i=0 ; i<n ;i++) {
//            al[i] = sc.nextLong();
//            sum+=al[i];
//        }        
//        
//        int ansIndex = -1;
//        int j=0;
//        long removeNum = Long.MAX_VALUE ;
//        
//         for(int k=0 ; k<n ;k++) {
//            long temp =  sum-al[k];
//            
//            if(temp%7==0) {
//            	if(al[k] < removeNum) {
//            		removeNum = al[k];
//            		ansIndex = k;
//            	}
//	            j++;
//            } 
//         }
//        System.out.println(ansIndex);   
//       
//	}
//}

		 InputStreamReader reader=new InputStreamReader(System.in);
	     BufferedReader input=new BufferedReader(reader);
	       
	      long sum = 0;
	      String s;
	       int n=Integer.parseInt(input.readLine());
	          long al[]=new long[n];
	        s=input.readLine();
	        String si[]=s.split(" ");
	        for(int i=0;i<n;i++) {
	            al[i]=Long.parseLong(si[i]);
	            sum=sum+al[i];
	        }
		
		
		int ansIndex = -1;
		
		long removeNum = 0 ;
		
		 for(int k=0 ; k<n ;k++) {
		    long temp =  sum-al[k];
		    
		    if(temp%7==0) {
		    	if(al[k] < removeNum) {
		    		removeNum = al[k];
		    		ansIndex = k;
		    	}
		    } 
		 }
		System.out.println(ansIndex);   
		
		}
		}
		
