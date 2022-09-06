package com.algorithms.sorting;

import java.util.Scanner;

public class InsertionSort {
	public static int[] sort(int[] arr)
	{
		for(int i=0;i<arr.length;i++)
		{
			int value = arr[i];
			int j;
			for(j=i-1;j>=0 && value<arr[j];j--)
			{
				arr[j+1] = arr[j];
			}
			
			arr[j+1] = value;
		}
		return arr;
	}
	public static void print(int[] arr)
	{
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}
		System.out.print("\n");
	}
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i] = sc.nextInt();
		}
		arr = sort(arr);
		print(arr);
	}
}
