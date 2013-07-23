package com.neha.stack;

public class TwoStackImpl {
	
	public static final int size = 10;
	
	private int[] stack = new int[size];
	public int index1;
	public int index2 = size/2;
	
	public boolean isStackOneEmpty(){
		if(index1 == 0 ){
			return true;
		}else{
			return false;
		}
	}
	
	public boolean isStackTwoEmpty(){
		if(index2 == size/2){
			return true;
		}else{
			return false;
		}
	}
	
	public boolean isStackOneFull(){
		if(index1 == size/2){
			return true;
		}else{
			return false;
		}
	}
	
	public boolean isStackTwoFull(){
		if(index2 == size){
			return true;
		}else{
			return false;
		}
	}
	
	public void pushStackOne(int value){
		if(!isStackOneFull()){
			stack[index1++] = value;
		}		
	}
	
	public void pushStackTwo(int value){
		if(!isStackTwoFull()){
			stack[index2++] = value;
		}		
	}
	
	public int pullStackOne(){
		if(!isStackOneEmpty()){
			return stack[--index1];
		}
		
		return -1;
	}
	
	public int pullStackTwo(){
		if(!isStackTwoEmpty()){
			return stack[--index2];
		}
		
		return -1;
	}
	
	public void displayStackOne(){
		for(int i=0;i<size/2;i++){
			System.out.print(stack[i]);
		}
	}
	
	public void displayStackTwo(){
		for(int i=size/2;i<size;i++){
			System.out.print(stack[i]);
		}
	}

}
