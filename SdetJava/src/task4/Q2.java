package task4;

import java.util.Scanner;

public class Q2 {

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
		int rsum=0;
		System.out.println("THe sum of rows: ");
		for(int i=0;i<r;i++)
		{
			rsum=0;
			for(int j=0;j<c;j++)
			{
				rsum+=mat[i][j];
			}
			System.out.println("THe sum of row "+(i+1)+" is: "+rsum);
		}
		System.out.println("\nTHe sum of columns: ");
		int csum=0;
		for(int i=0;i<c;i++)
		{
			csum=0;
			for(int j=0;j<r;j++)
			{
				csum+=mat[j][i];
			}
			System.out.println("THe sum of col "+(i+1)+" is: "+csum);
		}
	}

}
