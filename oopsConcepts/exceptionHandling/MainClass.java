package oopsConcepts.exceptionHandling;

public class MainClass {

	public static void main(String[] args) {
		
		try { 
			int x=5;
			int y=0;
			
			int a = x/y;
			System.out.println(a);
		}catch(ArithmeticException e) {
			System.out.println(e.getMessage() + " don't divide by zero");
		}catch(ArrayIndexOutOfBoundsException e ) {
			System.out.println("array length is short");
		}catch(IllegalArgumentException e) {
			System.out.println("casting problem");
		}finally {     //it will run even if the exception does not come
			System.out.println("sorry for the inconvenience");
		}
		System.out.println("this is important to run");
		System.out.println("this also");
	}

}
