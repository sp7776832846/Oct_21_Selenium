package org.excel_FileHandeling;  //[Date :- 07-02-22]

import java.io.FileInputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Ex3 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		String path = System.getProperty("user.dir");
		FileInputStream fis = new FileInputStream(path+
				"\\ExcelFiles\\TestData.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		//Sheet object...
		Sheet s1 = wb.getSheet("TestData");
		int numOfRows = s1.getLastRowNum();
		System.out.println("numOfRows = "+numOfRows);
		for(int i=1; i<numOfRows; i++) {
			Row r1=s1.getRow(i);
			int numOfCells = r1.getLastCellNum();
			System.out.println("numOfCells = "+numOfCells);
			for(int k=0; k<numOfCells; k++) {
				Cell c1 = r1.getCell(k);
//				System.out.println(c1.getCellType());
//				System.out.println(c1.getStringCellValue());
				CellType ct = c1.getCellType();
				switch (ct){
				case STRING: System.out.println(c1.getStringCellValue());
				break;
				case NUMERIC: {
					if (DateUtil.isCellDateFormatted(r1.getCell(k))) {
						SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
						System.out.println(sdf.format(s1.getRow(i).getCell(k).getDateCellValue()));
					} else {
						System.out.println((long)c1.getNumericCellValue());
					}
				}
				break;
				case FORMULA: System.out.println(c1.getCellFormula());
				break;
				case BOOLEAN: System.out.println(c1.getBooleanCellValue());
				break;
				case BLANK: System.out.println("Blank Cell");
				break;
				case _NONE: System.out.println("Cell is empty");
				break;
				case ERROR: System.out.println(c1.getErrorCellValue());
				break;
				default : System.out.println("Inavalid Cell");
				}
			}
		}
	}

}
