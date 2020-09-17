package topicQuestions.Sorting;

import java.util.*;

public class MergeInterval {

	public static void main(String[] args) {
		Interval arr[] = { new Interval(1,3), 
				new Interval(7,12) , 
				new Interval(2,4) , 
				new Interval(6,7) 
				};
		merge2(arr);
		
		
//		ArrayList<Interval> merged = merge(arr);
//		for(int i=0 ; i<merged.size() ; i++) {
//			System.out.println(merged.get(i).start + " "+ merged.get(i).end);
//		}
	}

	public static ArrayList<Interval> merge(Interval arr[]) {
		Arrays.sort(arr);
		ArrayList<Interval> merged =  new ArrayList<>(Arrays.asList(arr)); 
		
		for(int i=0 ; i<merged.size()-1 ; i++) {
			if(merged.get(i).end >= merged.get(i+1).start) {
				merged.set(i , new Interval(Math.min(merged.get(i).start , merged.get(i+1).start) , Math.max(merged.get(i).end, merged.get(i+1).end)));
				merged.remove(i+1);
				i--;
			}
			
		}
		return merged;
	}
	
	public static void merge2(Interval arr[]) {
		Arrays.sort(arr);
		int res = 0;
		
		for(int i=0 ; i<arr.length ;i++) {
			if(arr[i].start <= arr[res].end) {
				arr[res].start = Math.min(arr[res].start , arr[i].start);
				arr[res].end = Math.max(arr[res].end , arr[i].end);
			}
			else {
				res++;
				arr[res] = arr[i];
			}
		}
		for(int i=0 ; i<=res ;i++){
			System.out.println(arr[i].start + " " + arr[i].end);
		}
	}


}
class Interval implements Comparable<Interval>{
	int start;
	int end;
	
	 Interval(int start , int end) {
		this.start = start;
		this.end = end;
	}
	 
	@Override
	public int compareTo(Interval obj) {
		return this.start - obj.start;
	}
	
}