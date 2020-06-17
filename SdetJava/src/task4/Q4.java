package task4;

import java.util.Scanner;

public class Q4 {

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
		if(r1!=r2 && c1!=c2)
			System.out.println("Matrices are not equal");
		else
		{
			boolean b=true;
			for(int i=0;i<r2;i++)
			{
				for(int j=0;j<c2;j++)
				{
					if(mat1[i][j]!=mat2[i][j])
					{
						b=false;
						break;
					}
				}
			}
			if(b==true)
			{
				System.out.println("Matrices are equal");
			}
			else
			{
				System.out.println("Matrices are not equal");
			}
		}
	}

}
