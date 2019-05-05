package Array;

import java.util.Scanner;

public class VerifyAscending {

	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the size of an Array");
		int n=in.nextInt();
		
		int a[]= new int[n];
		
		System.out.println("Enter the elements of Array");
		
		for(int i=0;i<n;i++)
		{
			a[i]=in.nextInt();
			
		}
		int c=0;
		for(int i=0; i<n-1;i++)   //-----------logic for check
		{
			if(a[i]>a[i+1])
			{
				c++;
				break;
			}
		}
		if(c==0)
		{
			System.out.println("Array is sorted");
		}
		else
		{
			System.out.println("Array is not sorted");
		}

	}

}
