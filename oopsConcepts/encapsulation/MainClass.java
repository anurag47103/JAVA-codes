package oopsConcepts.encapsulation;
import oopsConcepts.encapsulation.modules.Student;
public class MainClass {
	
	static String r = "hey"; //under main class	
	
	class a {
		
	//	static String r = "hey"; (error) (non static inner type)
	}
	
	static class b {
		
		static String r = "heyyy";
	}

	public static void main(String[] args) {

		Student s1 = new Student();
		
		s1.std();   //Public
//		s1.std2();	//Private (error)
//		s1.std3();	//Default (error)
		
		s1.setStudentVar(123); 
		
		System.out.println(s1.getStudentVar());
		
		
	}

}
