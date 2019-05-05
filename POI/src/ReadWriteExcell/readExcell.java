package ReadWriteExcell;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;


import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;

public class readExcell 
{

	public static void main(String[] args) throws IOException 
	{
		
		File myfile=new File("C:\\Users\\kunal\\Desktop\\Book1.xls");
		FileInputStream mystream=new FileInputStream(myfile);
		HSSFWorkbook mybook= new HSSFWorkbook(mystream);
		
		Sheet mysheet=mybook.getSheet("Sheet1");
		Row myrow=null;
		Cell mycell=null;
	
		for(int i=mysheet.getFirstRowNum();i<= mysheet.getLastRowNum();i++)
		{
			myrow=mysheet.getRow(i);
			//System.out.println(mysheet.getFirstRowNum());
			//System.out.println(mysheet.getLastRowNum());
			for(int j=myrow.getFirstCellNum();j< myrow.getLastCellNum();j++)
			{
				System.out.println(myrow.getFirstCellNum());
				System.out.println(myrow.getLastCellNum());
				//mycell=myrow.getCell(j);
				//System.out.print(" "+mycell.getStringCellValue());
			}
			System.out.println();
		}
		
		
		
		
		
	}

}
