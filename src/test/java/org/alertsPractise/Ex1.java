package org.alertsPractise;		//[Date :- 28-01-22]

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.utilities.BaseUtility;

public class Ex1 {

	public static void main(String[] args) {
		WebDriver driver;
		String url = "https://demoqa.com/alerts";
		BaseUtility bu = new BaseUtility();
		driver = bu.StartUp("ch", url);
		driver.findElement(By.cssSelector("#close-fixedban>img")).click();
		driver.findElement(By.id("promtButton")).click();
//		Alert obj = driver.switchTo().alert();
//		System.out.println(obj.getText());
//		obj.sendKeys("Hello From 21 Octomber");
//		//obj.accept();
//		obj.dismiss();
		String text = driver.switchTo().alert().getText();
		System.out.println("Alert Text"+text);
		driver.switchTo().alert().sendKeys("Hello From 21 Octomber");
		driver.switchTo().alert().accept();
	}

}
