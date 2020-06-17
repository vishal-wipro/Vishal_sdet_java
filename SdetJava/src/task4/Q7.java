package task4;

import java.util.Scanner;

public class Q7 {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		int r1,c1;
		int mat1[][];
		System.out.println("Enter the row size of matrix: ");
		r1=sc.nextInt();
		System.out.println("Enter the column size of matrix: ");
		c1=sc.nextInt();
		System.out.println("Enter the value of matrix: ");
		mat1=new int[r1][c1];
		int oc=0,ec=0;
		for(int i=0;i<r1;i++)
		{
			for(int j=0;j<c1;j++)
			{
				mat1[i][j]=sc.nextInt();
				if((mat1[i][j])%2==0)
					ec++;
				else
					oc++;
			}
		}
		System.out.println("THe frequency of Odd number is: "+oc);
		System.out.println("THe frequency of Even number is: "+ec);

	}

}
