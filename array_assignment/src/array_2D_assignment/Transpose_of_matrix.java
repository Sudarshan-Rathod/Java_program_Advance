//PROGRAM TO FIND THE TRANSPOSE OF MATRIX

package array_2D_assignment;
import java.util.*;

public class Transpose_of_matrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n,i,j;
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the base of squared matrices");
        n = sc.nextInt();
        
		int a[][]=new int[n][n];
		int b[][]=new int[n][n];
		
		System.out.println("enter the elements of Matrix: ");
		for (i=0;i<a.length;i++)
		{
			for(j=0;j<a[i].length;j++)
			{
				a[i][j]=sc.nextInt();
			}
		}
		
		for (i=0;i<a.length;i++)
		{
			for(j=0;j<a[i].length;j++)
			{
				b[i][j]=a[j][i];
			}
		}
		
		for (i=0;i<a.length;i++)
		{
			for(j=0;j<a[i].length;j++)
			{
				System.out.print(b[i][j]+" ");
			}
		}
		
		
		

	}

}
