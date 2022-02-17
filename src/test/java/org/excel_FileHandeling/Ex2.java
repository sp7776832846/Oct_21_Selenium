package org.excel_FileHandeling;  //[Date :- 04-02-22]

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Ex2 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		String path = System.getProperty("user.dir");
		FileInputStream fis = new FileInputStream(path+
				"\\ExcelFiles\\TestData.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		//Sheet object...
		Sheet s1 = wb.getSheet("TestData");
		int a = s1.getLastRowNum();
		int b = s1.getPhysicalNumberOfRows();
		System.out.println("a = "+a);
		System.out.println("b = "+b);
		
		//Row object...
		Row r1 = s1.getRow(1);
		int x = r1.getLastCellNum();
		int y = r1.getPhysicalNumberOfCells();
		System.out.println("x = "+x);
		System.out.println("y = "+y);
		
		//Cell object...
		Cell c1 = r1.getCell(6);
//		System.out.println(c1); 
		//System.out.println(c1.getStringCellValue());   //Cannot get a STRING value from a NUMERIC cell, IllegalStateException comme.
		System.out.println((int)c1.getNumericCellValue());   // here result come in dicimal i.e we do type casting convert double into integer.
	}

}
