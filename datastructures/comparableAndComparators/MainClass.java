package datastructures.comparableAndComparators;
import java.util.*;
public class MainClass {

	public static void main(String[] args) {
				
		List<Student> students = new ArrayList<>();
		
		students.add(new Student(23 , "Rohit"));
		students.add(new Student(35 , "Shyam"));
		students.add(new Student(13 , "Rohit"));
		students.add(new Student(13 , "Aman"));
		students.add(new Student(65 , "Anuj"));
		
	//	Collections.sort(students);    //it works if the Student class extends Comparable interface
	
	//	Collections.sort(students , new SortByNameThenMarks());  
	
//		Collections.sort(students , new Comparator<Student>() {          //Anonymous class
//
//			@Override
//			public int compare(Student o1, Student o2) {
//				if(o1.name.equals(o2.name)) return o1.marks - o2.marks;
//				else return o1.name.compareTo(o2.name);	
//			}
//		});
//		
//		Collections.sort(students , (o1 , o2) -> {                       //lambda expression after java 8 denoted by ->
//				if(o1.name.equals(o2.name)) return o1.marks - o2.marks;
//				else return o1.name.compareTo(o2.name);	
//			});
		
//		Collections.sort(students , (o1 , o2) -> o1.name.compareTo(o2.name));    //compare by name (lambda expression)
		
		Collections.sort(students , Comparator.comparing(Student::getName).thenComparing(Student::getMarks).reversed());
		
		students.forEach(System.out::println);   //lambda function
		
	}

}
//class SortByNameThenMarks implements Comparator<Student> {
//
//	@Override
//	public int compare(Student o1, Student o2) {
//		if(o1.name.equals(o2.name)) return o1.marks - o2.marks;
//		else return o1.name.compareTo(o2.name);
//		
//	}
//	
//}