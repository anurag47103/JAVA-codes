package topicQuestions.Arrays;

public class MaximumConsecutive1S {

	public static void main(String[] args) {
		int a[] = {1 ,1 ,1 ,0 ,1,0,1,1,1};
		int n = a.length;
		System.out.println(maxCons(a , n));

	}
	static int maxCons(int a[] , int n) {
		int count = 0;
		int maxCount = 0;
		for(int i=0 ; i<n ; i++)  {
			if(a[i] == 1) count++;
			else count=0;
			
			maxCount = Math.max(count,maxCount);
		}
		return maxCount;
	}
}
