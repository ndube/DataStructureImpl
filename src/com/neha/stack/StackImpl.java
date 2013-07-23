package com.neha.stack;

public class StackImpl {
	
	public static final int size = 10;
	private int[] stack = new int[size];
	private int index = 0;
	
	public boolean isEmpty(){
		if(index == 0){
			return true;
		}else{
			return false;
		}
	}
	
	public boolean isFull(){
		if(index == size){
			return true;
		}else{
			return false;
		}
	}
	
	public void push(int value){
		if(!isFull()){
			stack[index++] = value;		
		}
	}
	
	public int pull(){
		if(!isEmpty()){
			return stack[--index];
		}
		return -1;
	}
	
	public void display(){
		for(int i=0;i<size;i++){
			System.out.print(stack[i]);
		}
	}
	

}
