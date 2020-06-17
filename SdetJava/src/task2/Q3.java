package task2;

import java.util.Scanner;

public class Q3 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int r,c;
		int mat1[][];
		int mat2[][];
		int ans[][];
		System.out.println("Enter the row size of matrix: ");
		r=sc.nextInt();
		System.out.println("Enter the column size of matrix: ");
		c=sc.nextInt();
		System.out.println("Enter the value of 1st matrix: ");
		mat1=new int[r][c];
		for(int i=0;i<r;i++)
		{
			for(int j=0;j<c;j++)
			{
				mat1[i][j]=sc.nextInt();
			}
		}
		ans=new int[r][c];
		for(int i=0;i<r;i++)
		{
			for(int j=0;j<c;j++)
			{
				ans[i][j]=mat1[j][i];
			}
		}
		System.out.println("The Transpose of given matrix is: ");
		for(int i=0;i<r;i++)
		{
			for(int j=0;j<c;j++)
			{
				System.out.print(ans[i][j]+" ");
			}
			System.out.println();
		}
		
	}

}
