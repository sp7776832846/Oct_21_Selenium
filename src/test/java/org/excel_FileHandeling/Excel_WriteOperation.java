package org.excel_FileHandeling;  //[Date :- 08-02-22]

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Excel_WriteOperation {

	public static void main(String[] args) throws EncryptedDocumentException, IOException{
		String path = System.getProperty("user.dir");
		FileInputStream fis = new FileInputStream(path+
				"\\ExcelFiles\\TestData.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		//Sheet object...
		Sheet s1 = wb.getSheet("TestData");
		int numOfRows = s1.getLastRowNum();
		System.out.println("numOfRows = "+numOfRows);
		
		//Row object...
//		Row r1 = s1.getRow(1);
//		Cell c1 = r1.createCell(2);
//		c1.setCellValue("PASS");
		
		s1.getRow(1).createCell(2).setCellValue("PASS");
		s1.getRow(1).createCell(2).setCellValue("FAIL");
		s1.getRow(1).createCell(2).setCellValue("FAIL");
		
		FileOutputStream fos = new FileOutputStream(path+
				"\\ExcelFiles\\TestData.xlsx");
		wb.write(fos);
		fos.close();      // fos:- file Output Stream.
	}
}
