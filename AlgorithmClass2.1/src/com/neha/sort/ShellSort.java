package com.neha.sort;

public class ShellSort {
	
	int[] data;
	int h = 1;
	
	public ShellSort(int[] data){
		this.data = data;
		while(h<data.length/3){
			h = 3 * h + 1;
		}
		
	}
	
	public boolean isEmpty(){
		return this.data.length == 0;
	}
	
	public void sort(){
		while(h > 0){
			for(int i=0;i<data.length;i++){
				for(int j=i;j>0;j-=h){
					if(less(data[j], data[j-h])){
						exchange(j-h, j);
					}
				}
			}
			h = h/3;
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
