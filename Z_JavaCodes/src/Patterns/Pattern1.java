package Patterns;

import java.util.Scanner;

public class Pattern1 
{
	 
	
		
	public static void main(String[] args)
	{
//		System.out.print("Enter the no of rows");
//		
//		Scanner in = new Scanner(System.in);
//		
//		int row=in.nextInt();
		
		
		// - ------- Pattern 1 ------
		
		int row=5;
		
//		for(int i=1;i<=row;i++)
//		{
//			for(int j=1;j<=i;j++)
//			{
//				System.out.print("*");;
//			}
//			
//			System.out.println();
//			
//		}
		
		// - ------- Pattern 2 ------
		
//		for(int i=1;i<=row;i++)
//		{
//			for(int j=1;j<=i;j++)
//			{
//				System.out.print(i);;
//			}
//			
//			System.out.print("\n");
//			
//		}
		
		// - ------- Pattern 3------
		
//				for(int i=1;i<=row;i++)
//				{
//					for(int j=1;j<=i;j++)
//					{
//						System.out.print(j+" ");;
//					}
//					
//					System.out.println();
//					
//				}
				
		// - ------- Pattern 4------
				
		
		char c= 'A';
				for(int i=1;i<=row;i++)
				{
					for(int j=1;j<=i;j++)
					{
						System.out.print(c++);;
						
					}
					
					System.out.println();
					
				}
						
		
	}

}
