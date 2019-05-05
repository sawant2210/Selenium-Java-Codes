package DefaultPackage;


import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;

public class ExcelReaderWriter {
	
	void writeToExcel(String filepath,ArrayList<String> list) throws Exception {
		
		File myfile = new File(filepath);
						
		FileOutputStream mystream = new FileOutputStream(myfile);

		HSSFWorkbook myworkbook = new HSSFWorkbook();
		Sheet mysheet = myworkbook.createSheet("sheet1");
		
		  
		Iterator<String> iterator = list.iterator(); //get the iterator object
		
		
		int i=0;
		
		while(iterator.hasNext()) {  //enter the loop if next element present
			
			Row myrow = mysheet.createRow(i++);
			Cell mycell = myrow.createCell(0);
			mycell.setCellValue(iterator.next()); // get the next element
			
		}
		
 		myworkbook.write(mystream);
 		
	}

	ArrayList<String> readExel(String filePath) throws Exception {
		ArrayList<String> list = new ArrayList<String>();
		try {
		

		File myfile = new File(filePath);
		FileInputStream mystream = new FileInputStream(myfile);
		HSSFWorkbook mybook = new HSSFWorkbook(mystream);

		Sheet mysheet = mybook.getSheet("Sheet1");
		Row myrow = null;
		Cell mycell = null;

		for (int i = mysheet.getFirstRowNum(); i <= mysheet.getLastRowNum(); i++) {
			myrow = mysheet.getRow(i);

			for (int j = myrow.getFirstCellNum(); j < myrow.getLastCellNum(); j++) {

				mycell = myrow.getCell(j);

				list.add("" + mycell.getStringCellValue());
			}
		}

		
		}
		catch(Exception e) {
			System.out.println("Following file path is not found" +" "+ filePath);
			System.out.println("Please execute programme");
		}
		return list;
	}
		

}
