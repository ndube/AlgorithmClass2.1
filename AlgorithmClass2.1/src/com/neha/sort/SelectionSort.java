package com.neha.sort;

public class SelectionSort {
	
	int[] data;
	
	public SelectionSort(int[] data){
		this.data = data;
	}
	
	public boolean isEmpty(){
		return this.data.length == 0;
	}
	
	public void sort(){
		
		for(int i=0;i<this.data.length;i++){
			int selectedMinIndex = i;
			
			for(int j=i;j<this.data.length;j++){
				if(data[j]<data[selectedMinIndex]){
					selectedMinIndex = j;
				}
			}
			exchange(i, selectedMinIndex);
		}
	}
	
	public void display(){
		for(int i=0;i<this.data.length;i++){
			System.out.print(data[i] + " ");
		}
	}
	
	
	@SuppressWarnings("unused")
	private boolean less(int a, int b){
		return a < b;
	}
	
	private void exchange(int indexB, int indexA){
		if(!isEmpty()){
			int swap = this.data[indexB];
			this.data[indexB] = this.data[indexA];
			this.data[indexA] = swap;
		}
	}

}
