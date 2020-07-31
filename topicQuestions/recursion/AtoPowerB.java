package topicQuestions.recursion;

public class AtoPowerB {

	public static void main(String[] args) {
	//	System.out.println(power(4,3));
	
		System.out.println(fastPower(3,4));
	}

	static int power(int a , int b) {
		if(b == 0) return 1;
		else return power(a , b-1) * a;
	}
	
	static int fastPower(int a , int b) {
		if(b==0) return 1;
		else if(b%2==0) return fastPower(a , b/2) * fastPower(a , b/2);
		else return fastPower(a , b-1) * a;
	}
}
