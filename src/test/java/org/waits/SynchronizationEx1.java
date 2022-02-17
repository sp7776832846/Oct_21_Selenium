package org.waits;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.utilities.BaseUtility;

public class SynchronizationEx1 { 				// Synchronization :- [matching the speed of application with the speed of Automation script, for saving time.]
	public static void main(String[] args) {
		WebDriver driver;
		String url = "http://localhost/login.do";
		BaseUtility bu = new BaseUtility();
		driver = bu.StartUp("ch", url);

		driver.findElement(By.id("username")).sendKeys("admin");

		driver.findElement(By.cssSelector(".textField.pwdfield")).sendKeys("manager");

		driver.findElement(By.cssSelector("#loginButton>div")).click();

//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));			// Implicit Wait Syntax for version 4.
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);		// Implicit Wait Syntax for upto version 3.
		
		//		WebDriverWait wt = new WebDriverWait(driver, Duration.ofSeconds(10));		// Two line Syntax of Explicit Wait for version 4.
		//		wt.until(ExpectedConditions.visibilityOf(driver.findElement(By.id("logoutLink"))));

		WebElement logoutBtn = driver.findElement(By.id("logoutLink"));			//	driver.findElement(By.id("logoutLink")).click();
																		//	[ find logout click webElement by using ID locator.]
		logoutBtn.click();
	}
	public void waitForVisibilityofElement(WebDriver driver, int time, WebElement ele) {			// This Generic Method for Logout.
//		WebDriverWait wt = new WebDriverWait(driver, Duration.ofSeconds(time));					//Not possible for another WebElement [Day-56 Time:- 1.57.44]
		WebDriverWait wt = new WebDriverWait(driver,time);
		wt.until(ExpectedConditions.visibilityOf(driver.findElement(By.id("logoutLink"))));
	}
}
