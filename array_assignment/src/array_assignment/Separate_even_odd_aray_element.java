//PROGRAM TO SEPARATE EVEN AND ODD ELEMENT IN 2 DIFFERENT ARRAYS
//(Took the help of internet)

package array_assignment;
import java.util.*;

public class Separate_even_odd_aray_element {
	
	int i;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n,j=0,k=0;
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the number of elements:") ;
		n = sc.nextInt();
		 
		int a[]=new int[n];
		int odd[]=new int[n];
		int even[]=new int[n];
		
		System.out.println("enter the element of an array: ");
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		
		
		for(int i = 0; i < n; i++)
        {
            if(a[i] % 2 != 0)
            {
                odd[j] = a[i];
                j++;
            }
            else
            {
                even[k] = a[i];
                k++;
            }
        }
		
		
       System.out.print("Odd:");
        if(j > 1)
        {
            for(int i = 0;i < (j-1); i++)
            {
                System.out.print(odd[i]+",");
            }
            System.out.print(odd[j-1]);
        }
        else
        {
            System.out.println("No number");
        }
        System.out.println("");
        
        System.out.print("Even:");
        
        if(k > 1)
        {

            for(int i = 0; i < (k-1); i++)
            {
                System.out.print(even[i]+",");
            }
        System.out.print(even[k-1]);
        }
        else
        {
            System.out.println("No number");
        }
		
		
		
		//System.out.println("Original Array : "+Arrays.toString(a));
		
		

	}

}
