package datastructures.myQueue;

import datastructures.myLinkedList.MyLinkedList.Node;
public class MyQueue<E> {
		private Node<E> head , rear;
		
		void enqueue(E data) {
			Node<E> toAdd = new Node<E>(data);
			if(head == null) {
				head = rear = toAdd;
				return;
			}
			rear.next = toAdd;
			rear = rear.next;
			
		}
		
		E dequeue() {
			if(head == null) {
				return null;
			}
			Node<E> temp = head;
			head = head.next;
			if(head == null) rear = null;
			return temp.data;
		}
		
		void printAll() {
			Node<E> temp = head;
			while(temp != null) {
				System.out.println(temp.data);
				temp = temp.next;
			}
		}
}
