package com.neha.stack;

public class ArrayStackTest {
	
	public static void main(String[] args){
		ArrayStack stack = new ArrayStack(4);
		
		stack.push("1");
		stack.push("2");
		stack.push("3");
		stack.push("4");
		
		System.out.println(stack.value[3]);
		
		System.out.print(stack.pull());
		System.out.print(stack.pull());
		System.out.print(stack.pull());
		System.out.print(stack.pull());
		System.out.print(stack.pull());
	}

}
