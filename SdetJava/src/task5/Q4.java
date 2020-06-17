package task5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Q4 {

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
		System.out.println("Enter the value of Sum: ");
		int sum=sc.nextInt();
		List<List> ls=new ArrayList();
		ArrayList<Integer> ar;
		for(int i=0;i<n-1;i++)
		{
			ar=new ArrayList();
			for(int j=i+1;j<n;j++)
			{
				if(arr[i]+arr[j]==sum)
				{
					Collections.addAll(ar, arr[i],arr[j]);
					ls.add(ar);
				}
			}
		}
		System.out.println("All pairs of elements whose sum is"+ sum+" are: ");
		System.out.println(ls);
	}

}
