package task2;

import java.util.Scanner;

public class Q4 {

	static int countChar(String s, char ch)
	{
		int count=0;
		for(int i=0;i<s.length();i++)
		{
			if(ch==s.charAt(i))
				count++;
		}
		return count;
	}
	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a String: ");
		String s=sc.nextLine();
		System.out.println("Enter a character : ");
		char ch=sc.next().charAt(0);
		System.out.println("The frequency of "+ch+" in "+s+" is: "+countChar(s,ch));
	}

}
