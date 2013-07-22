package com.neha.sort;

public class BottomUpMergeSort {

	int[] data;

	public BottomUpMergeSort(int[] data){
		this.data = data;		
	}
	
	public void sortCollection(){		
		
		for(int sz=1;sz<data.length; sz= sz+sz){
			for(int lo=0;lo<data.length-sz; lo +=sz+sz){
				/*int hi = lo+sz+sz-1;
				int mid = lo + (hi-lo)/2;
				merge(data, lo,mid, hi);*/
				merge(data, lo, Math.min(lo+sz+sz-1, data.length-1), lo+sz-1);
			}
		}		
	}
	
	
	private void merge(int[] a, int lo, int mid, int hi){

		assert isSorted(a, lo, mid);
		assert isSorted(a, mid+1, hi);

		int[] aux = new int[data.length];
		copy(data, aux);

		int i = lo, j=mid + 1;

		for(int k=lo; k<=hi; k++){
			if(i > mid) 			{a[k] = aux[j++];} 			// Handle use case where i sub array is finished 

			else if(j > hi)			{a[k] = aux[i++];}			// Handle use case where j sub array is finished

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
