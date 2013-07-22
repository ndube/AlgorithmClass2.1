package com.neha.queue;

public class ArrayQueueTest {

	public static void main(String[] args) {
		
		ArrayQueue queue = new ArrayQueue(4);
		
		queue.enqueue("1");
		queue.enqueue("2");
		queue.enqueue("3");
		queue.enqueue("4");
		
		System.out.print(queue.dequeue() + " ");
		System.out.print(queue.dequeue() + " ");
		System.out.print(queue.dequeue() + " ");
		System.out.print(queue.dequeue() + " ");
		System.out.print(queue.dequeue() + " ");

	}

}
