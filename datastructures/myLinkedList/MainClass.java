package datastructures.myLinkedList;

public class MainClass {

	public static void main(String[] args) throws Exception {
				
		MyLinkedList<Integer> ll = new MyLinkedList<>();
		MyLinkedList<Integer> ll2 = new MyLinkedList<>();
		
		ll.toAdd(56);
//		ll.toAdd(78);
		ll2.toAdd(56);
		
		
		ll.removeAll(ll2);
		
		
		
		//System.out.println(ll.contains(2));
		
//		ll.removeLast();
//		
		ll.toPrintAll();
		
//		ll.toAdd("hey");
//		ll.toAdd(3);
//		ll.toAdd(true);
		
//		ll.remove(2);
//		
//		ll.toSet(1, 1000);
//		
//		System.out.println(ll.toGet(0));
//		System.out.println(ll.size());
//		System.out.println(ll.contains(67));
//		System.out.println();
	//	ll.toPrintAll();
	//	ll.toPrintIndex(2, 4);
		
	}

}

