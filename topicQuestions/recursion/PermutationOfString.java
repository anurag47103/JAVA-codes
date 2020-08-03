package topicQuestions.recursion;

public class PermutationOfString {

	public static void main(String[] args) {
			
		String s = "ABC";
		char a[] = s.toCharArray();
		permute(a ,0);
	}
	static void permute(char[] a , int index) {
		if(index >= a.length - 1) {
			for(char item : a) {
				System.out.print(item);
			}
			System.out.println();
			return;
		}
		for(int i=0 ; i<a.length-index ; i++) {
		char temp = a[index];
		a[index] = a[index+i];
		a[index+i] = temp;
		permute(a , index+1);
		temp = a[index];
		a[index] = a[index+i];
		a[index+i] = temp;
		}
		
		
	}
}
