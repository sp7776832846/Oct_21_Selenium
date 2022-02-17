package org.basic_Method;  // [Date :- 31-01-22]

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.utilities.BaseUtility;

public class IsMethodEx {
	public static void main(String[] args) {
		WebDriver driver;
		String url = "https://demoqa.com/radio-button";
		BaseUtility bu = new BaseUtility();
		driver = bu.StartUp("ch", url);
		driver.findElement(By.cssSelector("#close-fixedban>img")).click();
		
		// Is Enabled Method.
		WebElement noRadioBtn = driver.findElement(By.id("noRadio"));
		System.out.println("No Radio : "+noRadioBtn.isEnabled());
		
		// Is Selected Method.
		WebElement yesRadioBtn = driver.findElement(By.id("yesRadio"));
		// yesRadioBtn.click();      // Click not perform that is why we used select JavaScript.
//		bu.clickByJS(yesRadioBtn, driver);    // Used JavaScript to perform Click operation, Normally not happen.
//		System.out.println("Yes Radio : "+yesRadioBtn.isSelected());
		if (!yesRadioBtn.isSelected()) {
			JavascriptExecutor js = (JavascriptExecutor)driver;
			js.executeScript("document.getElementById('yesRadio').click();");
//			bu.selectedByJS(yesRadioBtn, driver);   // Akshay say we have to ask sir how to make this generic, we are not able to solve this.
		}
		System.out.println("Yes Radio : "+yesRadioBtn.isSelected());
		
		// Is Displayed Method.
		//System.out.println("No Radio: isDisplayed() -> "+noRadioBtn.isDisplayed());			// This two line not run IsDispayed(),
		//System.out.println("Yes Radio: isDisplayed() -> "+yesRadioBtn.isDisplayed());				// due to this suraj sir go for below line of code.
	
//		WebElement label = driver.findElement(By.xpath("//label[@for='impressiveRedRadio'"));	// Insted of this line of code sir used ISPresent Method, 
//		System.out.println(label.isDisplayed());													// bcz it is easy to used.
	}
	public boolean isPresent(WebElement ele, int time) throws InterruptedException {
		for (int i = 1; i <=time; i++) {
			try { 
				ele.isDisplayed();
				return true;
			} catch (Exception e) {
				Thread.sleep(1000);
				continue;
			}
		}
		return false;
	}
}