//PROGRAM TO ADD 2 MATRIX

package array_2D_assignment;
import java.util.*;

public class Add_2_matrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int i,j;
		int a[][]=new int[2][2];
		int b[][]= new int [2][2];
		int c[][]= new int [2][2];
		
		Scanner sc=new Scanner(System.in);
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
		
		for(i=0;i<a.length;i++) {
			
			for(j=0;j<a[i].length;j++) {
				
				c[i][j]= a[i][j] + b[i][j];
			}
	}
		
		System.out.println("Added Matrix: ");
		for(i=0;i<c.length;i++)
		{
			for(j=0;j<c[i].length;j++)
			{
				System.out.print(c[i][j]+"\t");
			}
			System.out.println();
		}
		

		
		

	}

}
