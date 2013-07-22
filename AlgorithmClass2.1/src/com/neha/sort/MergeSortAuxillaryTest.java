package com.neha.sort;

public class MergeSortAuxillaryTest {


	public static void main(String[] args) {
		
		int[] sortData = new int[]{5, 4, 3, 2, 1};
		
		MergeSortAuxillary sorter = new MergeSortAuxillary(sortData);
		
		
		sorter.sortCollection();
		
		sorter.display();

	}

}
