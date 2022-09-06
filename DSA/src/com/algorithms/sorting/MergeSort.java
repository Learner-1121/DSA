package com.algorithms.sorting;

import java.util.Scanner;

public class MergeSort {
	public void sort(int[] a,int p,int r)
	{	
		if(p<r)
		{
			int q = (p+r)/2;
			sort(a,p,q);
			sort(a,q+1,r);
			merge(a,p,q,r);		
		}
	}
	public void merge(int[] a,int p,int q,int r)
	{
		int L[] = new int[q-p+1];
		int R[] = new int[r-q];
		int i = 0;
		//filling left side array form A[p] to A[q]
		for(i=0;i<L.length;i++)
		{
			L[i] = a[p+i];
		}
		//filling right side array from A[q+1] to A[r]
		for(int j=0;j<R.length;j++)
		{
			R[j] = a[p+i];
			i++;
		}
		i =0;
		int j = 0;
		int k = p;
		while(i<L.length&& j<R.length)
		{
			if(L[i]<=R[j]) a[k++] = L[i++];
			else a[k++] = R[j++];
		}
		
		while(i<L.length) {
			a[k++] = L[i++];
		}
		while(j<R.length)
		{
			a[k++] = R[j++];
		}
	}
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		for(int k=0;k<t;k++)
		{
			int n = sc.nextInt();
			int[] a = new int[n];
			for(int i=0;i<n;i++) a[i] = sc.nextInt();
			MergeSort ms = new MergeSort();
			ms.sort(a,0,a.length-1);
			for(int i=0;i<n;i++) System.out.print(a[i]+" ");
			System.out.println();
		}
		sc.close();
	}
}
