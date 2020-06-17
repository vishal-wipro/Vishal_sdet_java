package task1;

import java.util.Scanner;

public class Q5 {

	static void checkPower(int x)
	{
		int i=0;
		double a=0;
		boolean flag=false;
		while((int)a<=x)
		{
			a=Math.pow(2, i);
			if((int)a==x)
			{
				System.out.println("YES");
				flag=true;
			}
				
			i++;	
		}
		if(flag==false)
			System.out.println("NO");
		
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int T=sc.nextInt();
		while(T>0)
		{
			int n=sc.nextInt();
			checkPower(n);
			T--;
		}

	}

}
