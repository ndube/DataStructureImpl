package com.neha.heap;

public class MaxHeapTest {

	public static void main(String[] args) {
		
		int[] heap = new int[]{27, 17, 3, 16, 13, 10, 1, 5, 7, 12, 4, 8, 9, 0};
		
		MaxHeap maxHeap = new MaxHeap(heap);
		
		maxHeap.maxHeapfiyIterative(2);
		
		System.out.println("Max Heapfiy on 2nd postion: " + maxHeap.getHeapElement(2));
		
		System.out.println("Max Heapfiy on 12th postion: " + maxHeap.getHeapElement(12));
	}

}
