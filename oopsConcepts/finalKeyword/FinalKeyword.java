package oopsConcepts.finalKeyword;

public class FinalKeyword {

//	final int ROLL_NO ; (error) final variable has to be initialised
		
	public static void main(String[] args) {
	
		final int ROLL_NO2 ;
		ROLL_NO2 = 5;
//		ROLL_NO2 = 9; (error) final variable cannot be changed
	
		final Student obj = new Student();
		Student obj2 = new Student();
		
//		obj = obj2;  (error) final cannot be changed
		
		obj.name2 = "Rishu"; // attributes of the object can be changed
	}

}
