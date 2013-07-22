package com.neha.linkedlist;

public class LinkedList {
	
	Node first;
	Node current;
	int size;
	Node firstCyclicIndex;
	
	class Node{
		int value;
		Node next;
	}
	
	public boolean isEmpty(){
		return first==null;
	}
	
	public void add(int value){
		Node newNode = new Node();
		newNode.value = value;
		
		if(isEmpty()){
			first = newNode;
			current = first;
		}else{
			current.next = newNode;
			current = current.next;
		}
		size++;
	}
	
	public boolean isCyclic(){
		if(!isEmpty()){
			Node index = first;
			Node detectorIndex = null;
			
			while(index != null){
				if(detectorIndex == index.next){
					firstCyclicIndex = detectorIndex;
					return true;
				}
				detectorIndex = index;
				index = index.next;
				
			}
		}
		return false;
		
	}
	
	public void polute(){
		int random = 2;//(int) (Math.random() * (size + 1));
		Node randomIndex = first;
		Node preRandomIndex = null;
		while(random > 0 ){
			preRandomIndex = randomIndex;
			randomIndex = randomIndex.next;
			random--;
		}
		
		randomIndex.next = preRandomIndex;
		
	}
	
	public void display(){
		if(!isEmpty()){
			Node index = first;
			while(index!=null){
				System.out.print(index.value + " ");
				index = index.next;
			}
		}
	}
	
	public int firstCyclicParticipant(){
		return this.firstCyclicIndex.value;
	}

}
