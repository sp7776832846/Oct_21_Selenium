package org.fileUploadDownload;  // [ Date:- 01-02-22]

import java.io.IOException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.utilities.BaseUtility;

public class GenericUpload {

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
		 System.out.println(System.getProperty("user.dir"));     // From .getProperty() we get Path of file, used Pratik Kale not Sir.
		 Runtime.getRuntime().exec(						// It is single line of java commend used to called Text file of AutoIT.
				 "D:\\Acceleration\\Workspace\\Oct_Maven_Project\\AutoITFiles\\Generic_FileUpload.exe");  // This line is Generic Upload for File Browser.
	}
}
