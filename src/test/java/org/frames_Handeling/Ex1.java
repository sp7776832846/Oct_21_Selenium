package org.frames_Handeling;  // [Date :- 26-01-22]

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.utilities.BaseUtility;

public class Ex1 {

	public static void main(String[] args) {
		WebDriver driver;
		String url = "https://demoqa.com/frames";
		BaseUtility bu = new BaseUtility();
		driver = bu.StartUp("ch", url);
		//bu.handleDemoQALaunch();
		driver.findElement(By.cssSelector("#close-fixedban>img")).click();
		//Step 1: identity frame
		WebElement framEle = driver.findElement(By.id("frame1"));
		
		//by using explicit wait [ We can use this Generic method to switch,
									// In this Explicit Wait which will wait for given time as well switch on it.]
		
		bu.waitForFrameLoad(driver, framEle);
		WebElement text = driver.findElement(By.id("sampleHeading"));
		System.out.println("Text = "+text);
	}
}
