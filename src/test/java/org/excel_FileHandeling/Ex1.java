package org.excel_FileHandeling;  //[Date :- 04-02-22]

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Ex1 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		String path = System.getProperty("user.dir");
		System.out.println(path);
		FileInputStream fis = new FileInputStream(path+
				"\\ExcelFiles\\TestData.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		int totalNoSheets = wb.getNumberOfSheets();
		System.out.println("totalNoSheets = "+totalNoSheets);
//		System.out.println(wb.getSheetName(1));
		for(int i=0; i<totalNoSheets;i++) {
			System.out.println(wb.getSheetName(i));
		}
		System.out.println(wb.getSheetIndex("Sheet3"));
	}
}
