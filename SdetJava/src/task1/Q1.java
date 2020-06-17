package task1;

import java.util.Scanner;

public class Q1 {
	static String reverseString(String s)
	{
		StringBuffer sb=new StringBuffer(s);
		sb=sb.reverse();
		return sb.toString();
	}

	public static void main(String[] args) {
		System.out.println("Enter the String: ");
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		System.out.println("Reversed String is: "+reverseString(s));
	}

}
