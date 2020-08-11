package topicQuestions.Arrays;

public class DivideArrayInThreeEqualPart {

	public static void main(String[] args) {
		int a[] = {5,2,6,1,1,1,5};
		int n = a.length;
		System.out.println(equalPart(a,n));

	}
	static boolean equalPart(int a[] , int n) {
		for(int i=1 ; i<n ;i++) {
			a[i] += a[i-1];
		}
		if(a[n-1] % 3 != 0) return false;
		int k = a[n-1]/3;
		int sum3[] = new int[3];
		for(int i=0 ; i<3 ;i++) {
			sum3[i] = k;
			k +=a[n-1]/3;
		}
			int j=0;	
		for(int i=0 ; i<n ;i++) {
			if(a[i] == sum3[j]) {
				if(j==2 && a[n-1] == sum3[j]) return true;
				j++;
			}
		}
		return false;
	} 
}
