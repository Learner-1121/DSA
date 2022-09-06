package com.algorithms.sorting;
import java.util.ArrayList;
import java.util.Scanner;

import com.datastructures.Heap;
public class HeapSort {
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		Heap hp = new Heap();
		int n= sc.nextInt();
		Integer[] a = new Integer[n+1];
		for(int i=1;i<=n;i++)
		{
			a[i] = sc.nextInt();
		}
		ArrayList<Integer> heap = hp.buildHeap(a);
		for(int i=1;i<=n;i++)
		{
			a[i] = hp.extractMin(heap);
		}
		for(int i=1;i<=n;i++) System.out.print(a[i]+" ");
		
		
	}
}
