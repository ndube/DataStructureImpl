package com.neha.heap;

public class MaxHeap {
	
	private int[] heap;
	private int heapSize;
	
	public MaxHeap(int[] heap){
		this.heap = heap;
		heapSize = heap.length;
	}
	
	
	
	public void insert(int value){
		
	}
	
	public void maxHeapify(int i){
		
		if(i < heapSize && i >= 0 ){
			int left = 2 * i + 1;
			int right = 2 * i + 2;
			
			int largest = i;			
			
			
			if(left < heapSize && heap[largest] < heap[left] ){
				largest = left;
			}
			
			if(right < heapSize && heap[largest] < heap[right]){
				largest = right;
			}
			
			if(largest != i){
				int temp = heap[i];
				heap[i] = heap[largest];
				heap[largest] = temp;
				
				maxHeapify(largest);
			}
		}		
		
	}
	
	public void maxHeapfiyIterative(int i){
		if(i<heapSize && i>=0){
			int largest = i;
			
			while(i < heapSize){				
				
				int left = 2 * i + 1;
				int right = 2 * i + 2;
				
				if(left < heapSize && heap[largest] < heap[left] ){
					largest = left;
				}
				
				if(right < heapSize && heap[largest] < heap[right]){
					largest = right;
				}
				
				if(largest != i){
					
					int temp = heap[i];
					heap[i] = heap[largest];
					heap[largest] = temp;
					
					i = largest;
					
				}else{
					break;
				}
				
			}
		}
	}
	
	public int getHeapElement(int i){
		if(i < heapSize && i>= 0){
			return heap[i];
		}
		
		return -1;
	}
	
	
	

}
