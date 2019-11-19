//PROGRAM TO SORT AN ARRAY ELELMENT IN ASCENDING OR DECENDING ORDER

package array_assignment;
import java.util.*;

public class Sort_array_element {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int i,j,n,temp=0,sud=0;
		
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
		System.out.println();
		
		//Ascending order 
		  for (i = 0; i<a.length; i++) {   
	            for (j =i+1; j<a.length; j++) {   
	               if(a[i] >a[j]) {  
	                   temp = a[i];  
	                   a[i] = a[j];  
	                   a[j] = temp;  
	               }   
	            }   
	        }
		  System.out.println("Ascending order: "+Arrays.toString(a));
		  
		  //descending order    
	        for (i = 0; i <a.length; i++) {     
	            for (j = i+1; j<a.length; j++) {     
	               if(a[i] < a[j]) {    
	                   sud = a[i];    
	                   a[i] = a[j];    
	                   a[j] = sud;    
	               }     
	            }     
	        }    
	            
	        System.out.println();
	        
		  
		  System.out.println("Decending order: "+Arrays.toString(a));
		
	

	}

}
