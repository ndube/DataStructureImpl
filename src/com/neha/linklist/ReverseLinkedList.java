package com.neha.linklist;

public class ReverseLinkedList {
	
	public Node first;
	public Node current;
	
	
	public boolean isEmpty(){
		return first == null;
	}

	public void insert(int key){
		Node newNode = new Node(key);
		if(isEmpty()){
			first = newNode;
			current = newNode;
		}else{
			
			newNode.next = current;
			current = newNode;
		}
	}
	
	public void display(){
		Node index = current;
		while(index!=null){
			System.out.println(index.key);
			index = index.next;
		}
		
	}
}
