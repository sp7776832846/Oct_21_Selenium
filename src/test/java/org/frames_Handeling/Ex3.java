package org.frames_Handeling;  // [Date :- 27-01-22]

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.utilities.BaseUtility;

public class Ex3 {

	public static void main(String[] args) {
		WebDriver driver;
		String url = "https://demoqa.com/frames";
		BaseUtility bu = new BaseUtility();
		driver = bu.StartUp("ch", url);
		//bu.handleDemoQALaunch();
		driver.findElement(By.cssSelector("#close-fixedban>img")).click();
		WebElement frameEle = driver.findElement(By.id("frame1"));
		driver.switchTo().frame(frameEle);
		String text = driver.findElement(By.id("sampleHeading")).getText();
		System.out.println("Text = "+text);
		driver.switchTo().defaultContent(); // Switch to default content.
		
		frameEle = driver.findElement(By.id("frame2"));
		driver.switchTo().frame(frameEle);
		text = driver.findElement(By.id("sampleHeading")).getText();
		System.out.println("Text = "+text);
		driver.switchTo().defaultContent();  // SSwitch to default content.
	}
}
