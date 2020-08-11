package topicQuestions.recursion;
import java.util.Scanner;
import java.util.ArrayList;

public class JosephusProblem {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int k = sc.nextInt();
		
		ArrayList<Integer> arr = new ArrayList<>();
		for(int i=0 ; i<n ; i++) {
			arr.add(i);
		}
		System.out.println(jp(arr ,0 , k));
		System.out.println(jp2(n , k));

		sc.close();
	}
	
	static int jp(ArrayList<Integer> arr ,int start , int k) {
		int remove;
		int n = arr.size();
		if(n==1) return arr.get(0);
		
		if(start>=n) start -= n;
		
		remove = start + (k-1);
		if(remove>=n) remove -= n;
		
		arr.remove(remove);
		
		return jp(arr , remove , k);
	}
	
	static int jp2(int n , int k) {
		if(n==1) return 0;
		
		return (jp2(n-1 , 3) + k) % n;
	}
}
