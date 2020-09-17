package topicQuestions.Sorting;

import java.util.Arrays;
public class CycleSort {
	static int j = 0;
	static int k = 0;
	public static void main(String[] args) {
		
		int arr[] = {50,45,60,25,30,10};
		cycleSort(arr);
		System.out.println(Arrays.toString(arr));

	}
	
	public static void cycleSort(int arr[]) {
		
		for(int cs=0 ; cs<arr.length-1 ; cs++) {
			int pos = cs;
			int item = arr[cs];
			for(int i=cs+1 ; i<arr.length ; i++ ) {
				if(arr[i]<item) pos++;
			}

			arr[pos] = getItself(item , item = arr[pos]);
			
			while(pos!=cs) {
				pos = cs;
				for(int i=cs+1 ; i<arr.length ; i++) {
					if(arr[i]<item)pos++;
				}
				arr[pos] = getItself(item , item = arr[pos]);
			}
			
			
		}
	}
	
	public static int getItself(int a , int temp) {
		return a;
	}
	
	
}
