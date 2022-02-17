package org.browser_Operations;

import org.openqa.selenium.WebDriver;
import org.utilities.BaseUtility;

public class Ex1 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver;
		String url = "https://demoqa.com/select-menu";
		BaseUtility bu = new BaseUtility();
		driver = bu.StartUp("ff", url);
		
		driver.navigate().to("https://www.facebook.com");
		Thread.sleep(2000);
		driver.navigate().back();
		Thread.sleep(2000);
		driver.navigate().forward();
		Thread.sleep(2000);
		driver.navigate().refresh();
		driver.quit();
	}

}
