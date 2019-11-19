//PROGRAM TO SEARCH AN ELEMENT IN AN ARRAY

package array_assignment;
import java.util.*;

public class Search_element_in_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int i,n,x,sud=0;
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the number of elements:") ;
		 n = sc.nextInt();
		 
		 int a[]=new int[n];
		
		System.out.println("enter the element of an array: ");
		for(i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		
		System.out.println("Original Array : "+Arrays.toString(a));
		
		System.out.println("Enter the element you want to find:");
        x = sc.nextInt();
        
        for(i = 0; i < n; i++)
        {
            if(a[i] == x)
            {
                sud = 1;
                break;
            }
            else
            {
                sud = 0;
            }
        }
        
        if(sud == 1)
        {
            System.out.println("Element found at position:"+(i + 1));
        }
        else
        {
            System.out.println("Element not found");
        }
		
		

	}

}
