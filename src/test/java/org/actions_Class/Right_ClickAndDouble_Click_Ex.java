package org.actions_Class;			//[Date :- 27-01-22]

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.utilities.BaseUtility;

public class Right_ClickAndDouble_Click_Ex {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver;
		String url = "https://demoqa.com/links";
		BaseUtility bu = new BaseUtility();
		driver = bu.StartUp("ch", url);
		driver.findElement(By.cssSelector("#close-fixedban>img")).click();
		WebElement src = driver.findElement(By.id("simpleLink"));
		Actions act = new Actions(driver);
		// Right(Singlr) Click.
//		act.contextClick(src).perform();		// Right click is perform.
//		Thread.sleep(2000);
//		act.sendKeys(Keys.ARROW_DOWN).click().perform();   // open Tap Window only
//		act.sendKeys("T").click().perform();
		
		//act.sendKeys("W").click().perform(); 	// This line don't perform, it open Tap Window 
																// Instead of New Window.
		// Double Click.
//		act.doubleClick(src).perform();
		
		act.moveToElement(src).doubleClick();
		Thread.sleep(2000);
		act.sendKeys("T").click().perform();
	}
}
