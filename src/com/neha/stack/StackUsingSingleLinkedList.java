package com.neha.stack;

import com.neha.linklist.LinkedList;
import com.neha.linklist.Node;
import com.neha.linklist.ReverseLinkedList;

public class StackUsingSingleLinkedList {
	
	private ReverseLinkedList list = new ReverseLinkedList();
	
	public boolean isEmpty(){
		return list.isEmpty();
	}
	
	public void push(int value){
		list.insert(value);
	}
	
	public int pull(){
		if(list.isEmpty()){
			return -1;
		}else{
			int value = list.current.key;
			list.current = list.current.next;
			return value;
		}
	}
	
	
	
	public void dispaly(){
		list.display();
	}

}
