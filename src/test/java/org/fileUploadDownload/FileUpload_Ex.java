package org.fileUploadDownload;  // [ Date:- 01-02-22]

import java.io.IOException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.utilities.BaseUtility;

public class FileUpload_Ex {

	public static void main(String[] args) throws IOException {
		WebDriver driver;
		String url = "https://demoqa.com/automation-practice-form";
		driver = BaseUtility.bu.StartUp("ch", url);
		driver.findElement(By.cssSelector("#close-fixedban>img")).click();
		 WebElement uploadBtn = driver.findElement(By.id("uploadPicture"));
		 BaseUtility.bu.scrollTillElement(uploadBtn, driver); 				// Called Scroll Till Element method 
		 BaseUtility.bu.clickByJS(uploadBtn, driver);								// withod creating object of  Utility Class.
		 Runtime.getRuntime().exec(						// It is single line of java commend used to called Text file of AutoIT.
				 "D:\\Acceleration\\Workspace\\Oct_Maven_Project\\AutoITFiles\\FileUpload[Edge&Chrome].exe"); 
	}
	
}
