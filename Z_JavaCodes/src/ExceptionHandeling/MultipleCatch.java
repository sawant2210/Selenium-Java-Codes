package ExceptionHandeling;

public class MultipleCatch {

	public static void main(String[] args)
	{
		try{
	         int arr[]=new int[7];
//	         System.out.println(arr[10]);
	         arr[10]=10/0;
	         System.out.println("Last Statement of try block");
	      }
//	      catch(Exception e)
//		  {
//	         System.out.println("Some Other Exception");
//	      }
	      catch(ArithmeticException e)   // after  un commenting above catch block with Exception e, eclipse don't allow to write below catch blocks(gives error)
		  {
	         System.out.println("You should not divide a number by zero");
	      }
	      catch(ArrayIndexOutOfBoundsException e){
	         System.out.println("Accessing array elements outside of the limit");
	      }
	      System.out.println("Out of the try-catch block");
		
		

	}

}
