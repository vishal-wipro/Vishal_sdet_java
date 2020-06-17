package task5;

import java.util.Scanner;

public class Q10 {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		int count=0;
		char ch='\0';
		boolean f=true;
		boolean r=true;
		for(int i=0;i<s.length();i++)
		{
			if((s.charAt(i)+"")!="\0")
				ch=s.charAt(i);
			count=0;
			for(int j=0;j<s.length();j++)
			{
				if(ch==s.charAt(j))
					count++;
			}
			if(count==1 && f==true)
			{
				System.out.println("The 1st non-repeating character is: "+ch);
				f=false;
			}
			if(count>1 && r==true)
			{
				System.out.println("The 1st repeating character is: "+ch);
				r=false;
			}
			s=s.replaceAll(ch+"", "\0");
			if(r==false && f==false)
				break;
		}
	}

}
