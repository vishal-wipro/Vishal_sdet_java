package task4;

import java.util.Scanner;

public class Q9 {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		int ind=0,j=0,count=1,grt=0;
		for(int i=0;i<s.length();i++)
		{
			char ch=s.charAt(i);
			count=1;
			for(j=i+1;j<s.length();j++)
			{
				if(s.charAt(j)==ch)
					count++;
				else
					break;
			}
			if(count>grt)
			{
				grt=count;
				ind=i;
			}
		}
		System.out.println("The Longest repeating character is: "+s.charAt(ind));
	}

}
