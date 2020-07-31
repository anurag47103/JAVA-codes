package datastructures.arrayListAndGenerics;
import java.util.LinkedList;
import java.util.List;
import java.util.ArrayList;
public class LinkedListVSArrayList {

	public static void main(String[] args) {
			
		List<Integer> ll = new LinkedList<>();
		List<Integer> al = new ArrayList<>();
		
		getTimeDiff(ll);
		getTimeDiff(al);
		
	}

	public static void getTimeDiff(List<Integer> list ) {
		
		long start = System.currentTimeMillis();
		
		for(int i=0 ; i<100000 ; i++) {
			list.add(0 , i);
		}
		
		long end = System.currentTimeMillis();
		
		System.out.println(list.getClass().getName() + " --> " + (end - start));
	}
}
