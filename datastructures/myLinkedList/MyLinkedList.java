package datastructures.myLinkedList;

 public class MyLinkedList<E> {

	private Node<E> head ;
	
	public void toAdd(E data) {
		
		Node<E> toAdd = new Node<E>(data);
		
		if(head == null) {
			head=toAdd;
			return;
		}
		
		Node<E> temp = head;
		while(temp.next != null) {
			temp = temp.next;
		}
		temp.next = toAdd;
		toAdd.prev = temp;
		
	}
	
	public void toPrintAll() {
		Node<E> temp = head;
		while(temp != null) {
			System.out.println(temp.data);
			temp = temp.next;
		}
	}
	
	public void toPrintIndex(int start , int end) {
		
		Node<E> startNode = head;
		for(int i=0 ; i<start ; i++) {
			startNode = startNode.next;
		}
		for(int i=0 ; i<=end - start  ; i++) {
			System.out.println(startNode.data);
			startNode = startNode.next;
		}
	}

	public void remove(int index) {
		Node<E> toRemove = head;
		if(index>0) {
		for(int i=0 ; i<index ; i++) {
			toRemove = toRemove.next;			
		}
		Node<E> temp = toRemove;
		toRemove = toRemove.prev;
		toRemove.next = temp.next;
		}
		else {
			head = head.next;
		}
	}
	
	public void clear () {
		Node<E> temp = head;
		Node<E> temp2 = head;
		while(temp.next != null) {
			 temp2 = temp.next;
			 temp.next = null;
			 temp = temp2;
		}
		head = null;
	}
	
	public void removeLast() throws Exception{
		if(head==null) {
			throw new Exception("removeLast Exception");
		}
		
		Node<E> toRemove = head;
		
		if(toRemove.next == null) head = null;
		else {
			while(toRemove.next.next != null) {
				toRemove = toRemove.next;
			}
				toRemove.next = null;
		}
	  
	}
	
	public E toGet(int index) {
		Node<E> toGet = head;
		for(int i=0 ; i<index ;i++) {
			toGet = toGet.next;
		}
		return toGet.data;
	}

	public void toSet(int index , E value) {
		Node<E> toSet = head;
		for(int i=0 ; i<index ;i++) {
			toSet = toSet.next;
		}
		toSet.data = value;
	}
	
	public int size() {
		int size =0;
		
		if(head==null) return size;
		
		Node<E> temp = head;
		while(temp.next != null) {
			temp = temp.next;
			size++;	
		}
		return size +1;
	}
	
	public boolean contains(E value) {
		Node<E> temp = head;

		while(temp != null) {
			if(temp.data == value) {
				return true;
			}
			temp = temp.next;
		}
		return false;
	}
	
	public void removeByNext(int position) {

        Node<E> temp = head;
        
        if(position ==0) {
        	head = head.next;
        }
        
        while(position-->1) {
            temp = temp.next;
        }
        temp.next= temp.next.next;
        
      }
	
	public boolean isEmpty() {
		if(head == null) return true;
		else return false;
		
	}
	
	public void removeAll(MyLinkedList<E> a) {
		Node<E> temp = a.head;
		int i=0;
		while(temp != null){
			if(contains(temp.data)) remove(i);
			temp = temp.next;
			i++;
		}
		
	}

	public static class Node<E> {
		public E data;
		public Node<E> next;
		public Node<E> prev;
		
		public Node(E data) {
				this.data = data;
				this.next = null;
				this.prev = null;
				
			}
	}
 }