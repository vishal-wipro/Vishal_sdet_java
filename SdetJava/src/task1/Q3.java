package task1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Q3 {
	
	static int greatestInt(int []arr, int x)
	{
		Arrays.sort(arr);
		int ans=0;
		for(int i=arr.length-1;i>=0;i--)
		{
			if(arr[i]<x)
			{
				ans=arr[i];
				break;
			}
		}
		return ans;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n,q;
		int arr[]=new int[2];
		for(int i=0;i<2;i++)
		{
			arr[i]=sc.nextInt();
		}
		n=arr[0];
		q=arr[1];
		arr=new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		ArrayList<Integer> ans=new ArrayList<>();
		for(int i=0;i<q;i++)
		{
			int x=sc.nextInt();
			ans.add(greatestInt(arr,x));
		}
		for(int i=0;i<ans.size();i++)
			System.out.println(ans.get(i));
	}

}
