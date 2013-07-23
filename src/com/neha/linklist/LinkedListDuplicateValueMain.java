package com.neha.linklist;

public class LinkedListDuplicateValueMain {
	
	public static void main(String[] args){
		
		
		LinkedList list = new LinkedList();
		
		list.insert(1);
		list.insert(2);
		list.insert(3);
		list.insert(3);
		list.insert(5);
		
		list.display();
		System.out.println();
		
		list.removeDuplicates();
		
		list.display();
		System.out.println();
		
		
	}

}
