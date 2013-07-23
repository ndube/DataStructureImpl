package com.neha.linklist;

public class LinkedList {

	public Node first;
	public Node current;
	public Node previous;

	public boolean isEmpty(){
		return current == null;
	}

	public void insert(int key){
		Node newNode = new Node(key);
		if(isEmpty()){
			first = newNode;
			current = newNode;

		}else{
			current.next = newNode;
			previous = current;
			current = current.next;

		}		
	}

	public void delete(int key){
		Node index = first;
		Node previous = null;
		while(index!=null && index.key!= key){
			previous = index;
			index = index.next;
		}

		previous.next = index.next;
	}

	public int search(int key){

		Node index = first;
		while(index!=null && index.key!= key){
			index = index.next;
		}
		return index.key;
	}

	public int searchRecursive(int key, Node node){
		if(isEmpty()){
			return -1;
		}
		
		if(node==null){
			if(first.key == key){
				return first.key;
			}else{
				return searchRecursive(key, first.next);
			}
		}else{
			if(node.key == key){
				return node.key;
			}else{
				return searchRecursive(key, node.next);
			}
		}
		
	}
	
	public void reverse(){
		if(isEmpty()){
			return ;
		}
		
		Node index1 = first;
		Node index2 = index1.next;
		Node index3 = index2.next;
		index1.next = null;
		
		while(index3!=null){
			index2.next = index1;
			
			index1 = index2;
			index2 = index3;
			index3 = index3.next;
		}
		
		first = index2;
		index2.next = index1;
	}

	public void display(){
		Node index = first;
		while(index!=null){
			System.out.print(index.key);
			index = index.next;
		}
	}
	
	public void removeDuplicates(){
		if(isEmpty()){
			return;
		}
		Node index1 = first;
		Node index2 = index1.next;
		
		while(index2!=null){
			if(index1.key == index2.key){
				index1.next = index2.next;
				return;
			}
			index1 = index2;
			index2 = index2.next;
		}
	}
	
	public int getKthElement(int k){
		Node index = first;
		Node kthIndex = first;
		
		while(k>0){
			kthIndex = kthIndex.next;
			k--;			
		}
		
		while(kthIndex!=null){
			kthIndex = kthIndex.next;
			index = index.next;
		}
		
		return index.key;
	}
	
	public void deleteMidElement(){
		if(isEmpty()){
			return;
		}
		Node midPrev = null;
		Node mid = first;
		Node index = first.next;
		
		while(index!=null){
			index = index.next.next;
			midPrev = mid;
			mid = mid.next;			
		}
		
		midPrev.next = mid.next;
	}
	
}
