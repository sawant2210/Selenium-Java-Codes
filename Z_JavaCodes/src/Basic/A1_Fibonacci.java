package Basic;

import java.util.Scanner;

public class A1_Fibonacci
{
	
	public static void main(String[] args) 
	 {
		
		// ------code for first n number of fibonacci series
//		int n;
//		System.out.println("Enter the number");
//		Scanner in= new Scanner(System.in);
//		n=in.nextInt();
//		int a=0;
//		int b=1;
//		System.out.print(a+" "+b+" ");
//		for(int i=3;i<=n;i++)
//		{
//			 int c=a+b;
//			 System.out.print(c+" ");
//			 a=b;
//			 b=c;
//		}
		
		
		// ---code for fibo numbers  till n
		
		int a=0;
		int b=1;
		System.out.print(a+" "+b+" ");
		int c=a+b;
		
		while(c<100)
		{
			
			System.out.print(c+" ");
			a=b;
			b=c;
			c=a+b;
				
			
		}
		
		

	}

}
