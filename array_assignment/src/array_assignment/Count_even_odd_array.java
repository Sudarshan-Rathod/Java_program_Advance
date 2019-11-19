//PROGRAM TO COUNT TOTAL NUMBER OF EVEN & ODD ELEMENT IN AN ARRAY

package array_assignment;
import java.util.*;

public class Count_even_odd_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[]=new int[3];
		int i,even_count=0,odd_count=0;
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the element of an array: ");
		
		for(i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		
		for(i=0;i<a.length;i++)
		{
			if(a[i] % 2==0)
				even_count++;
			else
				odd_count++;
		}
		
		System.out.println(even_count);
		System.out.println(odd_count);
		

	}

}
