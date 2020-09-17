package topicQuestions.Arrays;
import java.util.Scanner;
public class WithoutAdjacentMaximumSum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];
		for(int i=0 ; i<n ; i++) arr[i] = sc.nextInt();
		
		System.out.print(FindMaxSum(arr , n));

	}
	static long FindMaxSum(int arr[], int n) 
    { 
        long incl = arr[0]; 
        long excl = 0; 
        long excl_new; 
        int i; 
  
        for (i = 1; i < n; i++) 
        { 
            /* current max excluding i */
            excl_new = (incl > excl) ? incl : excl; 
  
            /* current max including i */
            incl = excl + arr[i]; 
            excl = excl_new; 
        } 
  
        /* return max of incl and excl */
        return ((incl > excl) ? incl : excl); 
    } 
}
