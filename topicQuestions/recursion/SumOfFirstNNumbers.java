package topicQuestions.recursion;

public class SumOfFirstNNumbers {

	public static void main(String[] args) {
				
		System.out.println(sum(4));
		
	}
	
	static int sum(int n) {
		if(n==1) return 1;
		else return sum(n-1) + n;
	}
}
