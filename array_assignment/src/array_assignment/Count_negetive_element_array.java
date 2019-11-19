//PROGRAM TO COUNT TOTAL NUMBER OF NEGETIVE ELEMENT IN AN ARRAY

package array_assignment;

import java.util.Scanner;

public class Count_negetive_element_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[]=new int[3];
		int i,negetive_count=0;
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the element of an array: ");
		
		for(i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		
		for(i=0;i<a.length;i++)
		{
			if(a[i]< 0)
				negetive_count++;
		}
		
		System.out.println(negetive_count);

	}

}
