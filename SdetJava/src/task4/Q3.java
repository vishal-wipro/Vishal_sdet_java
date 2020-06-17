package task4;

import java.util.Scanner;

public class Q3 {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		int r1,c1,r2,c2;
		int mat1[][];
		int mat2[][];
		int ans[][];
		System.out.println("Enter the row size of 1st matrix: ");
		r1=sc.nextInt();
		System.out.println("Enter the column size of 1st matrix: ");
		c1=sc.nextInt();
		System.out.println("Enter the value of 1st matrix: ");
		mat1=new int[r1][c1];
		for(int i=0;i<r1;i++)
		{
			for(int j=0;j<c1;j++)
			{
				mat1[i][j]=sc.nextInt();
			}
		}
		System.out.println("Enter the row size of 2nd matrix: ");
		r2=sc.nextInt();
		System.out.println("Enter the column size of 2nd matrix: ");
		c2=sc.nextInt();
		System.out.println("Enter the value of 2nd matrix: ");
		mat2=new int[r2][c2];
		for(int i=0;i<r2;i++)
		{
			for(int j=0;j<c2;j++)
			{
				mat2[i][j]=sc.nextInt();
			}
		}
		ans=new int[r2][c2];
		for(int i=0;i<r1;i++)
		{
			for(int j=0;j<c2;j++)
			{
				int temp=0;
				for(int k=0;k<r1;k++)
				{
					temp=temp+(mat1[i][k]*mat2[k][j]);
				}
				ans[i][j]=temp;
			}
		}
		System.out.println("The Product of given two matrix is: ");
		for(int i=0;i<r2;i++)
		{
			for(int j=0;j<c2;j++)
			{
				System.out.print(ans[i][j]+" ");
			}
			System.out.println();
		}
	}

}
