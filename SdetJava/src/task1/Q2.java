package task1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Q2 {

	static int [] reverseArray(int arr[])
	{
		int arr1[]=new int[arr.length];
		for(int i=0;i<arr.length;i++)
		{
			arr1[i]=arr[(arr.length-1)-i];
		}
		return arr1;
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of array: ");
		int n=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		int ans[]=reverseArray(arr);
		System.out.println("Reversed Array is: ");
		for(int i=0;i<ans.length;i++)
		{
			System.out.print(ans[i]+" ");
		}
	}

}
