package com.neha.queue;

public class QueueUsingTwoStackMain {
	
	
	public static void main(String[] args){
		QueueUsingTwoStack queue = new QueueUsingTwoStack();

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
