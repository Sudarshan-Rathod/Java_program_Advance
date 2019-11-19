//PROGRAM TO DELETE AN ELEMENT IN AN ARRAY

package array_assignment;
import java.util.*;

public class Delete_element_in_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int i,position,n;
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the number of elements:") ;
		 n = sc.nextInt();
		 
		 int a[]=new int[n];
		
		System.out.println("enter the element of an array: ");
		for(i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		
		System.out.println("enter the position: ");
		position=sc.nextInt();
		
		for(i=position;i<n-1;i++)
     	{
         a[i]=a[i+1];
         }
		n=n-1;
		
		System.out.println("Original Array : "+Arrays.toString(a));
		System.out.println("deleting new array we get: ");
	     for(i=0;i<n;i++) 
	     {
	         System.out.print(a[i]+"\t");
	     }
		
		
	}

}
