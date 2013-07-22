package com.neha.stack;

/**
 * Stack with max. 
 * Create a data structure that efficiently supports the stack operations (push and pop)
 *  and also a return-the-maximum operation. Assume the elements are reals numbers 
 *  so that you can compare them.
 *  
 * Time Complexity: 
 * Space Complexity: 
 * @author ndube
 *
 */
public class StackWithMaxAndMin {
	
	int[] stack;
	
	int size;
	int min;
	int max;
	int head;
	
	public StackWithMaxAndMin(){
		stack = new int[1];
	}
	
	public boolean isEmpty(){
		return size==0;
	}
	
	public void push(int value){
		if(size == stack.length){
			resize(2*stack.length);
		}
		stack[head++] = value;
		if(value < min){
			min = value;
		}
		
		if(value > max){
			max = value;
		}
		size++;
	}

	private void resize(int capacity) {
		int[] copy = new int[capacity];
		for(int i=0 ; i<stack.length && i< copy.length;i++){
			copy[i] = stack[i];
		}		
		stack = copy;		
	}
	
	public int pull(){
		int value = 0;
		if(!isEmpty()){
			 value = stack[--head];
			if(size <= stack.length/4){
				resize(stack.length/2);
			}
			size--;
		}
		
		return value;
	}
	
	public int min(){
		return this.min;
	}
	
	public int max(){
		return this.max;
	}

}
