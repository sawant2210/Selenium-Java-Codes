package Patterns;

import java.util.Scanner;

public class Pattern2 
{

	public static void main(String[] args)
	{

//		System.out.print("Enter the no of rows");
//		
//		Scanner in = new Scanner(System.in);
//		
//		int row=in.nextInt();
		 
		int c=1;
		
		for(int i=4;i>=1;i--) 
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(i+" ");
				
			}
			System.out.println();
			c++;
		}
		
		

	}

}
