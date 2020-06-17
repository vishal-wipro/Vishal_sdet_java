package task4;

import java.util.Scanner;

public class Q5 {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of rows: ");
		int r=sc.nextInt();
		System.out.println("Enter the number of Columns: ");
		int c=sc.nextInt();
		int mat[][]=new int[r][c];
		System.out.println("Enter the value of matrix: ");
		for(int i=0;i<r;i++)
		{
			for(int j=0;j<c;j++)
			{
				mat[i][j]=sc.nextInt();
			}
		}
		if(r!=c)
			System.out.println("Given matrix should be square matrix");
		else
		{
			System.out.println("Lower traingular matrix is: ");
			for(int i=0;i<r;i++)
			{
				for(int j=0;j<c;j++)
				{
					if(j>i)
						System.out.print(0+" ");
					else
						System.out.print(mat[i][j]+" ");
				}
				System.out.println();
			}
		}
	}

}
