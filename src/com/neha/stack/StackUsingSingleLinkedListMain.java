package com.neha.stack;

public class StackUsingSingleLinkedListMain {
	
	public static void main(String[] args){
		
		
		StackUsingSingleLinkedList stack = new StackUsingSingleLinkedList();
		
		stack.push(1);
		stack.push(2);
		stack.push(3);
		stack.push(4);
		stack.push(5);
		
		stack.dispaly();
		
		System.out.println(stack.pull());
		System.out.println(stack.pull());
		
		stack.dispaly();
		
	}

}
