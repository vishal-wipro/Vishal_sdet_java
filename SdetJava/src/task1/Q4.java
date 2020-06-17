package task1;

import java.util.Scanner;

public class Q4 {

	static void swap(int x, int y)
	{
		x=x+y;
		y=x-y;
		x=x-y;
		System.out.println(x+" "+y);
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int T=sc.nextInt();
		while(T>0)
		{
			int a=sc.nextInt();
			int b=sc.nextInt();
			swap(a,b);
			T--;
		}
	}

}
