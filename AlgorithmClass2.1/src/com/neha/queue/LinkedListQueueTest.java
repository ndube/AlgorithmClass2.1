package com.neha.queue;

public class LinkedListQueueTest {

	public static void main(String[] args) {

		LinkedListQueue queue = new LinkedListQueue();
		
		queue.enqueue("1");
		queue.enqueue("2");
		queue.enqueue("3");
		queue.enqueue("4");
		
		System.out.print(queue.dequeue() + " ");
		System.out.print(queue.dequeue() + " ");
		System.out.print(queue.dequeue() + " ");
		System.out.print(queue.dequeue() + " ");

	}

}
