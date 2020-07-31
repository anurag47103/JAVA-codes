package topicQuestions.recursion;

public class StringsSubsetByRecursion {

	public static void main(String[] args) {
		String s = "pple";
		subSet("ABC" , 0 ,"");
		
	}
	static void subSet(String s , int index , String current ) { 
		if(index >= s.length()) {
			System.out.println(current + " ");
			return;
		}
		
		subSet(s , index+1 , current+s.charAt(index));
		subSet(s , index+1 , current);
	} 

}
