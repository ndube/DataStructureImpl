package com.neha.stack;

import com.neha.queue.QueueImpl;
import com.neha.queue.RighHeadedQueueImpl;

public class StackUsingTwoQueues {
	
	private QueueImpl q2 = new QueueImpl();
	private RighHeadedQueueImpl q1 = new RighHeadedQueueImpl();
	
	public void push(int value){
		if(!q1.isFull()){
			q1.enqueue(value);
		}else{
			q2.enqueue(value);
		}
	}
	
	public int pull(){
		if(!q2.isEmpty()){
			return q2.dequeue();
		}else{
			return q1.dequeue();
		}
	}
	
	public void display(){
		q1.display();
		q2.display();
	}

}
