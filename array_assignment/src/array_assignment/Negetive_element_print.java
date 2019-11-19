//PROGRAM TO PRINT ALL THE NEGETIVE ELEMENT OF AN ARRAY


package array_assignment;
import java.util.*;

public class Negetive_element_print {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			int a[]=new int[3];
			int i;
			
			Scanner sc=new Scanner(System.in);
			System.out.println("enter the element of an array: ");
			
			for(i=0;i<a.length;i++)
			{
				a[i]=sc.nextInt();
			}
			
			for(i=0;i<a.length;i++)
			{
				
				if(a[i] <= 0)
					System.out.println(a[i]);
			}
			
			
		
	}

}
