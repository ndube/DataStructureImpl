package com.neha.hashtable;

/**
 * This is a very rudimentary Hash Table implementation
 * @author ndube
 *
 */
public class HashTable {
	
	public static final int size = 10;
	private int[] table = new int[size];
	private int minKey;
	private int min;
	
	public boolean isEmpty(){
		return false;
	}
	
	public void insert(int value){
		int key = getHashKey(value);
		table[key] = value;
		if(min > value){
			min = value;
			minKey = getHashKey(min);
		}
	}
	
	public int delete(int value){
		if(isEmpty()){
			return -1;
		}
		
		int key = getHashKey(value);
		int deletedValue = table[key];
		table[key] = -1;
		return deletedValue;
	}
	
	public int search(int value){
		if(isEmpty()){
			return -1;
		}
		int key = getHashKey(value);
		return table[key];
	}
	
	public int min(){
		return table[minKey];
	}
	
	
	private int getHashKey(int value){
		int hashKey = value;		
		return hashKey;
	}

}
