package org.basic_Method;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.utilities.BaseUtility;

public class Login_actiTimeEx {

	public static void main(String[] args) {
		WebDriver driver;
		String url = "http://localhost/login.do";
		BaseUtility bu = new BaseUtility();
		driver = bu.StartUp("mse", url);
		
//		driver.findElement(By.xpath("//input[@id='username']"));
		
		WebElement userNameField = driver.findElement(By.id("username"));
		userNameField.sendKeys("admin");
		
		WebElement pwdField = driver.findElement(By.cssSelector(".textField.pwdfield"));
		pwdField.sendKeys("manager");
		
		WebElement loginBtn = driver.findElement(By.cssSelector("#loginButton>div"));
		loginBtn.click();
		
//		bu.tearDown();
	}

}
