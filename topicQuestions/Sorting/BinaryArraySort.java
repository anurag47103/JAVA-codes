package topicQuestions.Sorting;

import java.util.Arrays;

public class BinaryArraySort {
   public static void main(String args[]) {
	   int arr[] = {1 ,1};
	   binSort(arr , arr.length);
	   System.out.println(Arrays.toString(arr));
   }
   static void binSort(int arr[], int n)
   {
   
       int p1 = 0;
       int p2 = n-1;
       while(p1<p2) {
           if(arr[p1]==1) {
        	   System.out.println(p2);
               while(p2>=0 && arr[p2]==1) {
                   p2--;
               }
               if(p2<0 || p2<=p1) break;
               arr[p1]-=1;
               arr[p2]+=1;
           }
            p1++;
           
       }
   }
}
