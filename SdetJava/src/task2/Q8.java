package task2;

import java.util.Scanner;

public class Q8 {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of 1st array: ");
		int n=sc.nextInt();
		int arr[]=new int[n];
		System.out.println("Enter the value of array: ");
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		System.out.println("Enter the size of 2nd array: ");
		int m=sc.nextInt();
		int arr1[]=new int[m];
		System.out.println("Enter the value of array: ");
		for(int i=0;i<m;i++)
		{
			arr1[i]=sc.nextInt();
		}
		int ans[]=new int[m+n];
		for(int i=0;i<m+n;i++)
		{
			if(i<n)
				ans[i]=arr[i];
			else
				ans[i]=arr1[(i-n)];
		}
		System.out.println("The Concatenated array is: ");
		for(int i=0;i<m+n;i++)
		{
			System.out.print(ans[i]+" ");
		}
	}

}
