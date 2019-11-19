//PROGRAM TO FIND THE SUM OF EACH ROW AND COLUMN IN ARRAY 

package array_2D_assignment;
import java.util.*;

public class Sum_of_row_and_column_element {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n,i,j,sum=0,sud=0;
		
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
		
		//logic for sum of ROWS
		for (i = 0; i < n; ++i) { 
	        for (j = 0; j <n; ++j) { 
	  
	            sum = sum + a[i][j]; 
	        } 
	        System.out.println( "Sum of the row: "+i+" = "+sum); 
	        sum = 0; 
	    } 
		
		//logic for sum of column
		for (i = 0; i <n; ++i) { 
	        for (j = 0; j <n; ++j) { 
 
	        	sud = sud + a[j][i]; 
	        } 
	        System.out.println( "Sum of the column: "+ i + " = " + sud); 
	        sud = 0; 
	    } 
	}
}


