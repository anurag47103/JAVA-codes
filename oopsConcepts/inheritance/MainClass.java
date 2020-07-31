package oopsConcepts.inheritance;
public class MainClass {

	public static void main(String[] args) {
//		Teacher t = new Teacher();
//		t.name = "harry";
//		t.eat();
//		t.teach();
		
		Teacher t = new Teacher("Harry");
		
		Person p = t;
		
		Teacher t1 =(Teacher) p;
	}

}
