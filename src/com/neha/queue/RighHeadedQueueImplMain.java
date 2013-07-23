package com.neha.queue;

public class RighHeadedQueueImplMain {
	
	public static void main(String[] args){
		
		RighHeadedQueueImpl queue = new RighHeadedQueueImpl();
		
		for(int i=0;i<QueueImpl.size;i++){
			queue.enqueue(i+1);
		}
		
		queue.display();
		
		System.out.println();
		
		for(int i=0;i<QueueImpl.size;i++){
			System.out.print(queue.dequeue());
		}
		

	}

}
