package ReadWriteExcell;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;


public class WriteExcell 
{

	public static void main(String[] args) throws IOException
	{
		File myfile=new File("C:\\Users\\kunal\\Desktop\\Book2.xls");
		FileOutputStream mystream=new FileOutputStream(myfile);
		HSSFWorkbook mybook=new HSSFWorkbook();
		
		Sheet mysheet=mybook.createSheet("Sheet");
		 
		Row myrow=mysheet.createRow(0);
		Cell mycell=myrow.createCell(0);
		mycell.setCellValue("Test");
		mybook.write(mystream);
		   
		
		
		

	}

}
