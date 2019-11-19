////PROGRAM TO PRINT sum of all ELEMENTs OF AN ARRAY(1D)

package array_assignment;
import java.util.*;

public class Sum_of_array_element {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[]=new int[3];
		int i,sum=0;
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the element of an array: ");
		
		for(i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		
		for(i=0;i<a.length;i++)
		{
			sum=sum+a[i];
		}
		
		System.out.println(sum);
		

	}

}
