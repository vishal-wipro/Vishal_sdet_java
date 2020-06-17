package task2;

import java.util.Scanner;

public class Q9 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a character: ");
		char ch=sc.next().charAt(0);
		String s1=ch+"";
		System.out.println("The converted String is: "+s1);
		System.out.println("Enter a String: ");
		sc.nextLine();
		String s2=sc.nextLine();
		char ch1[]=s2.toCharArray();
		System.out.println("The converted character is: ");
		for(int i=0;i<ch1.length;i++)
		{
			System.out.print(ch1[i]+" ");
		}
		
	}

}
