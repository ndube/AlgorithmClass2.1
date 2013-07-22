package com.neha.stack;

public class StackWithMaxAndMinTest {
	
	public static void main(String args[]){
		StackWithMaxAndMin stack = new StackWithMaxAndMin();
		
		stack.push(1);
		stack.push(2);
		stack.push(3);
		stack.push(4);
		
		System.out.println("Min: " + stack.min());
		
		System.out.println("Max: " + stack.max());
		
		System.out.print(stack.pull());
		System.out.print(stack.pull());
		System.out.print(stack.pull());
		System.out.print(stack.pull());
		System.out.print(stack.pull());
		
		
		
	}

}
