package org.alertsPractise;		//[Date :- 28-01-22]

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.utilities.BaseUtility;

public class Ex2 {

	public static void main(String[] args) {
		WebDriver driver;
		String url = "https://demoqa.com/alerts";
		BaseUtility bu = new BaseUtility();
		driver = bu.StartUp("ch", url);
		driver.findElement(By.cssSelector("#close-fixedban>img")).click();
		driver.findElement(By.id("timerAlertButton")).click();
		Ex2 obj1 = new Ex2();
		if (obj1.isAlertPresent(driver,2)) {
			Alert obj = driver.switchTo().alert();
			System.out.println(obj.getText());
			obj.accept();
		} else {
			System.out.println("No Alert is present");
		}
	}

	public boolean isAlertPresent(WebDriver driver, int time) {
		try {
//			WebDriverWait wt = new WebDriverWait(driver, Duration.ofSeconds(time));
			WebDriverWait wt = new WebDriverWait(driver, time);
			wt.until(ExpectedConditions.alertIsPresent());
			return true;
		} catch (Exception e) { 
			return false;
		}
	}
}
