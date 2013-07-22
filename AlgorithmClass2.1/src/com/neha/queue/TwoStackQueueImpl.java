package com.neha.queue;

import com.neha.stack.ResizeArrayStack;

/**
 * Question: Queue with two stacks. Implement a queue with two stacks 
 * so that each queue operations takes a constant amortized number 
 * of stack operations.
 * @author ndube
 *
 */
public class TwoStackQueueImpl {
	
	ResizeArrayStack stackOne = new ResizeArrayStack();
	ResizeArrayStack stackTwo = new ResizeArrayStack();
	
	int size;
	
	
	
	public boolean isEmpty(){
		return size==0;
	}
	
	public void enqueue(String value){
		stackOne.push(value);
		size++;
	}
	
	public String dequeue(){
		String value = null;
		if(!isEmpty()){
			pushToStackTwo();
			size--;
			value= stackTwo.pull();
			pushToStackOne();
		}
		
		return value;
		
	}

	private void pushToStackOne() {
		int count = stackTwo.size();
		for(int i=0;i<count;i++){
			stackOne.push(stackTwo.pull());
		}
		
	}

	private void pushToStackTwo() {
		int count = stackOne.size();
		for(int i=1;i<=count;i++){
			stackTwo.push(stackOne.pull());
		}
		
	}

}
