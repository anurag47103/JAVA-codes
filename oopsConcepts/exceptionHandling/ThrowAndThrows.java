package oopsConcepts.exceptionHandling;

public class ThrowAndThrows {

	public static void main(String[] args) {
				
			fun1();
			
	}
		
	static void fun1() {
		int a=6;
		int b=9;
		int c=a/b;
		System.out.println(c);
		
		try {
		fun2();
		}catch (ArrayIndexOutOfBoundsException e) {
			System.out.println(e.getMessage() + " exception handled");
		}
		System.out.println("this is important to run");
	}
	
	static void fun2()  {
		boolean isDamage = true;
		if(isDamage) {
			throw new ArrayIndexOutOfBoundsException("damage has occured") ;
		}
	}
 }
	

