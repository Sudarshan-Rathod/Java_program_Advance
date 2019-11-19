//PROGRAM TO FIND THE SUM OF DIAGONAL ELEMENT

package array_2D_assignment;

import java.util.Scanner;

public class Sum_of_diagonal_element {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n,i,j;
		int diagonal_1=0,diagonal_2=0;
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the base of squared matrices");
        n = sc.nextInt();
        
		int a[][]=new int[n][n];
		
		System.out.println("enter the elements of Matrix: ");
		for (i=0;i<a.length;i++)
		{
			for(j=0;j<a[i].length;j++)
			{
				a[i][j]=sc.nextInt();
			}
		}
		
		
		for (i = 0; i < n; i++) 
        { 
            for (j = 0; j < n; j++) 
            {  
                if(i == j) 
                    diagonal_1= diagonal_1+ a[i][j];
                
                if ((i + j) == (n - 1))
                	diagonal_2= diagonal_2+ a[i][j];
            }
        }
		
		
		System.out.println(diagonal_1);
		System.out.println(diagonal_2);
		
		

	}

}
