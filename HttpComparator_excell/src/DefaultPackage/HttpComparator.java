package DefaultPackage;
import java.io.IOException;
import java.util.*;
public class HttpComparator {
	
	 private static Scanner scan; //

	public static void main(String[] ar) throws Exception  {
		
		String file1, file2, report;
		do
		{
		scan = new Scanner(System.in);   // taking the path locations for input and output excel file
		System.out.println("Enter the valid file path for first file");
		 file1=scan.nextLine();
		
		System.out.println("Enter the valid file path for second file ");
		 file2=scan.nextLine();
				
		System.out.println("Enter valid path for report file");
		 report =scan.nextLine();
		 
		 if((file1.isEmpty() || file2.isEmpty() || report.isEmpty()))
		 {
			
			 System.out.println("please enter valid file paths again ");
		 }
			
		}while(file1.isEmpty() || file2.isEmpty() || report.isEmpty());
		 
		Comparator comparator=new Comparator();
		
		comparator.startCompare(file1, file2, report);
		
		System.out.println("Finished, Please see the report in "+report);
		
		
		}  
	
	
}
