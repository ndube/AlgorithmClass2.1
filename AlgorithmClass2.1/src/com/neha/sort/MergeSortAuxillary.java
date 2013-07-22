package com.neha.sort;

public class MergeSortAuxillary {
	
	int[] data;
	
	
	public MergeSortAuxillary(int[] data){
		this.data = data;		
	}
	
	public void sortCollection(){
		int[] aux = new int[data.length];
		sort(data, aux, 0, data.length-1);
	}
	
	public void sort(int[] a, int[] aux, int lo, int hi){
		if(hi<=lo) return ;
		int mid = lo + (hi - lo)/2;
		sort(a, aux, lo, mid);
		sort(a, aux, mid+1, hi);
		merge(a, aux, lo, mid, hi);
	}
	
	private void merge(int[] a,int[] aux,  int lo, int mid, int hi){
		
		assert isSorted(a, lo, mid);
		assert isSorted(a, mid+1, hi);
		
		aux = new int[data.length];
		copy(data, aux);
		
		int i = lo, j=mid + 1;
		
		for(int k=lo; k<=hi; k++){
			if(i > mid) 			{a[k] = aux[j++];}
			
			else if(j > hi)			{a[k] = aux[i++];}

			else if(aux[j]<aux[i])	{a[k] = aux[j++];}

			else					{a[k] = aux[i++];}

		}
		
		assert isSorted(a, lo, hi);
	}
	
	private void copy(int[] copyFrom, int[] copyTo){
		for(int i=0;i<copyFrom.length && i<copyTo.length;i++){
			copyTo[i] = copyFrom[i];
		}
	}
	
	private boolean isSorted(int[] a, int i, int mid){
		
		for(int j=i;j<=mid;j++){
			if(i!=0){
				if(a[j]<a[j-1]){
					return false;
				}
			}
		}
		
		return true;
	}

	public void display() {
		for(int i=0;i<data.length;i++){
			System.out.print(data[i] + " ");
		}
		
	}

}
