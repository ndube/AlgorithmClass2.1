package com.neha.stack;

public class ResizeArrayStack {
	
	int size;
	String[] stack;
	int head;
	
	public ResizeArrayStack(){
		stack = new String[1];
	}
	
	/**
	 * 
	 * @param value
	 */
	public void push(String value){
		if(size == stack.length){
			resizeStack(2 * stack.length);
		}
		stack[head++] = value;
		size++;
	}

	private void resizeStack(int capacity) {
		String[] copy = new String[capacity];
		
		for(int i=0; i<stack.length && i<copy.length ;i++){
			copy[i] = stack[i];
		}
		
		this.stack = copy;
		
	}
	
	public String pull(){
		String value = stack[--head];
		stack[head] = null;  			// Solving the Loitering problem
		size--;
		if(size <= stack.length/4){
			resizeStack(stack.length/2);
		}
		
		return value;
	}
	
	public String peek(){
		
		int index = head -1;
		return stack[index];
	}
	
	public int capacity(){
		return stack.length;
	}
	
	public int size(){
		return this.size;
	}
}
