package ExceptionHandeling;

import java.util.Scanner;

public class ThrowKeyWord {

	public static void main(String[] args)
	{
		System.out.println("Throw keyword use");
		
		System.out.println("Enter Number");
		
		Scanner in= new Scanner(System.in);
		int a= 100;
		int b=in.nextInt();
		
		if(b==5)
		{
			throw new ArithmeticException("Division by 5 is not allowed");
		}
		else
		{
			System.out.println(a/b);
		}
	}

}
