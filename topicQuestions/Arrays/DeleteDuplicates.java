package topicQuestions.Arrays;

public class DeleteDuplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = {10 , 20 , 20, 20 ,40 ,40};
		int size = a.length;
		
		int res = 1;
		for(int i=1 ; i<size ;i++) {
			if(a[i] != a[res-1]) {
				a[res]=a[i];
				res++;
			
			}
		}
		for(int item:a) {
			System.out.println(item);
		}
	}

}
