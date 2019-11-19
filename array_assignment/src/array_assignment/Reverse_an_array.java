//PROGRAM TO REVERSE AN ARRAY

package array_assignment;
import java.util.*;

public class Reverse_an_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int i,n;
		
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
		System.out.println("Reverse Array: ");
		for(i=n-1;i>=0;i--)
		{
			System.out.print(a[i]+"\t");
		}
		
		
		

	}

}
