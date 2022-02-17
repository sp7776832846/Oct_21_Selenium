package org.basic_Method;

import org.openqa.selenium.WebDriver;
import org.utilities.BaseUtility;

public class Ex3 {
	public static void main(String[] args) {
		WebDriver driver;
		System.out.println("** Program Start **");
//		Base_Utility.bu.startUp(browserName,url)
		String url = "https://www.facebbok.com";
		BaseUtility bu = new BaseUtility();
		driver = bu.StartUp("mse", url);
//		driver.close();
//		driver.quit();
		System.out.println("Page Title : "+driver.getTitle());		// getTitle() return Page Title.
		System.out.println("Page URL : "+driver.getCurrentUrl());		// getcurrentUrl() return Page Url.
		bu.tearDown();			// It Is used to hide the code.
		System.out.println("** Program Ends **");
	}
}