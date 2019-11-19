//PROGRAM TO CHECK IDENTITY MATRIX

package array_2D_assignment;
import java.util.*;

public class Identity_matrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n,i,j;
		boolean sud=true;
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the base of matrices");
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
		
		for(i = 0; i <a.length; i++){    
            for(j= 0; j <a[0].length; j++){    
              if(i == j && a[i][j] != 1){    
                  sud = false;    
                  break;    
              }    
              if(i != j && a[i][j] != 0){    
            	  sud = false;    
                  break;    
              }    
            }    
        }
		
		if(sud)
			System.out.println("Identity matrix");
		else
			System.out.println("NOT Identity matrix");
		
		

	}

}
