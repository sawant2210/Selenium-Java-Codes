package Array;

import java.util.Arrays;
import java.util.Scanner;

public class ArraysSort
{
	public static void main(String args[])
	{
		int a[]={6,2,1,7,4,8,9};
		Arrays.sort(a);
		
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+" ");
			
		}
		
		System.out.println("Third largest number: "+a[a.length-3]);
		System.out.println("2nd largest number: "+a[a.length-2]);
		System.out.println("largest number: "+a[a.length-1]);
		System.out.println("2nd smallest number: "+a[1]);
		System.out.println("2nd largest number: "+a[0]);
		
	}

}
