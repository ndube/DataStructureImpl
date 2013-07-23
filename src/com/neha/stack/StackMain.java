package com.neha.stack;

public class StackMain {
	
	public static void main(String[] args){
		
		StackImpl stack = new StackImpl();
		
				
		for(int i=0; i< StackImpl.size ;i++){
			stack.push(i + 1);
		}
		
		stack.display();
		
		System.out.println();
		
		for(int i=0;i<StackImpl.size;i++){
			System.out.print(stack.pull());
		}
		

		
		
		
	}

}
