package oopsConcepts.ComparableAndComparator;

import java.util.Arrays;
import java.util.Comparator;

public class EvenOddSeparate {

	public static void main(String[] args) {
		
        Integer[] arr = {5, 20, 10, 3, 12};
            
        // Sorting arrays by passing
        // arr and MyCmp object
        Arrays.sort(arr, new MyCmp2());
        
        // Displaying the sorted array
        System.out.println(Arrays.toString(arr));
	}

}

class MyCmp2 implements Comparator<Integer> {
    // Sorts the Integers
    public int compare(Integer a, Integer b) {
         
    	return a%2 - b%2;
    }
}
