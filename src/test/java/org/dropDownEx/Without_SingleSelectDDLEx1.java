package org.dropDownEx;		// Date:- [22-01-22]

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.utilities.BaseUtility;

public class Without_SingleSelectDDLEx1 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver;
		String url = "https://demoqa.com/select-menu";
		BaseUtility bu = new BaseUtility();
		driver = bu.StartUp("ff", url);
		bu.handleDemoQALaunch();
		driver.findElement(By.cssSelector("#close-fixedban>img")).click();
		WebElement ddl = driver.findElement
				(By.cssSelector("#withOptGroup .css-1wa3eu0-placeholder"));
		ddl.click();
		
//		System.out.println(driver.getPageSource());   //..This is done by manually for finding out without select tag webElement.
//		/*ddl.sendKeys("Group 2, option 2");
//		ddl.sendKeys(Keys.ENTER);*/
		
//		driver.findElement(By.xpath("//div[text()='Group 2, option 2']")).click(); // This is done by basic person, by getpagesource method get DOME page source
		                                                                                   // then find out WebElement in Notepad finally used lacator to find element.
		
		driver.findElement(By.xpath("//*[text()='Group 2, option 2']")).click();  // Rearest use of this method in company,
		                                                                                   // It is used by Experience person. 
		
		//Homework given by sir, To find out Dr. Element ??....
		WebElement ddlForDrElement = driver.findElement
				(By.cssSelector("#selectOne .css-1wa3eu0-placeholder"));
		ddlForDrElement.click();
		driver.findElement(By.xpath("//*[text()='Dr.']")).click();
	}
}


