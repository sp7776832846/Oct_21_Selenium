package org.window_Handeling; // [Date :- 25-01-22]

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.utilities.BaseUtility;

public class Generic_Switch {

	public static void main(String[] args) {
		WebDriver driver;
		String url = "https://demoqa.com/browser-windows";
		BaseUtility bu = new BaseUtility();
		driver = bu.StartUp("ch", url);
		//bu.handleDemoQALaunch();
		driver.findElement(By.cssSelector("#close-fixedban>img")).click();	
		String parentId1 = driver.getWindowHandle();
		System.out.println("parentId1 : "+parentId1);
		driver.findElement(By.id("tabButton")).click();
		Set<String>allWinIds = driver.getWindowHandles();
		Iterator<String>itr = allWinIds.iterator();
		String str =null; 
		while (itr.hasNext()) {
			str = itr.next();
			if (!str.equals(parentId1)) {
				driver.switchTo().window(str);
				try {
					WebElement ele = driver.findElement(By.id("sampleHeading"));
					System.out.println("text : "+ele.getText());
					System.out.println("url : "+driver.getCurrentUrl());
					break;
				} catch (Exception e) {
					// TODO: handle exception
				}
			}
		}
		driver.quit();
	}
}

//List<WebElement> listEle = driver.findElements(By.id("sampleHeading"));
//if (!listEle.isEmpty()) {
//	//String text = listEle.get(0).getText();
//	System.out.println("text : "+listEle.get(0).getText());
//	System.out.println("url : "+driver.getCurrentUrl());
//	break;
//}









		


