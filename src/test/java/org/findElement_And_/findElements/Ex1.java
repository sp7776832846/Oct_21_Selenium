package org.findElement_And_.findElements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.utilities.BaseUtility;

public class Ex1 {

	public static void main(String[] args) {
		WebDriver driver;
		String url = "http://localhost/login.do";
		BaseUtility bu = new BaseUtility();
		driver = bu.StartUp("ch", url);
		// Find Element :- It gives error if element is not identified and in return give WebElement.
//		WebElement userNameField = driver.findElement(By.id("username11"));
//		userNameField.sendKeys("admin");
		
		// Find Element's :- It doesn't gives error if element is not identified,instead of it return empty list and in return give list of WebElement.
								// In Find Element's we can hanhle the error, which is not possible in Find Element.
		List <WebElement> userNameField = driver.findElements(By.id("username11"));
		if (!userNameField.isEmpty()) {
			userNameField.get(0).sendKeys("admin");
		}
	}
}
