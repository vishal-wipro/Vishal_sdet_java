package task4;

import java.util.Scanner;

public class Q1 {

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
		boolean b=true;
		for(int i=0;i<r;i++)
		{
			for(int j=0;j<c;j++)
			{
				if(i==j)
				{
					if(mat[i][j]!=1)
					{
						b=false;
					}
				}
			}
		}
		if(b==true)
			System.out.println("Given matrix is identity matrix");
		else
			System.out.println("Given matrix is not a identity matrix");
	}

}
