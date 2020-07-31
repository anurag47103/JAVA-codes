package datastructures.myQueue;

public class MainClass {

	public static void main(String[] args) throws Exception{
				
		MyQueue<Integer> q1 = new MyQueue<>();
		
		q1.enqueue(34);
		q1.enqueue(45);
		q1.enqueue(71);
		q1.enqueue(11);
		System.out.println(q1.dequeue());
		
		q1.printAll();
	}

}
