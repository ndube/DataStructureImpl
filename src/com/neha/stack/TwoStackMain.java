package com.neha.stack;

public class TwoStackMain {
	
	public static void main(String[] args) {
		
		TwoStackImpl stack = new TwoStackImpl();
		
				
		for(int i=0; i< StackImpl.size ;i++){
			stack.pushStackOne(i + 1);
			stack.pushStackTwo(StackImpl.size/2 + i + 1);
		}
		
		stack.displayStackOne();
		stack.displayStackTwo();
		
		System.out.println();
		
		System.out.println(stack.index1);
		System.out.println(stack.index2);
		
		
		
		for(int i=0;i<StackImpl.size/2;i++){
			System.out.print(stack.pullStackOne());			
		}
		
		for(int i=0;i<StackImpl.size/2;i++){			
			System.out.print(stack.pullStackTwo());
		}
		
		System.out.println();
		

		
		
		
	
		
	}

}
