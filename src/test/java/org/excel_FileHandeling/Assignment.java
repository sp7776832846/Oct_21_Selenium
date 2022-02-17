package org.excel_FileHandeling;  //[Date :- 07-02-22]

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Assignment { // Assignment to Get complete row data for1 random row.

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		String path = System.getProperty("user.dir");
		FileInputStream fis = new FileInputStream(path+
				"\\ExcelFiles\\TestData.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		//Sheet object...
		Sheet s1 = wb.getSheet("Assignment");
		int a = s1.getLastRowNum();
		System.out.println("a = "+a);
		Math.random();
		
 
	}

}
