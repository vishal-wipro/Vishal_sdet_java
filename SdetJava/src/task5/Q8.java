package task5;

import java.util.Scanner;

public class Q8 {
	
	static int [] zeroAtBeg(int arr[])
	{
		int n=arr.length;
		int ans[]=new int[n];
		int k=0;
		for(int j=0;j<n;j++)
		{
			if(arr[j]==0)
			{
				ans[k]=arr[j];
				k++;
			}
		}
		for(int i=0;i<n;i++)
		{
			if(arr[i]!=0)
			{
				ans[k]=arr[i];
				k++;
			}
		}
		return ans;
	}

	static int [] zeroAtEnd(int arr[])
	{
		int n=arr.length;
		int ans[]=new int[n];
		int k=0;
		for(int j=0;j<n;j++)
		{
			if(arr[j]!=0)
			{
				ans[k]=arr[j];
				k++;
			}
		}
		for(int i=0;i<n;i++)
		{
			if(arr[i]==0)
			{
				ans[k]=arr[i];
				k++;
			}
		}
		return ans;
	}
	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of Array: ");
		int n=sc.nextInt();
		System.out.println("Enter the value of Array: ");
		int arr[]=new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		int ans1[]=zeroAtBeg(arr);
		System.out.println("Moving all the zero to begining of the array: ");
		for(int i=0;i<n;i++)
		{
			System.out.print(ans1[i]+" ");
		}
		int ans2[]=zeroAtEnd(arr);
		System.out.println("\n Moving all the zero to end of the array: ");
		for(int i=0;i<n;i++)
		{
			System.out.print(ans2[i]+" ");
		}
	}

}
