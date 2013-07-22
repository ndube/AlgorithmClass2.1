package com.neha.stack;


public class LinkedListStackTest {
	
	public static void main(String[] args){
		LinkedListStack stack = new LinkedListStack();
		
		stack.push("1");
		stack.push("2");
		stack.push("3");
		stack.push("4");
		
		System.out.println();
		
		System.out.print(stack.pull().item);
		System.out.print(stack.pull().item);
		System.out.print(stack.pull().item);
		System.out.print(stack.pull().item);
		
	}

}
