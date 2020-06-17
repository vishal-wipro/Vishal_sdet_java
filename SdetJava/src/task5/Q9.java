package task5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Q9 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		List<Integer> arr=new ArrayList();
		System.out.println("Enter the value of n: ");
		int n=sc.nextInt();
		for(int i=0;i<n-1;i++)
		{
			arr.add(sc.nextInt());
		}
		List<Integer> ls=new ArrayList();
		for(int i=1;i<=n;i++)
		{
			ls.add(i);
		}
		Collections.sort(arr);
		Collections.sort(ls);
		for(int i=0;i<arr.size();i++)
		{
			if(!arr.contains(ls.get(i)))
			{
				System.out.println("The missing number is: "+ls.get(i));
			}
		}			
	}
}
