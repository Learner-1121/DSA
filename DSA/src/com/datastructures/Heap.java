package com.datastructures;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public class Heap {
	public ArrayList<Integer> buildHeap(Integer[] a)
	{
		ArrayList<Integer> heap = new ArrayList<Integer>(Arrays.asList(a));
		for(int i=a.length/2;i>0;i--) minHeapify(heap,i);
		return heap;
	}
	public void minHeapify(ArrayList<Integer> a,int i)
	{
		int l = 2*i;
		int r = 2*i+1;
		int min = -1;
		if(l<a.size() && a.get(l)<a.get(i)) min = l;
		else min = i;
		if(r<a.size() && a.get(r)<a.get(i))
		{
			min = r;
		}
		if(min!=i)
		{
			swap(a,i,min);
			minHeapify(a,min);
		}
	}
	public void swap(ArrayList<Integer> a,int i, int j)
	{
		int temp = a.get(i);
		a.set(i,a.get(j));
		a.set(j,temp) ;
	}
		
	
	public int extractMin(ArrayList<Integer> a)
	{
		if(a.size()!=0)
		{
			int min = a.get(1);
			a.set(1, a.get(a.size()-1));
			a.remove(a.size()-1);
			minHeapify(a,1);
			return min;
		}
		return Integer.MIN_VALUE;
	}
}
