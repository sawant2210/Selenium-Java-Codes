package DefaultPackage;
import java.io.IOException;
import java.util.*;
public class HttpComparator {
	
	 private static Scanner scan; //

	public static void main(String[] ar) throws Exception  {
		
		scan = new Scanner(System.in);
		System.out.println("Enter the file path for first file");
		String file1=scan.nextLine();
		
		System.out.println("Enter the file path for second file ");
		String file2=scan.nextLine();
		
		System.out.println("Enter path for report file");
		String report =scan.nextLine();
		
		Comparator comparator=new Comparator();
		
		comparator.startCompare(file1, file2, report);
		
		System.out.println("Finished, Please see the report in "+report);
		
		
		}  
	
	
}
