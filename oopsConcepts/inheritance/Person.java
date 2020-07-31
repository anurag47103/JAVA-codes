package oopsConcepts.inheritance;

public class Person {
	protected String name;
	
	Person(String name){
		this.name = name;
		System.out.println(name + " under Person constructor");
	}
	
	
	
	public void walk() {
			System.out.println("person is walking");
		}
		
	public void eat( ) {
			System.out.println(name + "person is eating");
		}
	}