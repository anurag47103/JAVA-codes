package topicQuestions.Arrays;
import java.util.ArrayList;
public class FrequencyInUnsortedArray {

	public static void main(String[] args) {
		int[] a = {20 ,20 ,10,30,30,30};
		int n = a.length;
		System.out.println(frequency(a,n));
	}
	static ArrayList<Integer> frequency(int[] a , int n) {
		ArrayList<Integer> count = new ArrayList<>();
		int tempcount = 1;
		int current = a[0];
		for(int i=1 ; i<n ;i++) {
			if(a[i] == current) {
				tempcount++;
				if(i==n-1) count.add(tempcount);
			}
			else {
				if(i==n-1) count.add(tempcount);
				count.add(tempcount);
				tempcount=1;
				current = a[i];
			}
		}
		return count;
	}
}
