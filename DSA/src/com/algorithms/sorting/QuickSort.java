package com.algorithms.sorting;

import java.util.Scanner;

public class QuickSort {
	
	public void sort(int[] a,int l, int r)
	{
		if(l<r)
		{
		int m = partition_first_pivot(a,l,r);
		sort(a,l,m-1);
		sort(a,m+1,r);
		}
	}
	//last element as pivot
	public int partition_last_pivot(int[] a,int l,int r)
	{
		int x = a[r];
		int p = l;
		int i = l-1;
		for(;p<r;p++)
		{
			if(a[p]<x)
			{
				i++;
				swap(a,p,i);
			}
		} 
		
		swap(a,i+1,r);
		print(a);
		System.out.println(i+1);
		return i+1;
	}
	public int partition_first_pivot(int[] a,int l,int r)
	{
		int x = a[l];
		int j = l+1;
		int i = l;
		for(;j<=r;j++)
		{
			if(a[j]<x)
			{
				i=i+1;
				swap(a,i,j);
			}
		}
		swap(a,i,l);
		return i;
	}
	public void print(int[] a)
	{
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+" ");
		}
		System.out.print("\n");
	}
	public void swap(int[] a,int p,int q)
	{
		int temp = a[p];
		a[p] = a[q];
		a[q] = temp;
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
			QuickSort ms = new QuickSort();
			ms.sort(a,0,a.length-1);
			for(int i=0;i<n;i++) System.out.print(a[i]+" ");
			System.out.println();
		}
		sc.close();
	}
}
