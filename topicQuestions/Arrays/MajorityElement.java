package topicQuestions.Arrays;
import java.util.Arrays;
public class MajorityElement {

	public static void main(String[] args) {
		int a[] = {8 ,3 ,4 ,8,8};
		int n = a.length;
		System.out.println(majorityElement2(a , n));

	}
	static int majorityElement(int a[] , int n) {  //My Solution by sorting
		Arrays.sort(a);    
		int count = 1;
		for(int i=1 ; i<n ; i++) {
			if(a[i] == a[i-1]) count++; 
			else count = 1;
			if(count>n/2) return n/2;   //after sorting the majority element will surely be present at index n/2
		}
		return -1;
	}
	static int majorityElement2(int a[] ,  int n) { // Best Solution O(n)
		int res = 0;
		int count = 1;
		for(int i=1 ; i<n ; i++) {
			if(a[res] == a[i]) count++;
			else count--;
			if(count==0) {
				res = i;
				count =1;
			}
		}
		count = 0;
		for(int i=0 ; i<n ;i++) {
			if(a[res] == a[i]) count++;	
		}
		if(count <= n/2) res = -1;
		return res;
	}
}
