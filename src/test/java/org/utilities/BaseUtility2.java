package org.utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.opera.OperaDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseUtility2 {		// Base Utility is a Heart of Framework, inside it have only Generic method without Main method.

	WebDriver driver = null;

	public WebDriver StartUp(String browserName, String url){
		switch (browserName.toLowerCase()) {
		case "chrome": //For chrome Driver
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			break;
		case "firefox": //For firefox Mozilla Driver
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
			break;
		case "edge": //For edge Driver
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
			break;
		case "ie": //For Internet Explorer Driver
			WebDriverManager.iedriver().setup();
			driver = new InternetExplorerDriver();
			break;
		case "opera": //For Opera Driver
			WebDriverManager.operadriver().setup();
			driver = new OperaDriver();
		default:
			System.out.println("Browser Name Not Found" );
			break;
		}
		return driver;
	}

}