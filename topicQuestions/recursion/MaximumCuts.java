package topicQuestions.recursion;

public class MaximumCuts {

	public static void main(String[] args) {
		System.out.println(maximumCuts(23 ,11 , 9 ,12));

	}
	
	static int maximumCuts(int n , int a, int b , int c) {
		if(n==0) return 0;
		if(n<0) return -1;
		
		int res = Math.max(Math.max(maximumCuts(n-a ,a , b ,c) , maximumCuts(n-b ,a ,b ,c) ) , maximumCuts(n-c ,a ,b ,c) );
				
		if(res==-1) return -1;
		else return res +1;
	}
}
