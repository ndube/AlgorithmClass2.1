package com.neha.queue;

public class ArrayQueue {
	
	int size;
	String[] queue;
	int first;
	int last;
	
	public ArrayQueue(int capacity){
		queue = new String[capacity];
	}
	
	public boolean isEmpty(){
		return size == 0;
	}
	
	public boolean isFull(){
		return size == queue.length;
	}
	
	public void enqueue(String value){
		
		if(isEmpty()){
			queue[first] = value;
			last++;
			size++;
		}else if(!isFull()){
			queue[last++] = value;
			size++;
		}
		
	}
	
	public String dequeue(){
		String value = null;
		if(!isEmpty()){
			value = queue[first];
			queue[first] = null;			//Loitering problem solved.
			first++;
			size--;
		}
		
		return value;
	}

}
