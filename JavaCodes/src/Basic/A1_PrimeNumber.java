package Basic;

import java.util.Scanner;

class Primecheck
{

	public void isPrime(int n)
	{
		if(n==0 || n==1)
		{
			System.out.println("Not a Prime number");
		}
		
		int flag = 0;
		for(int i=2; i<n; i++)
		{
			if(n%i==0)
			{
				System.out.println("Not a Prime number");
				 flag=1;
				break;
			}
		}
		if(flag==0)
		{
			System.out.println("Prime Number");
		}
		
	}
}

public class A1_PrimeNumber 
{

	public static void main(String[] args) 
	{
		System.out.println("Enter the number");
		Scanner in = new Scanner(System.in);
		int a=in.nextInt();
		Primecheck obj=new Primecheck();
		obj.isPrime(a);

	}

}
