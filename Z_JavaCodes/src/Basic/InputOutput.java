package Basic;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Scanner;

public class InputOutput 
{
	
	public static void main(String args[]) 
	{
		
		try
		{
			
//			int a,b;
//			DataInputStream input=new DataInputStream(System.in);
//			
//			System.out.println("Enter 1st inputs");
////			a=input.readInt(); //similarly to redaddInt, readlong, double, line  --- DONT USE  gives out like garbage value as it takes inputs as BYTE, use readline
//			a=Integer.parseInt(input.readLine());	
//			System.out.println("Enter 2nd inputs");
////			b=input.readInt();
//			b=Integer.parseInt(input.readLine()); // line is string and need to be converted to Int - Integer is Wrapper class
//			System.out.println(a+b);
			
					
//			Scanner input = new Scanner(System.in);
//			System.out.println("Enter 1st inputs");
//			a=input.nextInt();
//			System.out.println("Enter 2nd inputs");
//			b=input.nextInt();
//			System.out.println(a+b);
			
//			
//			BufferedReader input=new BufferedReader(new InputStreamReader(System.in));
//			System.out.println("Enter 1st inputs");
//			a=Integer.parseInt(input.readLine());
//			System.out.println("Enter 2nd inputs");
//			b=Integer.parseInt(input.readLine());
//			System.out.println(a+b);
			
//			
			//Reading from Text file
//			FileReader obj= new FileReader("C:\\Users\\kunal\\Desktop\\test.txt"); // --tried with File, not working. need to be of reader type
//			
//			BufferedReader br=new BufferedReader(obj);
			
//			String data= br.readLine();
//			System.out.println(data);
//			
//			while(br.readLine()!=null)
//			{
//				System.out.println(data);
//				 data= br.readLine();
//			}
//			
//			br.close();
//			
			
			
			// Scanner-----
//			 this also can be use with scanner
			
//			FileReader obj= new FileReader("C:\\Users\\kunal\\Desktop\\test.txt");  
			
//			File obj=new File("C:\\Users\\kunal\\Desktop\\test.txt");
//			Scanner in=new Scanner(obj);
//			
//			while(in.hasNextLine())
//			{
//				
//				System.out.println(in.nextLine());
//			}
			
	
			
			
//			Writing into file:
			
//			File obj=new File("C:\\Users\\kunal\\Desktop\\test.txt");
			
//			if(!obj.exists())
//			{
//				obj.createNewFile();
//			}
//			String str="test";
//			FileWriter fr= new FileWriter(obj); // can be done usin only this
//			fr.write(str);
//			BufferedWriter bw=new BufferedWriter(fr);
//			bw.write(str);
//			
//			fr.flush();
//			fr.close();
//				
//			System.out.println("Writing done");
			
			
//		 File file =new File("C:\\Users\\kunal\\Desktop\\test.txt");
//	     PrintWriter obj= new PrintWriter(file);
//	     obj.println("Test");
//	     obj.println("Test");
//	     obj.println("Test");
//	     
//	     obj.flush();
//	     obj.close();
	     
//	     System.out.println("Writing done");
			 
			 
			
		}
		catch(Exception e)
		{
			System.out.println("Error Occured - Coding thikse kar");
		}
	}

}
