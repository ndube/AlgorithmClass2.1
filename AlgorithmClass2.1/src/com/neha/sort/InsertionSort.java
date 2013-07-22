package com.neha.sort;

public class InsertionSort {
	
	int data[];
	
	public InsertionSort(int[] data){
		this.data = data;
	}
	
	public boolean isEmpty(){
		return this.data.length == 0;
	}
	
	public void sort(){
		for(int i=0;i<data.length;i++){
			for(int j=i;j>0 ;j--){
				if(less(data[j], data[j-1])){
					exchange(j-1, j);
				}
			}
		}
	}
	
	public void display(){
		for(int i=0;i<this.data.length;i++){
			System.out.print(data[i] + " ");
		}
	}
	
	
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
