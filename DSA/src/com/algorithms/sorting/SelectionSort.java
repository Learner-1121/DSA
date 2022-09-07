package com.algorithms.sorting;

import java.util.Scanner;

public class SelectionSort {
	public void sort(int[] a)
	{
		for(int i=0;i<a.length;i++)
		{
			int min_index = i;
			for(int j=i;j<a.length;j++)
			{
				if(a[i]>a[j])
				{
					min_index = j;
				}
			}
			swap(a,i,min_index);
		}
	}
	public void swap(int[] a,int i,int j)
	{
		int temp = a[i];
		a[i] = a[j];
		a[j] = temp;
	}
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a  = new int[n];
		for(int i=0;i<n;i++)
		{
			a[i] = sc.nextInt();
		}
		SelectionSort ss = new SelectionSort();
		ss.sort(a);
		for(int i=0;i<n;i++) System.out.print(a[i]+" ");
		
	}
}
