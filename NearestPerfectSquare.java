import java.util.Scanner;

public class NearestPerfectSquare {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		
		while(t-->0) {
		    int n = sc.nextInt();
		    if(n==1) {
		        System.out.println(0);
		        continue;
		    }
		    if(n==2 || n==3) {
		        System.out.println(4);
		        continue;
		    }
		    if(Math.sqrt(n) == (int)Math.sqrt(n) ) {
		        System.out.println(((int)Math.sqrt(n) - 1) * ((int)Math.sqrt(n) - 1));
		        continue;
		    }
		    int sqrt = (int)Math.sqrt(n);
		    int low = sqrt*sqrt;
		    int high = (sqrt+1) * (sqrt+1);
		    if(high-n <=n-low ) System.out.println(high);
		    else System.out.println(low);
		    
		}
	}
	
}
	