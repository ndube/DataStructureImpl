package com.neha.quicksort;

public class QuickSort {
	
	public static void sort(int[]A, int p, int r){
		
		if(p < r){
			int q = partition(A, p, r);
			
			sort(A, p, q);
			sort(A, q+1, r);
		}		
		
	}
	
	
	
	public static int partition(int[] A, int p, int r){		
		
		int i = p-1;  					// This index is used to interpret/assume that the value at it is greater than value at j 
										// and used to replace/swap the values at i and j.
		
		int pivet = r;
		int pivetValue = A[pivet];
		
		for(int j = p; j < r ; j++){	// This index is used to scan the elements in the array and compare with the pivet value.
			
			if(A[j] <= pivetValue){
				i++;
				exchange(i, j, A);
			}
		}
		
		exchange(i+1, r, A);		
		
		return i+1;
	}

	private static void exchange(int i, int j, int[] A) {
		
		if(i == j){
			return;
		}
		
		int temp = A[j];
		A[j] = A[i];
		A[i] = temp;
		
	}

}
