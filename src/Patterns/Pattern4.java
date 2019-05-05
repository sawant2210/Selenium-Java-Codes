package Patterns;

import java.util.Scanner;

import javax.swing.plaf.synth.SynthScrollBarUI;

public class Pattern4 {

	public static void main(String[] args) 
	{

//		System.out.print("Enter the no of rows");
//		
//		Scanner in = new Scanner(System.in);
//		
//		int row=in.nextInt();
//		 
//		int c=1;
		
		for(int i=5;i>=1;i--) 
		{
			for(int j=1;j<=5-i;j++)
			{
				System.out.print(" ");
				
			}
			for(int k=1;k<=i;k++)
			{
				System.out.print("*"+" ");
				
			}
			
			System.out.println();
			
		}
		
		
		
		// -------Pattern 5-------
//		for(int i=1;i<=5;i++)
//		{
//			for(int j=1;j<=5-i;j++) 
//			{
//				System.out.print(" ");
//				
//			}
//			
//			for(int k=1;k<=i;k++)
//			{
//				System.out.print("*"+" ");
//			}
//			
//			System.out.println();
//		}


	}

}
