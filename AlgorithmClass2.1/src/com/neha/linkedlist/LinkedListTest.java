package com.neha.linkedlist;

public class LinkedListTest {
	
	public static void main(String[] args){
		LinkedList linkedList = new LinkedList();
		
		linkedList.add(1);
		linkedList.add(2);
		linkedList.add(3);
		linkedList.add(4);
		
		linkedList.display();
		
		System.out.println("Poluting the Linked List: " ); linkedList.polute();
		
		System.out.println("Is Cyclic: " + linkedList.isCyclic());
		
		System.out.println("First Cyclic Participant: " + linkedList.firstCyclicParticipant());
		
	}

}
