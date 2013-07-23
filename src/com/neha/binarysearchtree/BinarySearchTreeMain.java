package com.neha.binarysearchtree;

public class BinarySearchTreeMain {
	
	public static void main(String[] args){
		
		BinarySearchTree bst = new BinarySearchTree();
		
		/*bst.insertNonRecursive(5);
		bst.insertNonRecursive(3);
		bst.insertNonRecursive(6);
		bst.insertNonRecursive(2);
		bst.insertNonRecursive(8);
		bst.insertNonRecursive(4);*/
		
		bst.insertRecursive(5, null);
		bst.insertRecursive(3, null);
		bst.insertRecursive(6, null);
		bst.insertRecursive(2, null);
		bst.insertRecursive(8, null);
		bst.insertRecursive(4, null);
		
		bst.inOrderTreeWalk(bst.root);
		System.out.println();
		
		BSTNode delNode = bst.search(6);
		
		bst.delete(delNode);
		
		bst.inOrderTreeWalkNonRecursive(bst.root);
		System.out.println();
		
		bst.preOrderTreeWalk(bst.root);
		System.out.println();
		
		bst.postOrderTreeWalk(bst.root);
	}

}
