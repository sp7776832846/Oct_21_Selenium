package org.basic_Method;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.utilities.BaseUtility;

public class SynchronizationEx {
	public static void main(String[] args) {
		WebDriver driver;
		String url = "http://localhost/login.do";
		BaseUtility bu = new BaseUtility();
		driver = bu.StartUp("ch", url);
		
//		driver.findElement(By.xpath("//input[@id='username']"));		// find UserName webElement by using x-path locator.
		
//		WebElement userNameField = driver.findElement(By.id("username"));				// find UserName webElement by using ID locator.
		driver.findElement(By.id("username")).sendKeys("admin");
		
//		WebElement pwdFieldElement = driver.findElement(By.cssSelector(".textField.pwdfield"));			// find password webElement by using CSS locator.
		driver.findElement(By.cssSelector(".textField.pwdfield")).sendKeys("manager");
		
//		WebElement loginField = driver.findElement(By.cssSelector("#loginButton>div"));
		driver.findElement(By.cssSelector("#loginButton>div")).click();
		
//		String loginPageTitle = driver.getTitle();
//		driver.findElement(By.id("logoutLink")).click();						// find logout click webElement by using ID locator.
		
//		String dashboardPageTitle = driver.getTitle();
//		
//		if(loginPageTitle.equals(dashboardPageTitle)) {
//			System.out.println("Login Is Unsucessful");
//		} else {
//			System.out.println("Login Is sucessful");
//		}
		WebElement logoutBtn = driver.findElement(By.id("logoutLink"));
		logoutBtn.click();
	}
}