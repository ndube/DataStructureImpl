package com.neha.queue;

public class RighHeadedQueueImpl {
	
	public static final int size = 10;
	
	private int[] queue = new int[size];
	private int head;
	private int tail = size;
	
	public boolean isEmpty(){
		if(head == tail){
			return true;
		}else{
			return false;
		}
	}
	
	public boolean isFull(){
		if(head == size){
			return true;
		}else{
			return false;
		}
	}
	
	public void enqueue(int value){
		if(!isFull()){
			queue[--tail] = value;
			head++;
		}		
	}
	
	public int dequeue(){
		if(!isEmpty()){
			return queue[--head];
		}
		
		return -1;
		
	}
	
	public void display(){
		for(int i=0;i<size;i++){
			System.out.print(queue[i]);
		}
	}

}
