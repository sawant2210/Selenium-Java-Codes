package ExceptionHandeling;

public class FinallyNoRun {

	public static void main(String[] args) 
	{
		System.out.println("--Main Meethod-- ");
//		int num=121/0;  						// this statement stops finally block to execute
		
		try
		{
			System.out.println("Try block ");  
			System.exit(0); 					// this statement stops finally block to execute
			
		}
		catch(ArithmeticException e)   			// change it to array index out of bound exception  
												//will give error but finally will be always executed --ArrayIndexOutOfBoundsException
		{
			System.out.println("Number should not be divided by zero");
		}
		finally
		{
			System.out.println("This is finally block");
		}

	}

}