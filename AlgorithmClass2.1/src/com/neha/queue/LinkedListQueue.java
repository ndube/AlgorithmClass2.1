package com.neha.queue;

public class LinkedListQueue {
	
	int size;
	Node first;
	Node last;
	
	
	class Node{
		String item;
		Node next;
	}
	
	public boolean isEmpty(){
		return size == 0;
	}
	
	public void enqueue(String item){
		Node newNode = new Node();
		newNode.item = item;
		
		if(isEmpty()){
			first = newNode;
			last = first;
		}else{
			last.next = newNode;
			last = last.next;
		}
		size++;
	}
	
	public String dequeue(){
		String value = null;
		if(!isEmpty()){
			value = first.item;
			first = first.next;
			size--;
		}
		return value;
	}
	

}
