package task5;

import java.util.Arrays;
import java.util.Scanner;

public class Q2 {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of array: ");
		int n=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		Arrays.sort(arr);
		int grt=arr[arr.length-1];
		for(int i=arr.length-2;i>0;i--)
		{
			if(arr[i]<grt)
			{
				grt=arr[i];
				break;
			}
		}
		System.out.println("The second largest number in given array is: "+grt);
		

	}

}
