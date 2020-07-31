package practiseProblems;

public class minimunSwaps {

	 static void minimumBribes(int[] q) {

		 int a[] = new int[q.length];
		 for(int i=0 ; i<q.length ; i++) {
			 a[i]=i+1;
		 }
		 
         int minBribes = 0;
         boolean isChaotic = false;
         
        for(int i=1 ; i<=q.length ; i++) {
            int indexInQ = indexOf(q ,i );
            int indexInA = indexOf(a , i);
            int swaps = indexInA - indexInQ;
         
            if(indexInQ < indexInA) {
             if(swaps > 2) {
                 System.out.print("Too chaotic");
                 isChaotic = true;
                 break;
             }
             else {
            	 minBribes += indexInA - indexInQ;
            	
            	 while(swaps-- >0) {
            	 int temp = a[indexInA];
            	 a[indexInA] = a[indexInA -1];
            	 a[indexInA - 1] = temp ;
            	 indexInA -=1; 
            	 }  
            	 
             }
             
         }
        }
        
        
        if(isChaotic == false) System.out.print(minBribes);
}	
	
	 static int indexOf(int[] q , int value) {
	        int index = 0;
	        for(int i=0 ; i<q.length ;i++) {
	            if(q[i] == value) {
	                index=i;
	                break;
	        }
	        
	   }   
	      return index;
	   
	 }
	        
	        
	        
	public static void main(String[] args) {
		int q[] = { 1,2,5,3,7,8,6,4};
		minimumBribes(q);
	}

}
