package task5;

import java.util.Arrays;
import java.util.Scanner;

public class Q7 {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String: ");
		String s=sc.nextLine();
		System.out.println("Enter another of String: ");
		String rot=sc.nextLine();
		char sarr[]=s.toCharArray();
		char rotarr[]=rot.toCharArray();
		Arrays.sort(sarr);
		Arrays.sort(rotarr);
		s=String.valueOf(sarr);
		rot=String.valueOf(rotarr);
		if(s.equals(rot))
			System.out.println("The given String is rotated version of original string: ");
		else
			System.out.println("The given String is not a rotated version of original string: ");
		
	}

}
