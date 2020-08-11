package topicQuestions.bitOperator;
import java.util.Scanner;

public class PowerSetBitwise {

	public static void main(String[] args) {
				
		System.out.println(Math.random());
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		int n = s.length();
		char c[] = s.toCharArray();
		
		for(int i=0 ; i<Math.pow(2,n) ; i++) {
			for(int j=0 ; j<n ;j++) {
				if( (i & (1<<j)) != 0) System.out.print(c[j]);
			}
			System.out.println();
			
		}
		sc.close();
	}

}
