package org.window_Handeling;	// [Date :- 25-01-22]

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.utilities.BaseUtility;

public class Single_Window {

	public static void main(String[] args) {
		WebDriver driver;
		String url = "https://demoqa.com/browser-windows";
		BaseUtility bu = new BaseUtility();
		driver = bu.StartUp("ch", url);
//		bu.handleDemoQALaunch();
		driver.findElement(By.cssSelector("#close-fixedban>img")).click();	
		String parentId1 = driver.getWindowHandle();
		driver.findElement(By.id("tabButton")).click();
		String parentid2 = driver.getWindowHandle();
		System.out.println("parentId1 : "+parentId1);
		System.out.println("parentId2 : "+parentid2);
		Set<String>allWinIds = driver.getWindowHandles();
		Iterator<String>itr = allWinIds.iterator();
		String id1 = itr.next();
		System.out.println("id1 : "+id1);
		String id2 = itr.next();
		System.out.println("id2 : "+id2);
		String text = driver.findElement(By.id("sampleHeading")).getText();
		System.out.println("text : "+text);
		System.out.println("url : "+driver.getCurrentUrl());
		driver.close();
		driver.switchTo().window(id1);
		driver.close();
		driver.quit();
		
}
}
