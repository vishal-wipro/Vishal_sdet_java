package task2;

import java.util.Scanner;

public class Q6 {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a String: ");
		String s=sc.nextLine();
		System.out.println("String After removing all the spaces: "+s.replaceAll(" ", ""));
	}

}
