package com.neha.sort;

public class BottomUpMergeSortTest {
	
	public static void main(String[] args){
		
		int[] sortData = new int[]{15, 84, 96, 20, 69, 11, 38, 36, 70, 94};
			
			//new int[]{8, 7, 6, 5, 4, 3, 2, 1};
		
		BottomUpMergeSort sorter = new BottomUpMergeSort(sortData);
		
		
		sorter.sortCollection();
		
		sorter.display();

	}

}
