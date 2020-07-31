package topicQuestions.bitOperator;

public class FindTheMissingNumber {

	public static void main(String[] args) {
				
		int arr[] = { 4 , 1 ,3 };
		int temp[] = new int[arr.length + 1];
 		int res =0;
		
 		for(int i=0 ; i<=arr.length ;i++) {
			temp[i] = i+1;
			res = res ^ temp[i];
		}
		
		for(int i=0 ; i<arr.length ;i++) {
			res = res ^ arr[i];
		}
		
		
		System.out.println(res);
	}

}
