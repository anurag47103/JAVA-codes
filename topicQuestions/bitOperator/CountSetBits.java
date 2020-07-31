package topicQuestions.bitOperator;
import java.util.Scanner;
public class CountSetBits {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		System.out.println(countSetBits(n));

	}
	static int countSetBits(int n) {
		
		int count = 0;
		while(n!=0) {

//			if( (n&1) != 0  ) {
//				count++;
//			}
//			n = n>>1;
			
			//OR
			
//			if(n%2 != 0 ) count++;
//			n/=2;
			
			//OR
			
			count = count + (n&1);
			n= n>>1;
		
		}
		return count;
	}

}
