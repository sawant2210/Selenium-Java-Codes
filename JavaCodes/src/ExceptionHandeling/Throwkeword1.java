package ExceptionHandeling;

import java.util.Scanner;

public class Throwkeword1 
{
public static void main(String[] args)
{
	try
	{
		System.out.println("Throw keyword use");
	
		System.out.println("Enter Number");
	
		Scanner in= new Scanner(System.in);
	
		int a= 100;
	
		int b=in.nextInt();
	
		if(b==5)
		{
		throw new ArithmeticException("Exeception occured - Division by 5 is not allowed");
//		throw new ArithmeticException();
		}
		else
		{
			System.out.println(a/b);
		}
	}
	catch(Exception e)
	{
		System.out.println(e);
		System.out.println(e.getMessage());
//		System.out.println("Exeception occured - Division by 5 is not allowed");
	}
	
}
}