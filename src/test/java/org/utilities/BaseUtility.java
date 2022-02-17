package org.utilities;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseUtility {		// Base Utility is a Heart of Framework, inside it have only Generic method without Main method.
	public static BaseUtility bu = new BaseUtility(); 
	WebDriver driver = null;

	public WebDriver StartUp(String browserName, String url){
		//WebDriver driver = null;
		String path = System.getProperty("user.dir");             
		System.out.println("project path = "+path);
		
		
		if(browserName.equalsIgnoreCase("ch") || browserName.equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().setup(); 
//			ChromeOptions options = new ChromeOptions();
//			options.addArguments("--disable-notifications");
//			options.addArguments("--headless");
//			options.addArguments("start-maximized");
//			options.addArguments("--disable-extensions");
//            options.addArguments("disable-gpu");
//            options.addArguments("--incognito");
//			driver = new ChromeDriver(options);	
			driver = new ChromeDriver();	
		} 
		else if(browserName.equalsIgnoreCase("ff") || browserName.equalsIgnoreCase("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		}
		else if(browserName.equalsIgnoreCase("mse") || browserName.equalsIgnoreCase("microsoftedge")) {
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
		} 
		else {
			System.out.println("Browser Name Not Found" );
		}
//		driver.manage().window().maximize();						// In this line  we maximize the page.
//		driver.manage().window().minimize();			// In this line  we minimize the page, this is possible after selenium 4.0 not before selenium 3.0 .

//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));		// selenium version 4 onwords.
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);		// upto selenium version 3.

		driver.get(url);
		return driver;
	}
	public void tearDown() {
		driver.quit();
	}
	public void handleDemoQALaunch() {
		try {
			driver.findElement(By.id("details-button")).click();
			driver.findElement(By.id("proceed-link")).click();	
		} catch (Exception e) {
			System.out.println("URL launched directly");
		}
	}
	// JavaScript (Start)
	public void scrollTillElement(WebElement ele, WebDriver driver) {
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView(true)", ele);
	}
	public void clickByJS(WebElement ele, WebDriver driver) {
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].click()", ele);
	}
	public void selectedByJS(WebElement ele, WebDriver driver) {
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("document.getElementById('ele').click();");
	}
	// JavaScript (End)
	
	// Date:- [26/01/22]
	public void waitForFrameLoad(WebDriver driver, WebElement frameEle) {
//		WebDriverWait wt = new WebDriverWait(driver, Duration.ofMillis(5));
		WebDriverWait wt = new WebDriverWait(driver,5);
		wt.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(frameEle));
	}
	public String getTextOfElement(WebElement ele) {
		return driver.getTitle();
	}
	public String getCurrentUrl(WebDriver driver) {
		return driver.getCurrentUrl();
	}
	public Set<String> getAllWindowIds () {
		return driver.getWindowHandles();
	}
	public String getParentWindowId(WebDriver driver) {
		return driver.getWindowHandle();
	}
/*	public String getElementTextFromWindow(String ele) {
		Set<String>allWinIds = driver.getWindowHandles();
		Iterator<String>itr = allWinIds.iterator();
		String str =null; 
		while (itr.hasNext()) {
			str = itr.next();
			if (!str.equals(parentId1)) {
				driver.switchTo().window(str);
				try {
					WebElement ele1 = driver.findElement(By.id(ele));
					return ele1.getText();
				} catch (Exception e) { }
			}
		}
		return "";
	}  */
}

