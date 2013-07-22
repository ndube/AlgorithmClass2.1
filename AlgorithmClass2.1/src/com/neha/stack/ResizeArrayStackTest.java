package com.neha.stack;

public class ResizeArrayStackTest {


	public static void main(String[] args) {
		
		ResizeArrayStack stack = new ResizeArrayStack();
		
		System.out.print(stack.capacity() + " ");
		stack.push("1");
		System.out.print(stack.capacity() + " ");
		stack.push("2");
		System.out.print(stack.capacity() + " ");
		stack.push("3");
		System.out.print(stack.capacity() + " ");
		stack.push("4");
		System.out.print(stack.capacity() + " ");
		stack.push("5");
		System.out.print(stack.capacity() + " ");
		
		System.out.print(stack.pull());
		System.out.print(stack.pull());
		System.out.print(stack.pull());
		System.out.print(stack.pull());
		System.out.print(stack.pull());

	}

}
