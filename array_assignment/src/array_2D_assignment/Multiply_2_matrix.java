//PROGRAM TO MULTIPLY 2 MATRIX

package array_2D_assignment;
import java.util.*;

public class Multiply_2_matrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n,i,j,k;
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the base of squared matrices");
        n = sc.nextInt();
        
		int a[][]=new int[n][n];
		int b[][]= new int [n][n];
		int c[][]= new int [n][n];
		
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
		
		//Multiplication of matrices
		for(i=0;i<n;i++)
		{
			for(j=0;j<n;j++)
			{
				for(k=0;k<n;k++)
				{
					c[i][j]=c[i][j]+a[i][k]*b[k][j];
					
				}
			}
		}
		
		for (i=0;i<b.length;i++)
		{
			for(j=0;j<b[i].length;j++)
			{
				System.out.print(c[i][j]+"\t");
			}
		}
		
		

	}

}
