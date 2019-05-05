package Basic;

import java.util.Scanner;

public class A2_Palindrome {

	public static void main(String[] args) 
	{
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the number");
		int a= in.nextInt();
		int b=a;
		int rev=0;
		int c;
		while(a>0)
		{
			c=a%10;
			rev=(rev*10)+c;
			a=a/10;
			
		}
		if(b==rev)
		{
			System.out.println("Palindrome number");
		}
		else
		{
			System.out.println("Not a Palindrone Number");
			
		}

	}

}
