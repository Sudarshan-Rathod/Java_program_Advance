//PROGRAM TO PERFORM SCALER MATRIX MILTIPLICATION

package array_2D_assignment;

import java.util.Scanner;

public class Multiply_Scaler_matrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int i,j,k;
		int a[][]=new int[2][2];
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the elements of Matrix: ");
		for (i=0;i<a.length;i++)
		{
			for(j=0;j<a[i].length;j++)
			{
				a[i][j]=sc.nextInt();
			}
		}
		
		System.out.println("enter the scaler element: ");
		k=sc.nextInt();
		
		for (i=0;i<a.length;i++)
		{
			for(j=0;j<a[i].length;j++)
			{
				a[i][j]=a[i][j] * k;
			}
		}
		
		for (i=0;i<a.length;i++)
		{
			for(j=0;j<a[i].length;j++)
			{
				System.out.print(a[i][j]+"\t");
			}
		}
		
		
		

	}

}
