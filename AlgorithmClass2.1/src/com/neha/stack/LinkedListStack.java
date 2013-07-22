package com.neha.stack;

/**
 * This class uses a reverse linked list
 * to implement the stack.
 * 
 * Stack: Collection of elements where last in, is first out. LIFO
 * 
 * Time Complexity: All Operations take a constant time i.e., O(c)
 * Space Complexity: For a stack on N elements space ~40N bytes
 * 
 * @author ndube
 *
 */
public class LinkedListStack {	// 16 bytes (object overhead)
	
	int size;					// 4 bytes (int)
	Node first;					// 8 bytes (reference)
	Node last;					// 8 bytes (reference)
								// 4 bytes (padding)
	
	class Node{					
		String item;
		Node previous;
	}
	
	public boolean isEmpty(){
		return first == null;
	}
	
	
	public void push(String item){
		Node node = new Node();
		node.item = item;
		
		if(isEmpty()){
			first = node;
			last = first;
		}else{
			node.previous = last;
			last = node;
		}
		size++;
	}
	
	public Node pull(){
		
		Node n = null;
		if(!isEmpty()){
			n = last;
			last = n.previous;
		}
		return n;
	}
	
	public int size(){
		return this.size;
	}
	
	

}
