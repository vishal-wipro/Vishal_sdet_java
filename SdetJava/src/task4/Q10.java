package task4;

import java.util.Scanner;

public class Q10 {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		int T=sc.nextInt();
		while(T!=0)
		{
			double d=sc.nextDouble();
			double ans=d%(1000000007);
			System.out.println(ans);
			T--;
		}
	}

}
