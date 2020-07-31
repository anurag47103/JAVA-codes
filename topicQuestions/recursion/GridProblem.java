package topicQuestions.recursion;

public class GridProblem {

	public static void main(String[] args) {
		System.out.println(path(4,4));	
		
	}
	static int path(int n , int m) {
		if(n==1 || m==1) {
			return 1;
		}
		else return path(n-1 , m) + path(n , m-1);
	}

}
