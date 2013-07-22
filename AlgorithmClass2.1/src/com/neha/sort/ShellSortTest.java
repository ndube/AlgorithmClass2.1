package com.neha.sort;

public class ShellSortTest {

	public static void main(String[] args) {

		ShellSort sorter = new ShellSort(new int[]{5, 4, 3, 2, 1});

		sorter.sort();

		sorter.display();

	}

}
