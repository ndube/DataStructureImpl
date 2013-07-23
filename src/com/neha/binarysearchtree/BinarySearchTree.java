package com.neha.binarysearchtree;



public class BinarySearchTree {
	
	public BSTNode root;
	
	public boolean isEmpty(){
		return root == null;
	}
	
	public void insertNonRecursive(int value){
		BSTNode y = null;
		BSTNode newNode = new BSTNode();
		newNode.value = value;
		if(isEmpty()){
			root = newNode;			
		}else{
			BSTNode i = root;
			BSTNode n = null;
			while(i!=null){
				n = i;
				if(value < i.value){
					i = i.left;
				}else{
					i = i.right;
				}
				
			}
			y = n;
		}
		newNode.p = y;
		if(y!=null){
			if(newNode.value < y.value){
				y.left = newNode;
			}else{
				y.right = newNode;
			}
		}
		
	}
	
	//TODO: Re think and implement
	public void insertRecursive(int value, BSTNode node){
		
	}
	
	
	
	public void delete(BSTNode node){
		if(node == null){
			return;
		}
		
		if(node.left == null && node.right==null){
			if(node.value < node.p.value){
				node.p.left = null;
			}else{
				node.p.right = null;
			}
		}
		
		if(node.left!=null || node.right!=null){
			BSTNode successor = successor(node);
			bstSwap(node, successor);
		}
	}
	
	private void bstSwap(BSTNode node, BSTNode successor) {
		BSTNode nL = node.left;
		BSTNode nR = node.right;
		BSTNode nP = node.p;
		BSTNode sR = successor.right;
		BSTNode sP = successor.p;
		
		sP.left 		= sR;
		if(sR!=null)	{sR.p = sP;}		
		
		if(nL!=null)	{nL.p = successor;}
		if(nR!=null)	{nR.p = successor;}
		successor.p 	= nP;
		
		if(successor.value < nP.value){
			nP.left = successor;
		}else{
			nP.right = successor;
		}
		
	}

	public void inOrderTreeWalk(BSTNode i){
		if(i !=null){
			inOrderTreeWalk(i.left);

			System.out.print(i.value);
			
			inOrderTreeWalk(i.right);
		}		 			
		
	}
	
	public void inOrderTreeWalkNonRecursive(BSTNode n){
		
		int count = 0;
		
		BSTNode i = min(n);
		BSTNode node = null;
		System.out.print(i.value);
		
		while(i!=null){
			node = i;			
			BSTNode successor = successor(node);
			if(successor!=null){
				System.out.print(successor.value);
			}
			
			i = successor;
			count++;
		}
		
	}
	
	//TODO: Re think and implement.
	public void inOrderTreeWalkNonRecursiveTwo(BSTNode n){
		
	}
	
	//TODO: Re think and implement
	public void inOrderTreeWalkUsingStack(BSTNode n){
		
		
		
	}
	
	
	// Prints the root before the values in either sub tree
	public void preOrderTreeWalk(BSTNode node){
		BSTNode n = node;
		
		
		if(n !=null){
			System.out.print(n.value);
			
			inOrderTreeWalk(n.left);			
			
			inOrderTreeWalk(n.right);
		}		 			
		
	
	}
	
	//TODO: Re think and implement
	// Prints the root before the values in either sub tree
	public void preOrderTreeWalkNonRecursive(BSTNode node){
		
	}
	
	
	// Prints the root after the values in its subtrees.
	public void postOrderTreeWalk(BSTNode n){
		
		if(n !=null){
			inOrderTreeWalk(n.left);			
			
			inOrderTreeWalk(n.right);
			
			System.out.print(n.value);
		}		 			
		
	
	}
	
	//TODO: Re think and implement
	// Prints the root after the values in its subtrees.
	public void postOrderTreeWalkNonRecursive(BSTNode n){
		
	}
	
	public BSTNode min(){
		if(isEmpty()){
			return null;
		}
		
		BSTNode i = root;
		BSTNode min = null;
		while(i != null){
			min = i;
			i = i.left;
		}
		return min;
	}
	
	public BSTNode search(int value){
		BSTNode i = root;
		BSTNode node = null;
		
		while(i!=null){
			node = i;
			if(node.value == value){
				return node;
			}
			if(value < i.value){
				i = i.left;
			}else{
				i = i.right;
			}
		}
		
		return null;
	}
	
	public BSTNode min(BSTNode node){
		if(node == null){
			return null;
		}
		
		BSTNode i = node;
		BSTNode n = null;
		
		while(i!=null){
			n = i;
			i = i.left;
		}
		return n;
	}
	
	public BSTNode max(BSTNode node){
		if(node == null){
			return null;
		}
		BSTNode max = null;
		while(node!=null){
			max = node;
			node = node.right;
		}
		return max;
	}
	
	public BSTNode successor(BSTNode node){
		if(node == null){
			return null;
		}
		
		if(node.right != null){
			return min(node.right);
		}
		
		BSTNode i = node;
		BSTNode y = null;
		
		while(i!=null && i.right == y){
			y = i;
			i = i.p;
		}		
		return i;
		
	}
	
	public BSTNode predecessor(BSTNode node){
		if(node == null){
			return null;
		}
		
		if(node.left != null){
			return max(node.left);
		}
		
		BSTNode i = node;
		BSTNode y = null;
		
		while(i!=null && i.left == y){
			y = i;
			i = i.p;
		}
		return y;
	}
	
	
}


class BSTNode{
	public BSTNode p;
	public BSTNode left;
	public BSTNode right;
	
	public int value;
}
