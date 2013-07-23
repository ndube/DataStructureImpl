package com.neha.heap;

public class MaxHeapTest {

	public static void main(String[] args) {
		
		int[] data = new int[]{27, 17, 3, 16, 13, 10, 1, 5, 7, 12, 4, 8, 9, 0};
		
		int[] data2 = new int[]{4, 1, 3, 2, 16, 9, 10, 14, 8, 7};
		
		MaxHeap maxHeap = new MaxHeap(data);
		
		maxHeap.maxHeapfiyIterative(2);
		
		System.out.println("Max Heapfiy on 2nd postion: " + maxHeap.getHeapElement(2));
		
		System.out.println("Max Heapfiy on 12th postion: " + maxHeap.getHeapElement(12));
		
		MaxHeap maxHeap2 = new MaxHeap(data2);
		
		maxHeap2.buildMaxHeap();
		
		System.out.println("Root of the Heap: " + maxHeap2.getHeapElement(0));
		
		int[] sortedHeap = maxHeap.heapSort();
		
		for(int i=0 ; i < sortedHeap.length ; i++){
			System.out.print(sortedHeap[i] + " ");
		}
		
		
	}

}
