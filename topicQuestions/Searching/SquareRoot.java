package topicQuestions.Searching;
import java.util.Scanner;
public class SquareRoot {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println(squareRoot(n));
		sc.close();
	}

	static int squareRoot(int n) {   //O(logn)
		int low = 1;
		int high = n;
		int ans = -1;                //storing values whichever is less than n
									 //then finding maximum such number
		
		while(low<=high) {
			int mid = (high + low) / 2;
			if(mid*mid == n) return mid;
			else if(mid*mid > n) high = mid - 1;
			else {
				low = mid + 1;
				ans = mid;
			}
		}
		return ans;
	}
}
