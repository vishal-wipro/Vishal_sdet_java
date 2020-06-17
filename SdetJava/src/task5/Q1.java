package task5;

import java.util.Scanner;

public class Q1 {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		System.out.println(s);
		char ch='\0';
		int count;
		System.out.println("The count of duplicate characters are: ");
		for(int i=0;i<s.length();i++)
		{
			if((s.charAt(i)+"")!="\0")
				ch=s.charAt(i);
			count=1;
			for(int j=i+1;j<s.length();j++)
			{
				if(s.charAt(j)==ch)
					count++;
			}
			if(count>1 && ch!='\0')
			{
				System.out.println(ch+" : "+count);
			}
			s=s.replaceAll(ch+"", "\0");
		}
	}

}
