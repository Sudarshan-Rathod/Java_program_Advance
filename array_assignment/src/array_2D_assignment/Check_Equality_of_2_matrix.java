//PROGRAM TO CHECK WHETHER 2 MATRIX ARE EQUAL OR NOT

package array_2D_assignment;

import java.util.Scanner;

public class Check_Equality_of_2_matrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n,i,j,sud=0;
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the base of squared matrices");
        n = sc.nextInt();
        
		int a[][]=new int[n][n];
		int b[][]= new int [n][n];
		
		System.out.println("enter the 1st Matrix: ");
		for (i=0;i<a.length;i++)
		{
			for(j=0;j<a[i].length;j++)
			{
				a[i][j]=sc.nextInt();
			}
		}
		
		System.out.println("enter the 2nd Matrix: ");	
		for (i=0;i<b.length;i++)
		{
			for(j=0;j<b[i].length;j++)
			{
				b[i][j]=sc.nextInt();
			}
		}
		
		for (i=0;i<b.length;i++)
		
			for(j=0;j<b[i].length;j++)
			
				if(a[i][j]!=b[i][j])
				{
				  sud=1;
				}
		
			if(sud==1)
				System.out.println("EQUAL");
			else
				System.out.println("NOT EQUAL");
		
		
		
	}

}
