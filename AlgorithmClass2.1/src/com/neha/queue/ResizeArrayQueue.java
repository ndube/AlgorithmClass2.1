package com.neha.queue;

/**
 * Time Complexity: 
 * Space Complexity: 8N + 64
 * @author ndube
 *
 */
public class ResizeArrayQueue {
	
	int size;
	String[] queue;
	int first;
	int last;
	
	public ResizeArrayQueue(){
		this.queue = new String[1];
	}
	
	public boolean isEmpty(){
		return size==0;
	}
	
	/**
	 * TC: 
	 * @param value
	 */
	public void enqueue(String value){
		if(size == queue.length){
			resize(2*queue.length);
		}
		
		queue[last++] = value;
		size++;
	}
	
	private void resize(int capacity) {
		String[] copy = new String[capacity];
		
		for(int i=0; i<queue.length && i<copy.length ; i++){
			copy[i] = queue[i];
		}
		queue = copy;
	}

	/**
	 * TC: 
	 * @return
	 */
	public String dequeue(){
		String value = null;
		if(!isEmpty()){
			value = queue[first++];
			
			if(size <= queue.length/4){
				resize(queue.length/2);
			}
			
			size--;
		}
		return value;
	}

}
