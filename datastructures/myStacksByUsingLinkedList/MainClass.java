package datastructures.myStacksByUsingLinkedList;

public class MainClass {

	public static void main(String[] args) throws Exception{
			
		MyStack<Integer> st = new MyStack<>();
		
		st.push(56);
		st.push(34);
		st.push(59);
		int temp = 5;
		
			st.pop();
			st.pop();
			st.pop();
			st.pop();
	
		temp = st.peek();
		System.out.println(temp);
	}

}
