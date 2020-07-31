package videocourse;
import java.util.Scanner;

public class CandiesAsPerRating {

	public static void main(String[] args) {
			
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt(); 
		int a[] = new int[n];
		for(int i=0 ; i<n ; i++) {
			a[i] = sc.nextInt();
		}
		int candies[] = new int[n];
		candies[0]=1;
		int sum = 0;
		for (int i=1 ; i<n ;i++) {
			if(a[i] > a[i-1]) {
				candies[i] = candies[i-1] + 1;
			}
			else {
				candies[i] = 1;
			}
		}
		for(int i=n-2 ; i>=0 ;i--) {
			if(a[i] > a[i+1] && candies[i]<=candies[i+1]) {
				candies[i] = candies[i] +1;
			}
		}
		  
		for(int i=0 ; i<n ; i++) {
			sum+=candies[i];
		}
		System.out.println(sum);
	}

}
