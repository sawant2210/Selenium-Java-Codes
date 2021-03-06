package ExceptionHandeling;

class NestingDemo
{
	   public static void main(String args[])
	   {
	      
	      try{
	    	
	        try{     
	            
	            	try
	            	{
	            	int arr[]= {1,2,3,4};
	            	System.out.println(arr[10]); // array out of bound exception occurs in inner most try block
	            	}
	            	catch(ArithmeticException e)  // to see diff out change this exception with array out of bound exception
	            	{
	            	System.out.print("Arithmetic Exception");
	            	System.out.println(" handled in try-block3");
	            	}
	            	
	            System.out.println("Out of inner most Try - catch block"); // wont be executed as control goes to  outer catch block
	          	}
	        	catch(ArithmeticException e)
	        	{
	        		System.out.print("Arithmetic Exception");
	        		System.out.println(" handled in try-block2");
	        	}
	        System.out.println("Out of 2nd most Try - catch block"); // wont be executed as control goes to  outer catch block
	        
	    }
	    catch(ArithmeticException e)
	      {
	    	System.out.print("Arithmetic Exception");
	     	System.out.println(" handled in main try-block");
	      }
//	    catch(ArrayIndexOutOfBoundsException e) // exception will be handle here
//	      {
//	    	
//	    	System.out.print("Array Index Out Of Bounds Exception");
//	     	System.out.println(" handled in main try-block");
//	      }
	    catch(Exception e)
	      {
	    	System.out.println(e);
	    	System.out.println("Exception");
	     	System.out.println(" handled in main try-block");
	     }
	      
	      System.out.println("Out of all try catch block "); // this statement will be executed
	  }
	}
