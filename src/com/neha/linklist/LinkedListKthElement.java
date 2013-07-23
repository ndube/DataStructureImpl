package com.neha.linklist;

public class LinkedListKthElement {
	
	public static void main(String[] args){
		
		LinkedList list = new LinkedList();

		list.insert(1);
		list.insert(2);
		list.insert(3);
		list.insert(4);
		list.insert(5);

		list.display();
		System.out.println();
		
		System.out.println(list.getKthElement(2));
	}

}
