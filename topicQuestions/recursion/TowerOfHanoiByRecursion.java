package topicQuestions.recursion;

public class TowerOfHanoiByRecursion {

	public static void main(String[] args) {
		tower(10, 'A' , 'B' , 'C');

	}
	static void tower(int n , char A , char B , char C) {
		if(n==1) {
			System.out.println("move 1st disc from " + A + " to " + C);
			return;
		}
		tower(n-1 , A , C , B);
		
		if(n==2)System.out.println("move " + n + "nd disc from " + A + " to " +  C);
		else if(n==3)System.out.println("move " + n + "rd disc from " + A + " to " +  C);
		else System.out.println("move " + n + "th disc from " + A + " to " +  C);
		tower(n-1 , B ,A ,C);
		
	}

}
