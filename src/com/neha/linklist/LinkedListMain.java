package com.neha.linklist;

public class LinkedListMain {
	
	public static void main(String[] args){
		LinkedList list = new LinkedList();
		
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
		
		System.out.println(list.searchRecursive(4, null));
		
		list.reverse();
		
		list.display();
		System.out.println();
	}

}
