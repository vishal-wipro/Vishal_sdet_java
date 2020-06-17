package task5;

import java.util.Scanner;

public class Q3 {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		char ch='\0';
		int count;
		System.out.println("The frequency of each character in given string is: ");
		for(int i=0;i<s.length();i++)
		{
			if((s.charAt(i)+"")!="\0")
				ch=s.charAt(i);
			count=1;
			for(int j=i+1;j<s.length();j++)
			{
				if(ch==s.charAt(j))
				{
					count++;
				}
			}
			if(ch!='\0' && ch!=' ')
				System.out.print(ch+" = "+count+" ");
			s=s.replaceAll(ch+"", "\0");
		}
	}

}
