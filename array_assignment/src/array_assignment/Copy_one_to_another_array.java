//PROGRAM TO copy all ELEMENT from 1 array to another

package array_assignment;

import java.util.Scanner;

public class Copy_one_to_another_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[]=new int[3];
		int b[]=new int[a.length];
		int i;
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the element of an array: ");
		
		for(i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		
		for(i=0;i<a.length;i++)
		{
			b[i]=a[i];
		}
		
		System.out.println("element of Array A:");
		for(i=0;i<b.length;i++)
		{
			System.out.print(a[i]+"\t");
		}
		System.out.println();
		
		System.out.println("element of Array B:");
		for(i=0;i<b.length;i++)
		{
			System.out.print(b[i]+"\t");
		}
		
		
		

	}

}
