package org.frames_Handeling;  // [Date :- 27-01-22]

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.utilities.BaseUtility;

public class Ex4 {

	public static void main(String[] args) {
		WebDriver driver;
		String url = "https://demoqa.com/nestedframes";
		BaseUtility bu = new BaseUtility();
		driver = bu.StartUp("ch", url);
		//bu.handleDemoQALaunch();
		driver.findElement(By.cssSelector("#close-fixedban>img")).click();
		//Step 1: identity frame
		WebElement frameEle = driver.findElement(By.id("frame1"));
		//Step 2: switch to frame [ 3 method to switch are as follows : ]
		driver.switchTo().frame(frameEle);
		String text = driver.findElement(By.xpath("//body[text()='Parent frame']")).getText();
		System.out.println("Text = "+text);
		
		frameEle = driver.findElement(By.id("frame1"));
		driver.switchTo().frame(frameEle);
		text = driver.findElement(By.xpath("//body[text()='Child Iframe']")).getText();
		System.out.println("Text = "+text);
	}
}
