package com.neha.sort;

public class InsertionSortTest {
	
	public static void main(String[] args){
		InsertionSort sorter = new InsertionSort(new int[]{5, 4, 3, 2, 1});
		
		sorter.sort();
		
		sorter.display();
	}

}
