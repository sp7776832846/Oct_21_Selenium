package org.basic_Method;		//[Date :- 28-01-22]

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.utilities.BaseUtility;

public class GetAttribute_Ex {

	public static void main(String[] args) {
		WebDriver driver;
		String url = "https://demoqa.com/alerts";
		BaseUtility bu = new BaseUtility();
		driver = bu.StartUp("ch", url);
		driver.findElement(By.cssSelector("#close-fixedban>img")).click();
		WebElement alertBtn = driver.findElement(By.id("alertButton"));
		String classValue = alertBtn.getAttribute("class");
		System.out.println("classValue = "+classValue);
	}
}
