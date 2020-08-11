package topicQuestions.Arrays;

public class MaximumAppearingNumberInRanges {

	public static void main(String[] args) {
		int l[] = {1,2,5,15};
		int r[] = {5,8,7,18};
		int n = l.length;
		System.out.println(maxAppearingNumber(l,r,n));
	}
	static int maxAppearingNumber(int l[] , int r[] , int n) {  //Best Solution O(n)
		int arr[] = new int[1000];
		for(int i=0 ; i<n ; i++) {
			arr[l[i]]++;
			arr[r[i] + 1]--;
		}
		int max = arr[0];
		int res = 0;
		for(int i=1 ; i<1000 ;i++) {
			arr[i] += arr[i-1];	
			if(arr[i] > max) {
				max = arr[i];
				res = i;
			}
		}
		return res;
	}
}
