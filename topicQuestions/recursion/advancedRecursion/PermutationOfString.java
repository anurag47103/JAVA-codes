package topicQuestions.recursion.advancedRecursion;

public class PermutationOfString {

	public static void main(String[] args) {
				permutation("abc" ,0 ,2);
		
	}
		
	static void permutation(String s , int l , int r) {
		if(l==r) {
			System.out.println(s);
			return;
		}
		for(int i=l ; i<=r ;i++) {
			s = interchange(s , l ,i);
			permutation(s , l+1 ,r);
			s = interchange(s , l , i);
		}
		
		
	}
	static String interchange(String s , int l , int r) {
		char arr[] = s.toCharArray();
		char temp = arr[l];
		arr[l] = arr[r];
		arr[r] = temp;
		return String.valueOf(arr);
	}
}
