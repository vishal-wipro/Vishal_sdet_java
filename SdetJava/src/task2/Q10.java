package task2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Q10 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int T=sc.nextInt();
		while(T>0)
		{
			int n,k,m;
			n=sc.nextInt();
			k=sc.nextInt();
			m=sc.nextInt();
			int arr[]=new int[n];
			for(int i=0;i<n;i++)
			{
				arr[i]=sc.nextInt();
			}
			Arrays.sort(arr);
			ArrayList<Integer> ar=new ArrayList();
			for(int i=0;i<n-1;i++)
			{
				for(int j=i+1;j<n;j++)
				{
					ar.add(arr[i]+arr[j]);
				}
			}
			System.out.println(ar);
			int expect=ar.get(0);
			int act=ar.get(m-1);
			System.out.println(act-expect);
			T--;
		}

	}

}
