package oopsConcepts.abstraction;

public class WagonR extends Car{

	public void accelerate() {
		System.out.println("WagonR is accelerating");
	}
	
	@Override
	public void breaking() {
		System.out.println("WagonR is breaking");
	}
}
