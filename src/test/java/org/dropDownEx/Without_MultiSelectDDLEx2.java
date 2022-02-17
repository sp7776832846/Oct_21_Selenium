package org.dropDownEx;		// Date:- [22-01-22]

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.utilities.BaseUtility;

public class Without_MultiSelectDDLEx2 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver;
		String url = "https://demoqa.com/select-menu";
		BaseUtility bu = new BaseUtility();
		driver = bu.StartUp("ch", url);
		bu.handleDemoQALaunch();
		driver.findElement(By.cssSelector("#close-fixedban>img")).click();
//		WebElement mulddl = driver.findElement									// WebElement findout by using depedent & Indepedent.
//		        (By.xpath("//div[p[b[text()='Multiselect drop down']]]//div[@class=' css-1wa3eu0-placeholder']"));
		WebElement mulddl = driver.findElement					// WebElement find out by direct text.
				(By.xpath("//div[text()='Select...']"));
		bu.scrollTillElement(mulddl, driver);
		mulddl.click();
		
		Thread.sleep(2000);
//		ddl.sendKeys("Green");
//		ddl.sendKeys("Red");
		System.out.println(driver.getPageSource());
//		driver.findElement(By.xpath("//div[text()='Green']")).click();
//		driver.findElement(By.xpath("//div[text()='Red']")).click();
	}
}


