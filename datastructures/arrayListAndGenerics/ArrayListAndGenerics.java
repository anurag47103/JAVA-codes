package datastructures.arrayListAndGenerics;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
public class ArrayListAndGenerics {

	public static void main(String[] args) {
				
		ArrayList arr1 = new ArrayList();
		arr1.add("mango");
		arr1.add(76);
		
		int i=0;
		arr1.remove(1 + i);

		
		List<Integer> arr2 = new ArrayList();  //make the object of List so that we can change it we need 
		arr2.add(45);
//		arr2.add("orange"); (error) only integer values can be stored here
		
		Pair<String , Integer> p1 = new Pair("hey", 5);	
		Pair<Integer , Float>  p2 = new Pair(78 , 4.3f);
		 
		p1.getDescription();
		p2.getDescription();
		
		List<String> fruits = new LinkedList<>();
		fruits.add("mango");
		fruits.add("grapes");
		fruits.add("apple");
		
		String x[] = new String[fruits.size()];
		fruits.toArray(x);
		
		for(String item :fruits) {
			System.out.println(item);
		}
	}

}
