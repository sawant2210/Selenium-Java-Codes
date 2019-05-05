package Basic;

import java.util.Scanner;

public class A2_Factorial {

	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the number");
		int n=in.nextInt();
		int fact=1;
		for(int i=n; i>0;i--)
		{
			fact=fact*i;
		}

		System.out.println("factorial is "+fact);
	}

}
