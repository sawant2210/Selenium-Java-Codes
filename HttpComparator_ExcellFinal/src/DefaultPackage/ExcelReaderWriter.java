package DefaultPackage;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;

public class ExcelReaderWriter 
{
		
	  
	ArrayList<String> ReadExel(String filePath) throws Exception
	{
		
		ArrayList<String> list = new ArrayList<String>();
		
		File myfile = new File(filePath);
		FileInputStream mystream = new FileInputStream(myfile);
		HSSFWorkbook mybook = new HSSFWorkbook(mystream);

		Sheet mysheet = mybook.getSheet("Sheet1");
		Row myrow = null;
		Cell mycell = null;

		for (int i = mysheet.getFirstRowNum(); i <= mysheet.getLastRowNum(); i++) 
		{
			myrow = mysheet.getRow(i);

			for (int j = myrow.getFirstCellNum(); j < myrow.getLastCellNum(); j++) 
			{

				
				 mycell=myrow.getCell(j);
				
				 list.add(""+mycell.getStringCellValue());
					 
			}
		}
	
		  
		return list;
	}

}
