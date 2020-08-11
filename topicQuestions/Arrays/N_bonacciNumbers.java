package topicQuestions.Arrays;

public class N_bonacciNumbers {

	public static void main(String[] args) {
		int n = 3;
		int m=8;
		n_bonacciNumbers(n , m);

	}
	static void n_bonacciNumbers(int n , int m) {
		int arr[] = new int[m];
		for(int i=0 ; i<n-1 ; i++) {
			arr[i] = 0;
		}
		arr[n-1] = 1;
		
		int sum = 1;
		int start = 0;
		for(int i=n ; i<m ; i++) {
			arr[i] = sum;
			sum = sum + arr[i] - arr[start];
			start++;
		}
		for(int item:arr ) {
			System.out.println(item);
		}
	}
}
