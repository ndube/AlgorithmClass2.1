package com.neha.queue;

public class TwoStackQueueImplTest {
	
	public static void main(String[] args){
		
		
		TwoStackQueueImpl queue = new TwoStackQueueImpl();
		
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
