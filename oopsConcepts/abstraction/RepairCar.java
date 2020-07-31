package oopsConcepts.abstraction;

public class RepairCar {

	public static void main(String[] args) {
			
		WagonR wgnr = new WagonR();
		Audi a8 = new Audi();
		
		repairCar(a8);
		repairCar(wgnr);
		
		a8.accelerate();
		wgnr.accelerate();
		
	}
	public static void repairCar(Car c) {
		System.out.println("car is repairing");
	}
}
