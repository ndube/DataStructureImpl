package com.neha.linklist;

public class DoubleLinkedListMain {
	
	public static void main(String[] args){
		DoubleLinkedList list = new DoubleLinkedList();
		
		list.insert(1);
		list.insert(2);
		list.insert(3);
		list.insert(4);
		list.insert(5);
		
		list.display();
		System.out.println();
		
		list.delete(3);
		
		list.display();
		System.out.println();
		
		System.out.println(list.search(4));
		System.out.println();
		
		list.reverseDisplay();
		System.out.println();
		
	}

}
