package org.fileUploadDownload;  // [ Date:- 02-02-22]

import java.io.IOException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.utilities.BaseUtility;

public class GenericFileUpload2 {

	public static void main(String[] args) throws IOException, InterruptedException {
		WebDriver driver;
		String url = "https://demoqa.com/automation-practice-form";
		driver = BaseUtility.bu.StartUp("ch", url);
		driver.findElement(By.cssSelector("#close-fixedban>img")).click();
		
		 WebElement uploadBtn = driver.findElement(By.id("uploadPicture"));
//		 uploadBtn.click();		// Normal Click () not work i.e go for JS Click below line.
		 BaseUtility.bu.scrollTillElement(uploadBtn, driver); 				// Calling Scroll Till Element method untill Element not find.
		 BaseUtility.bu.clickByJS(uploadBtn, driver);								// withod creating object of  Utility Class.
		 Thread.sleep(5000);
		 
		 String path = System.getProperty("user.dir");
		 System.out.println("project path = "+path);     // From .getProperty() we get Path of file, used Pratik Kale not Sir.
		
		 String fileName = "TestUpload.txt";
		 Runtime.getRuntime().exec(						// It is single line of java commend used to called Text file of AutoIT.
				 path+"\\AutoITFiles\\Generic_FileUpload.exe"+" "+fileName);  // This line is Generic Upload for File Browser.
	}
}
