//PROGRAM TO PRINT SUM,AVG,SMALLEST.LARGEST OF AN ARRAY

package array_assignment;

import java.util.Arrays;
import java.util.Scanner;

public class Sum_avg_small_large_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int i,n,sum=0;
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the number of elements:") ;
		 n = sc.nextInt();
		 
		 int a[]=new int[n];
		
		System.out.println("enter the element of an array: ");
		for(i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.println();
		System.out.println("Original Array : "+Arrays.toString(a));
		int max=a[0];
		int min=a[0];
		
		for(i=0;i<n;i++)
		{
			sum=sum+a[i];
		}
		
		System.out.println("sum: "+sum);
		System.out.println("average: "+sum/n);
		
		for(i=1;i<n;i++)
		{
			if(a[i] > max)
			{
				max=a[i];
			}
			if(a[i]< min)
			{
				min=a[i];
			}
		}
		
		System.out.println("Max no: "+max);
		System.out.println("Min no: "+min);
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
