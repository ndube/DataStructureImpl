package com.neha.heap;

public class MaxHeap {
	
	private int[] heap;
	private int heapSize;
	
	public MaxHeap(int[] heap){
		this.heap = heap;
		heapSize = heap.length;
	}
	
	
	
	public void buildMaxHeap(){
		if(isEmpty()){
			return ;
		}
		
		for(int i=(heapSize/2)-1; i >=0 ; i--){
			maxHeapfiyIterative(i);
		}
		
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
	
	public int[] heapSort(){
		int[] sortedHeap = new int[heapSize];		
		
		while(heapSize >= 2){
			sortedHeap[heapSize-1] = heap[0];
			heap[0] = heap[heapSize-1];
			heapSize--;
			maxHeapify(0);
		}
		
		sortedHeap[0] = heap[0];
		
		return sortedHeap;
	}
	
	public int heapExtractMax(){
		
		if(isEmpty()){
			return -1;
		}
		
		int max = heap[0];
		
		heap[0] = heap[heapSize -1];
		heapSize--;
		maxHeapify(0);
		return max;
	}
	
	public void heapIncreaseKey(int key, int value){
		if(key >= heapSize || heap[key] > value){
			return;
		}
		
		
		
		
	}
	
	public int getHeapElement(int i){
		if(i < heapSize && i>= 0){
			return heap[i];
		}
		
		return -1;
	}
	
	private boolean isEmpty() {		
		return heapSize == 0;
	}
	
	
	

}
