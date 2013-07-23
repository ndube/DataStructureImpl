package com.neha.linklist;

public class DoubleLinkedList {

	private DNode first;
	private DNode current;
	//private DNode predecesor = current;

	public boolean isEmpty(){
		return first == null;
	}

	public void insert(int key){
		DNode newNode = new DNode(key);

		if(isEmpty()){
			first = newNode;
			current = newNode;						
		}else{			
			current.next = newNode;
			newNode.previous = current;
			current = current.next;
		}
	}

	public int search(int key){
		DNode index = first;
		while(index!=null && index.key!=key){
			index = index.next;
		}

		return index.key;
	}

	public void delete(int key){
		DNode index = first;
		DNode predecessor = null;
		while(index!=null && index.key!=key){
			predecessor = index;
			index = index.next;
		}
		DNode successor = index.next;
		predecessor.next = successor;
		successor.previous = predecessor;

	}

	public void display(){
		DNode index = first;
		while(index!=null){
			System.out.print(index.key);
			index = index.next;
		}
	}

	public void reverseDisplay(){
		DNode index = current;
		while(index!=null){
			System.out.print(index.key);
			index = index.previous;
		}
	}

}

class DNode{
	public int key;
	public DNode next;
	public DNode previous;

	public DNode(int key){
		this.key = key;
	}

}


