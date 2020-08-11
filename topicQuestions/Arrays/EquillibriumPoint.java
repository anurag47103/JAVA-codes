package topicQuestions.Arrays;

public class EquillibriumPoint {

	public static void main(String[] args) {
		int a[] = {3,4,8,-9,20,6};
		int n = a.length;
		System.out.println(equilibriumPoint(a,n));

	}
	static boolean equilibriumPoint(int a[] , int n) {   //Best solution O(n)
		int prefix_sum[] = new int[n];
		for(int i=0 ; i<n ;i++) {
			prefix_sum[i] += a[i];
		}
		int lmax = 0;
		for(int i=0 ; i<n ;i++) {
			if(lmax == prefix_sum[i] - a[i]) return true;
			lmax += a[i];
			prefix_sum[i] -= a[i];
		}
		return false;
	}
}
