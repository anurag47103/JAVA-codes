package topicQuestions.Sorting;
import java.util.ArrayList;
public class IntersetionOfTwoSortedArray {

	public static void main(String[] args) {
		int a[] = {1 , 1 , 3 ,3 , 3 };
		int b[] = {1 ,1 , 1 , 1 ,3 , 5 , 5};
		System.out.println(intersection(a , b));

	}
	
	public static ArrayList<Integer> intersection(int a[] , int b[]) {
		int p2 = 0;
		int p1 = 0;
		int n1 = a.length;
		int n2 = b.length;
		ArrayList<Integer> ans = new ArrayList<Integer>();
		
		while(p1<n1 && p2<n2) {
			if(p1>0 && a[p1-1]==a[p1]) { 
				p1++;
				continue;
			}
			if(a[p1] == b[p2]) { 
					ans.add(a[p1]);
					p1++;
					p2++;
			}
			
			else if(a[p1] > b[p2]) p2++;
			else p1++;
		}
		return ans;
	}
}
