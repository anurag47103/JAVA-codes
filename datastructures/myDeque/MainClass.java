package datastructures.myDeque;

public class MainClass {

	public static void main(String[] args) {
			
		MyDeque<Integer> md = new MyDeque<>();
		
		md.addToHead(34);
//		md.addToHead(56);
//		md.addToHead(90);
		System.out.println(md.removeLast());
		
	}

}
