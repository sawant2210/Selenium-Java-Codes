package Basic;

import java.util.Scanner;

public class A3_Armstong {

	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the number");
		int n=in.nextInt();
		int b=n;
		int arm=0; 
		int c;
		while(n>0)
		{
			c=n%10;
			arm=arm+(c*c*c);
			n=n/10;
		}
			if(arm==b)
			{
				System.out.println("ArmStrong no");
			}
			else
			{
				System.out.println("Not Armstrong");
			}
			
	}

}
