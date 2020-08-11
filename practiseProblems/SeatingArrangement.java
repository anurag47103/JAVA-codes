package practiseProblems;
import java.util.Arrays;
import java.util.Scanner;
public class SeatingArrangement {     

	public static void main(String[] args) {
      
		Scanner sc = new Scanner(System.in);
			
		int[] aMs = new int[36];
        int[] aWs = new int[36];
        int[] aAs = new int[36];
        
        int m = 2;
        int w = 1;
        int a = 3;

        for(int i=0 ; i<36 ; i++) {
            aMs[i] = m;
            m+=3;
        }

        for(int i=0 ; i<36 ;i++) {
            aWs[i] = w;
            if(aWs[i]%2==0) w++;
            else w+=5;
        }

        for(int i=0 ; i<36 ; i++) {
            aAs[i] = a;
            if(aAs[i]%2==0) a+=5;
            else a++;
        }
       
        int testNum = sc.nextInt();
        for(int j=0 ; j<testNum ; j++) {
        
        int seatNum = sc.nextInt();
        int facingindex = 0;
        
        int tempIndex = indexSearch(aWs,seatNum); {
        	if(tempIndex!=-1) {
        		facingindex = index(tempIndex);
        		System.out.println(aWs[facingindex] + " WS");
        		continue;
        	}
        }
      
        int tempIndex2 = indexSearch(aMs,seatNum); {
        	if(tempIndex2!=-1) {
        		facingindex = index(tempIndex2);
        		System.out.println(aMs[facingindex] + " MS");
        		continue;
        	}
        }
        
        int tempIndex3 = indexSearch(aAs,seatNum); {
        	if(tempIndex3!=-1) {
        		facingindex = index(tempIndex3);
        		System.out.println(aAs[facingindex] + " AS");
        		continue;
        	}
         }
        sc.close();
		} 
	}
	 
	 public static int indexSearch(int arr[], int t)   { 
	  
	        int index = Arrays.binarySearch(arr, t); 
	        return (index < 0) ? -1 : index; 
	    } 
	 
	 public static int index(int n) {
		int facingindex=0 ;
		int k =n;
		n%=4;
		if(n==0) facingindex=k+3;
 		if(n==1) facingindex=k+1;
 		if(n==2) facingindex=k-1;
 		if(n==3) facingindex=k-3;
		 
		 return facingindex;
	 }
	 }


