package com.neha.linklist;

public class UnionOfTwoList_O_1_Time {
	
	public static void main(String[] args){
		
		LinkedList listOne = new LinkedList();
		
		listOne.insert(1);
		listOne.insert(2);
		listOne.insert(3);
		listOne.insert(4);
		listOne.insert(5);
		
		LinkedList listTwo = new LinkedList();
		
		listTwo.insert(6);
		listTwo.insert(7);
		listTwo.insert(8);
		listTwo.insert(9);
		listTwo.insert(10);
		
		Node head = union(listOne, listTwo);
		
		Node index = head;
		while(index!=null){
			System.out.println(index.key);
			index = index.next;
		}
		
		
		
		
	}
	
	public static Node union(LinkedList listOne, LinkedList listTwo){
		listOne.current.next = listTwo.first;
		return listOne.first;
	}

}
