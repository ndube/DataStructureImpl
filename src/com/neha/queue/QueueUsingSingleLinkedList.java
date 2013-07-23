package com.neha.queue;

import com.neha.linklist.LinkedList;

public class QueueUsingSingleLinkedList {
	
	private LinkedList list = new LinkedList();
	
	public boolean isEmpty(){
		return list.isEmpty();
	}
	
	public void enqueue(int value){
		list.insert(value);
	}
	
	public int dequeue(){
		int value = list.first.key;
		list.first = list.first.next;
		return value;
	}
	
	public void display(){
		list.display();
	}

}
