package com.neha.queue;

import com.neha.stack.StackImpl;

public class QueueUsingTwoStack {
	
	private StackImpl inbox = new StackImpl();
	private StackImpl outbox = new StackImpl();
	
	public void enqueue(int value){
		inbox.push(value);
	}
	
	public int dequeue(){
		if(outbox.isEmpty()){
			while(!inbox.isEmpty()){
				outbox.push(inbox.pull());
			}
		}
		
		return outbox.pull();
	}
	
	public void display(){
		inbox.display();
	}
	
	
}
