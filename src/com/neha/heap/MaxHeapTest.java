package com.neha.heap;

public class MaxHeapTest {

	public static void main(String[] args) {
		
		int[] data = new int[]{27, 17, 3, 16, 13, 10, 1, 5, 7, 12, 4, 8, 9, 0};
		
		int[] data2 = new int[]{4, 1, 3, 2, 16, 9, 10, 14, 8, 7};
		
		MaxHeap maxHeap = new MaxHeap(data);
		
		maxHeap.maxHeapfiyIterative(2);
		
		System.out.println("Max Heapfiy on 2nd postion: " + maxHeap.getHeapElement(2));
		
		System.out.println("Max Heapfiy on 12th postion: " + maxHeap.getHeapElement(12));
		
		maxHeap.buildMaxHeap();
		
		for(int i=0 ; i < maxHeap.size() ; i++){
			System.out.print(maxHeap.getHeapElement(i) + " ");
		}
		
		System.out.println();
		
		maxHeap.heapIncreaseKey(13, 30);
		
		maxHeap.heapInsert(40);
		
		maxHeap.heapDecreaseKey(0, 2);
		
		for(int i=0 ; i < maxHeap.size() ; i++){
			System.out.print(maxHeap.getHeapElement(i) + " ");
		}
		
		System.out.println("Root of MaxHeap: " + maxHeap.getHeapElement(0));
		
		MaxHeap maxHeap2 = new MaxHeap(data2);
		
		maxHeap2.buildMaxHeap();
		
		System.out.println("Root of the Heap: " + maxHeap2.getHeapElement(0));
		
		System.out.println("Extract Max element: " + maxHeap2.heapExtractMax());
		
		System.out.println("Root element of MaxHeap2: " + maxHeap2.getHeapElement(0));
		
		int[] sortedHeap = maxHeap.heapSort();
		
		for(int i=0 ; i < sortedHeap.length ; i++){
			System.out.print(sortedHeap[i] + " ");
		}
		
		
	}

}
