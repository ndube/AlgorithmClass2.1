package com.neha.linkedlist;


public class RandomDoubleLinkedList {
	
	int size;
	Node first;
	Node current;
	
	class Node{
		int value;
		Node next;
		Node random;
	}
	
	public boolean isEmpty(){
		return size == 0;
	}
	
	public void add(int value){
		Node newNode = new Node();
		newNode.value = value;
		
		if(isEmpty()){
			first = newNode;
			current = first;
		}else{
			current.next = newNode;
			current = current.next;
		}
		size++;
	}
	
	public void initRandom(){
		Node preIndex = null;
		Node index = first;
		Node postIndex = index.next;
		
		while(index!=null && postIndex!=null){
			preIndex = index;
			Node r = postIndex.next;
			if(r!=null){
				index.random = r;
			}else{
				index.random = preIndex;
			}
			index = index.next;
			postIndex = postIndex.next;
			
		}		
	}
	
	public Node copy(){
		Node index = first;
		Node copyFirst=null;
		while(index!=null){
			Node copyNode = new Node();
			copyNode.value = index.value;
			copyNode.next = index.next;
			copyNode.random = index.random;
			
			if(index == this.first){
				copyFirst = index;
			}
			index = index.next;
		}
		return copyFirst;
	}

	public void display() {
		if(!isEmpty()){
			Node index = first;
			while(index!=null){
				System.out.print(index.value + " ");
				index = index.next;
			}
		}
	}

}
