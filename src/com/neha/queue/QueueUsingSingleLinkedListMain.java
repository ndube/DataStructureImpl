package com.neha.queue;


public class QueueUsingSingleLinkedListMain {

	
	public static void main(String[] args) {		
		
		QueueUsingSingleLinkedList queue = new QueueUsingSingleLinkedList();
		
		queue.enqueue(1);
		queue.enqueue(2);
		queue.enqueue(3);
		queue.enqueue(4);
		queue.enqueue(5);
		
		queue.display();
		
		System.out.print(queue.dequeue());
		System.out.print(queue.dequeue());
		
		queue.display();
		
	

	}

}
