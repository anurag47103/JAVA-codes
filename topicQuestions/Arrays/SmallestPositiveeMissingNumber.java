package topicQuestions.Arrays;

public class SmallestPositiveeMissingNumber {

	public static void main(String[] args) {
		int arr[] = {2,-7,0,3,-2};
		int n = arr.length;
		System.out.println(missingNumber(arr , n));

	}
	 static int segregate (int arr[], int size) {
	        int j = 0;
	        for(int i = 0; i < size; i++) {
	           if (arr[i] <= 0) {
	               int temp = arr[i];
	               arr[i] = arr[j];
	               arr[j] = temp;
	               j++;  // increment count of non-positive integers 
	           }
	        } 
	        for(int item:arr) {
	        	System.out.println(item);
	        }
	        System.out.println();
	        
	        return j;
	    }
	    
	    static int findMissingPositive(int arr2[], int size)
	    {
	      // Mark arr[i] as visited by making arr[arr[i] - 1] negative. 
	      // Note that 1 is subtracted because index start 
	      // from 0 and positive numbers start from 1 
	      int i;
	      for(i = 0; i < size; i++)
	      {
	        if(Math.abs(arr2[i]) - 1 < size && arr2[Math.abs(arr2[i]) - 1] > 0)
	          arr2[Math.abs(arr2[i]) - 1] = -arr2[Math.abs(arr2[i]) - 1];
	      }
	      // Return the first index value at which is positive 
	      for(int item:arr2) {
	        	System.out.println(item);
	        }
	      System.out.println();
	      for(i = 0; i < size; i++)
	        if (arr2[i] > 0)// 1 is added because indexes start from 0 
	          return i+1;
	      return size+1;
	    }
	    
	    static int missingNumber(int arr[], int size)
	    {
	        // First separate positive and negative numbers
	        int shift = segregate (arr, size);
	        int arr2[] = new int[size-shift];
	        int j=0;
	        for(int i=shift;i<(size);i++)
	        {
	            arr2[j] = arr[i];
	            j++;
	        }    
	        for(int item:arr2) {
	        	System.out.println(item);
	        }
	        System.out.println();
	       return findMissingPositive(arr2, j);
	    }
	}

