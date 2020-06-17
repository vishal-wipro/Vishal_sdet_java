package task5;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Q5 {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Size of array: ");
		int n=sc.nextInt();
		int arr[]=new int[n];
		System.out.println("Enter the value of array: ");
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		System.out.println("Enter the number: ");
		int num=sc.nextInt();
		List<Integer> ar=new ArrayList();
		//List<List> ls=new ArrayList();
		int sum=0,i=0,j=0;
		outer:
		for(i=0;i<n-1;i++)
		{
			sum=arr[i];
			for(j=i+1;j<n;j++)
			{
				sum+=arr[j];
				if(sum==num)
					break outer;
			}
		}
		for(int k=i;k<=j;k++)
		{
			ar.add(arr[k]);
		}
		System.out.println("The continuous subarray whose elements sum is "+num+" is: " );
		System.out.println(ar);
	}

}
