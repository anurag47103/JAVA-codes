package topicQuestions.Searching;

public class CountOccurenceInSorted {
	
	public static void main(String[] args) {
		int a[] = {1,10,10,10,10,20,20};
		int find = 12;
		System.out.println(occurence(a , find));

	}
	static int occurence(int a[] , int find) {     // O(logn)
		int  firstOccurence = IndexOfFirstOccurence.firstIndex(a , find);
		
		if(firstOccurence == -1) return -1;
		
		return IndexOfLastOccurence.lastIndex(a , find) - firstOccurence + 1;	}

}
