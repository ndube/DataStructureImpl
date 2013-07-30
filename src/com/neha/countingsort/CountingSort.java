package com.neha.countingsort;

/**
 * This class sorts the data from min to max
 * @author ndube
 *
 */
public class CountingSort {
	
	public static void sort(int[] A, int k){
		
		int[] C = new int[k];
		int[] B = new int[A.length];
		
		// This step accumulates the count of each element in the array.
		for(int i=0; i<A.length ;i++){
			C[A[i]] = C[A[i]] + 1;
		}
		
		// This step is used to get the positions of each element in a sorted array.
		// Each value indicates how many elements are less than it.
		for(int i=0;i<C.length;i++){
			if(i>0){
				C[i] = C[i] + C[i-1];
			}			
		}
		
		for(int i=A.length-1; i>=0 ; i--){		// Why loop from n to 1?
												// From A.length to 0 is key to stable sort. As 2nd same element was added last
												// in determining the position in 2nd loop, we need to take the last first
												// and place it from end. 
			B[C[A[i]]] = A[i];
			C[A[i]] = C[A[i]] - 1; 				// Subtracting -1 for the subsequent position for same value elements.
		}
		
		
		
		
			
	}

}
