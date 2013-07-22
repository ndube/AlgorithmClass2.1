package com.neha.sort;

public class ShuffleSortTest {
	
	public static void main(String[] args){
		
		int[] cards = new int[52];
		
		for(int i=0;i<cards.length;i++){
			cards[i] = i;
		}
		
		ShuffleSort shuffler = new ShuffleSort(cards);
		
		shuffler.suffle();
		
		shuffler.display();
	}

}
