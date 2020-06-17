package task5;

import java.util.Scanner;

public class Q6 {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		long n=sc.nextLong();
		long temp=0;
		boolean b=true;
		while(n!=0)
		{
			temp=n%10;
			if(temp!=0 && temp!=1)
			{
				b=false;
				break;
			}
			n=n/10;
		}
		if(b==true)
		{
			System.out.println("Binary Number");
		}
		else
		{
			System.out.println("Not a Binary Number");
		}
	}

}
