package Array;

import java.util.Scanner;

public class Sorting {

	public static void main(String[] args)
	{

		Scanner in = new Scanner(System.in);
		System.out.println("Enter the size of an Array");
		int n=in.nextInt();
		
		int a[]={5,4,1,3,2};
//		int a[]= new int[n];
//				
//		System.out.println("Enter the elements of Array");
//		
//		for(int i=0;i<n;i++)
//		{
//			a[i]=in.nextInt();
//			
//		}
		
		for(int i=0;i<n-1;)  //-------------- using single loop
		{
			if(a[i]>a[i+1])
			{
				int temp=a[i];
				a[i]=a[i+1];
				a[i+1]=temp;
				i=0;
			}
			else
			{
				i++;
			}
		}
		
		for(int i=0;i<n-1;i++)
		{
			for(int j=i+1;j<n;j++)
			{	
				if(a[i]>a[j])
				{
				int temp=a[i];
				a[i]=a[j];
				a[j]=temp;
				}
			}
				
				
		}
		
		System.out.println("Array in ascending order is:");
		
		for( int i=0;i<n;i++)
		{
			System.out.print(a[i]+" ");
			
		}
		

	}

}



//
//for(int i=0; i<obj2.size()-1;i++) -----for checking sorted in ascending order or not 
//{
//	if (a[i]>a[i+1]) 
//	{
//		c++;
//	}
//}