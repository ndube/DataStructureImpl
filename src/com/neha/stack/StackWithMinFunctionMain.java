package com.neha.stack;

public class StackWithMinFunctionMain {
	
	
	public static void main(String[] args){
		StackWithMinFunction stack = new StackWithMinFunction();
		
		
		stack.push(5);
		stack.push(2);
		stack.push(4);
	//	stack.push(1);
		stack.push(7);
		stack.push(8);
		
		stack.display();
		
		System.out.println();
		
		System.out.println(" Min      " +stack.min());
		
		System.out.println("   Pull      "+ stack.pull());
		
		
	}

}
