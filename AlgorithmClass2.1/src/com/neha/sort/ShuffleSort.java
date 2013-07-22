package com.neha.sort;

public class ShuffleSort {
	
	int[] cards;
	
	public ShuffleSort(int[] cards){
		this.cards = cards;	
	}
	
	public void suffle(){
		for(int i=0;i<cards.length;i++){
			int r = (int) (Math.random() * cards.length);
			exchange(r, i);
		}
	}
	
	private void exchange(int indexB, int indexA){
		
			int swap = this.cards[indexB];
			this.cards[indexB] = this.cards[indexA];
			this.cards[indexA] = swap;
		
	}

	public void display() {
		for(int i=0;i<cards.length;i++){
			System.out.print(cards[i] + " ");
		}
		
	}
	

}
