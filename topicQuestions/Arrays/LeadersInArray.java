package topicQuestions.Arrays;
import java.util.ArrayList;
import java.util.Collections;
public class LeadersInArray {

	public static void main(String[] args) {
		
		int a[] = {7 , 10 , 4 ,10 ,6 ,11 ,2};
		int n = a.length;
		
		System.out.println(leaders2(a,n));

		
	}
	static ArrayList<Integer> leaders(int[] a , int n) {   //My Solution 
		ArrayList<Integer> leaders = new ArrayList<>();
		leaders.add(a[0]);
		
		for(int i=1 ; i<n ; i++) {
			
			for(int j=0 ; j<leaders.size() ; j++) {
				if(a[i] >= leaders.get(j)) {
					leaders.remove(j);
					j--;
					
				}
				
			}
			 leaders.add(a[i]);
			
		}
		return leaders;
	}

	static ArrayList<Integer> leaders2(int[] a , int n) {   //best solution   O(n) time 
		
		ArrayList<Integer> leaders = new ArrayList<>();
	     leaders.add(a[n-1]);
	     int currentLeader = a[n-1];
	     for(int i=n-2 ; i>=0 ; i--) {
	         if(a[i] >= currentLeader) {
	             leaders.add(a[i]);
	             currentLeader = a[i];
	         }
	     }
	     Collections.reverse(leaders);
	     return leaders;
	    }
	}

