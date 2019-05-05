package ExceptionHandeling;

import java.util.Scanner;

public class CustomException1 {

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
			throw new CustomException("Exception generated using throw");
			}
			else
			{
			System.out.println(a/b);
			}
		}
		catch(CustomException e)
		{
			System.out.println("Exception Found");
			System.out.println(e.getMessage());
		}
	

	}

}
