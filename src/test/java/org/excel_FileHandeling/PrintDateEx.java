package org.excel_FileHandeling;  //[Date :- 07-02-22]

import java.text.SimpleDateFormat;
import java.util.Date;

public class PrintDateEx {

	public static void main(String[] args){
		Date dt = new Date();
		System.out.println(dt);
//		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss a");
		SimpleDateFormat sdf = new SimpleDateFormat("MMM dd/yyyy HH:mm:ss a");
		String date = sdf.format(dt);
		System.out.println(date);
		date = date.replaceAll("/","").replaceAll(":", "").replaceAll(" ","");
		System.out.println(date);
	}
}
