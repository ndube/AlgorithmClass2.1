package com.neha.queue;

public class ResizeArrayQueueTest {
	
	public static void main(String[] args){
		
		ResizeArrayQueue queue = new ResizeArrayQueue();
		
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
