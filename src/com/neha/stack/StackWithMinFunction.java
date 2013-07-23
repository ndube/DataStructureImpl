package com.neha.stack;

public class StackWithMinFunction {
	
	public static final int size = 10;

	private int[] stack = new int[size];
	private int index;
	private int minValue;
	private int minIndex;
	
	
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
		if(isEmpty()){
			minValue = value;
		}
		if(minValue > value){
			minValue = value;
			minIndex = index;
		}
		stack[index++]= value;
	}
	
	public int pull(){
		
		return stack[--index];
	}
	
	public int min(){
		if(stack[0]!=0){
			return stack[0];
		}else{
			return stack[1];
		}
	}
	
	public void display(){
		for(int i=0;i<size;i++){
			System.out.print(stack[i]);
		}
	}
}
