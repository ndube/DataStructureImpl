package com.neha.stack;

public class StackUsingTwoQueuesMain {
	
	public static void main(String[] args){
		
		StackUsingTwoQueues stack = new StackUsingTwoQueues();
		
		int size = 20;
		
				
		for(int i=0; i< size ;i++){
			stack.push(i + 1);
		}
		
		stack.display();
		
		System.out.println();
		
		for(int i=0;i<size;i++){
			System.out.print(stack.pull());
		}		
	}

}
