package org.frames_Handeling;  // [Date :- 26-01-22]

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.utilities.BaseUtility;

public class Ex2 {

	public static void main(String[] args) {
		WebDriver driver;
		String url = "https://demoqa.com/frames";
		BaseUtility bu = new BaseUtility();
		driver = bu.StartUp("ch", url);
		//bu.handleDemoQALaunch();
		driver.findElement(By.cssSelector("#close-fixedban>img")).click();
		//Step 1: identity frame
		WebElement frameEle = driver.findElement(By.id("frame1"));
		//Step 2: switch to frame [ 3 method to switch are as follows : ]
//		driver.switchTo().frame(frameEle);     //..Method 1 :- by passing WebElement.
//		driver.switchTo().frame(1);			   //..Method 2 :- by passing Index.
		driver.switchTo().frame("frame1");		//..Method 3 :- by passing FrameName & Id value.
		String text = driver.findElement(By.id("sampleHeading")).getText();
		System.out.println("Text = "+text);
	}

}
