package com.algorithms.sorting;

import java.util.Scanner;
public class BubbleSort {
	public void sort(int[] a)
	{
		boolean swapped = false;
		for(int i=0;i<a.length-1;i++)
		{
			for(int j=0;j<a.length-1;j++)
			{
				if(a[j]>a[j+1])
				{
					swap(a,j,j+1);
					swapped = true;
				}
			}
			if(!swapped) break;
		}
	}
	public void swap(int[] a,int i,int j)
	{
		int temp = a[i];
		a[i]= a[j];
		a[j] = temp;
	}
	public void print(int[] a)
	{
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+" ");
		}
		System.out.println();
	}
	public static void main(String[] args0)
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = new int[n];
		for(int i=0;i<n;i++)
		{
			a[i] = sc.nextInt();
		}
		BubbleSort bs = new BubbleSort();
		bs.sort(a);
		bs.print(a);
	}
}
