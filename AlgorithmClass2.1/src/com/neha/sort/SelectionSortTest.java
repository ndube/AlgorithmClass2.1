package com.neha.sort;

public class SelectionSortTest {
	
	public static void main(String[] args){
		SelectionSort sorter = new SelectionSort(new int[]{5, 4, 3, 2, 1});
		
		sorter.sort();
		
		sorter.display();
	}

}
