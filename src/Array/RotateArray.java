package Array;

import java.util.Scanner;

public class RotateArray {

	public static void main(String[] args) 
	{
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the size of an Array");
		int n=in.nextInt();
			
		int a[]= new int[n];
		
		System.out.println("Enter elements of array");

		for(int i=0;i<n;i++)
		{
			a[i]=in.nextInt();
		}
		
		int temp=a[n-1];
		
		
		for(int i=n-1;i>=1;i--)
		{
			a[i]=a[i-1];
		}
		
		a[0]=temp;
		System.out.println("Rotated array");
		
		for(int i=0;i<n;i++)      // to rotate n times add one more for loop
		{
			System.out.print(a[i]+" ");
		}
		
	}
	
	

}
