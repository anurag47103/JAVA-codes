package datastructures.myStacksByUsingLinkedList;

import datastructures.myLinkedList.MyLinkedList;

public class MyStack<E> {     
	
	private MyLinkedList<E> st = new MyLinkedList<>();
	
	void push(E data) {
		 st.toAdd(data);
	 }
	 
	E pop() throws Exception {
		if(st.isEmpty()) {
			throw new Exception("Popping from empty stack is not allowed");
		}
		
		int size = st.size();
		
		E temp = st.toGet(size - 1);
		st.removeLast();
		return temp;
		
	 }

	E peek() throws Exception{
		int size = st.size();
		if(size == 0) {
			throw new Exception("could not peek an empty stack");
		}
		return st.toGet(size - 1);
		
	}

}