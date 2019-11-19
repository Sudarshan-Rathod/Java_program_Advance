//PROGRAM TO INSERT AN ELEMENT IN AN ARRAY

package array_assignment;
import java.util.*;

public class Insert_element_in_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[]=new int[3];
		int i,position,newValue;
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter the element of an array: ");
		for(i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		
		System.out.println("enter the position: ");
		position=sc.nextInt();
		
		System.out.println("enter the newValue: ");
		newValue=sc.nextInt();

		System.out.println("Original Array : "+Arrays.toString(a));     
		   
		for(i=a.length-1;i > position; i--)
		{
			a[i] = a[i-1];
			}
		
		   a[position] = newValue;
		   System.out.println("New Array: "+Arrays.toString(a));

	}

}
