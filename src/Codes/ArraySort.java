package Codes;

import java.util.Scanner;

public class ArraySort
{

	
	public static void main(String args[])
	{
		 int a[]=new int[6];
		 
		 
		 
		 System.out.println("Enter the Elements of an Array");
		 
		 Scanner in = new Scanner(System.in);
		 
		 for (int i=0;i<a.length;i++)
		 {
			 
			 a[i]=in.nextInt();
			 
		 }	
		 
		 int temp=a[a.length-1];
		 
		 for(int i=0;i<a.length-1;i++)
		 {
			 a[i+1]=a[i];
		 }
		 
		 		 
//		 for(int i=0;i<a.length-1;) // --------- Using single array
//		 {
//			 if(a[i]>a[i+1])
//			 {
//				 int temp=a[i];
//				 a[i]=a[i+1];
//				 a[i+1]=temp;
//				 i=0;
//				 
//			 }
//			 else
//			 {
//				i++; 
//			 }
//		 }
		 
		 
		 
//		 for (int i=0;i<a.length;i++)
//		 {
//			 
//			 for (int j=i+1;j<a.length;j++)
//			 {
//				 if(a[i]>a[j])
//				 {
//					 int temp=a[i];
//					 a[i]=a[j];
//				     a[j]=temp;
//					 
//				 }
//			 }
//		 }
		 
		 
		 System.out.println(" Array in ascending order - ");
		 
		 for (int i=0;i<a.length;i++)
		 {
			 
			 System.out.print(a[i]+" ");;
			 
		 }
		 
	}
   
}