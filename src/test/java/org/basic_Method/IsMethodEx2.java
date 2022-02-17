package org.basic_Method;  // [Date :- 31-01-22]

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.utilities.BaseUtility;

public class IsMethodEx2 {
	public static void main(String[] args) {
		WebDriver driver ;
		String url = "https://demoqa.com/tool-tips" ;
		BaseUtility bu = new BaseUtility() ;
		driver = bu.StartUp("ch", url ) ;
		WebElement label = driver.findElement(By.xpath("//label[@for='impressiveRadio']"));
		System.out.println("is displyed = "+label.isDisplayed());
		
//		Actions act = new Actions(driver);
//		WebElement des = driver.findElement(By.xpath("//div[@class='tooltip-inner']"));
//		act.moveToElement(des);
//		WebElement toolTip = driver.findElement(By.xpath("//div[@class='tooltip-inner']"));
//		toolTip.getText();
		driver.findElement(By.cssSelector("#close-fixedban>img")).click();
		WebElement noRadioBtn = driver.findElement(By.id("noRadio"));
		noRadioBtn.isEnabled();
		WebElement yesRadioBtn = driver.findElement(By.id("yesRadio"));
		System.out.println("yesRadioBtn = "+yesRadioBtn.isSelected());
		if (!yesRadioBtn.isSelected()) {
//			JavascriptExecutor js = (JavascriptExecutor)driver;
//			js.executeScript("document.getElementById('yesRadio').click();");
			bu.selectedByJS(yesRadioBtn, driver);
		}
		System.out.println("yesRadioBtn = "+yesRadioBtn.isSelected());

	}
}