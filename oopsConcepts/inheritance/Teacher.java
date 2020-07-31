package oopsConcepts.inheritance;

public class Teacher extends Person{
	
	public Teacher(String name) {
		super(name);
		System.out.println(name + " under Teacher constructor");
	}
		
	public void teach() {
			System.out.println(name + "is teaching");
		}
		
	public void eat() {
			super.eat();
			System.out.println(name + "is now eating");
		}
	
}
