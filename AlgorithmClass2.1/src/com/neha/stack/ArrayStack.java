package com.neha.stack;

/**
 * Collection of elements where last in, is first out. LIFO
 * 
 * Time Complexity: All operations take constant time i.e., o(c).
 * Space Complexity: 36 + 2N + 64 bytes
 * @author ndube
 *
 */
public class ArrayStack {		// 16 bytes (Object overhead)
	
	int size;					// 4 bytes
	String[] value;				// 8 (reference bytes) + 2N + 64 -> values of array
	int head;					// 4 bytes
								// 4 bytes (padding)
	
	
	/**
	 * 
	 * @param capacity	Not a good solution.
	 * Client will need to handle exceptions
	 * of over and under flows.
	 */
	public ArrayStack(int capacity){
		value = new String[capacity];
	}
	
	public boolean isEmpty(){
		return size <= 0;
	}
	
	public boolean isFull(){
		return size == value.length;
	}
	
	public void push(String item){
		if(!isFull()){
			value[head++] = item;
			value[head] = null;  			// Solving the Loitering problem
			size++;
		}
	}
	
	public String pull(){
		if(!isEmpty()){
			size--;
			return value[--head];
		}else{
			return null;
		}
	}

}
