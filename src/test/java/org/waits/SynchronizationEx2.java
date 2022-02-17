package org.waits;      // Date:- [20-01-22]

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SynchronizationEx2 {				// Make Generic Methods Here.

	public void waitForVisibilityofElementLocated(WebDriver driver, int time, String type, String locator) {		// Generic Method of Visibility of Element Located
//		WebDriverWait wt = new WebDriverWait(driver, Duration.ofSeconds(time));												//      for all Locator.
		WebDriverWait wt = new WebDriverWait(driver,time);
		switch (type) {
		case "xpath":wt.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath(locator)));
		break;
		case "css":wt.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.cssSelector(locator)));
		break;
		case "id":wt.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.id(locator)));
		break;
		case "class":wt.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.className(locator)));
		break;
		}
	}
	public void waitForinvisibilityofElementLocated(WebDriver driver, int time, String type, String locator) {			// Generic Method of InVisibility of Element Located
//		WebDriverWait wt = new WebDriverWait(driver, Duration.ofSeconds(time));											//  for all Locator.
		WebDriverWait wt = new WebDriverWait(driver,time);
		switch (type) {																									
		case "xpath":wt.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath(locator)));
		break;
		case "css":wt.until(ExpectedConditions.invisibilityOfElementLocated(By.cssSelector(locator)));
		break;
		case "id":wt.until(ExpectedConditions.invisibilityOfElementLocated(By.id(locator)));
		break;
		case "class":wt.until(ExpectedConditions.invisibilityOfElementLocated(By.className(locator)));
		break;
		}
	}
	public void waitForelementToBeClickable(WebDriver driver, int time, String type, String locator) {			// Generic Method of element To Be Clickable
//		WebDriverWait wt = new WebDriverWait(driver, Duration.ofSeconds(time));											//  for all Locator.
		WebDriverWait wt = new WebDriverWait(driver,time);
		switch (type) {																									
		case "xpath":wt.until(ExpectedConditions.elementToBeClickable(By.xpath(locator)));
		break;
		case "css":wt.until(ExpectedConditions.elementToBeClickable(By.cssSelector(locator)));
		break;
		case "id":wt.until(ExpectedConditions.elementToBeClickable(By.id(locator)));
		break;
		case "class":wt.until(ExpectedConditions.elementToBeClickable(By.className(locator)));
		break;
		}
	}
	public void waitForelementToBeSelected(WebDriver driver, int time, String type, String locator) {			// Generic Method of element To Be Selected
//		WebDriverWait wt = new WebDriverWait(driver, Duration.ofSeconds(time));											//  for all Locator.
		WebDriverWait wt = new WebDriverWait(driver,time);
		switch (type) {																							// It can be used for check box, until it does not selected.		
		case "xpath":wt.until(ExpectedConditions.elementToBeSelected(By.xpath(locator)));
		break;
		case "css":wt.until(ExpectedConditions.elementToBeSelected(By.cssSelector(locator)));
		break;
		case "id":wt.until(ExpectedConditions.elementToBeSelected(By.id(locator)));
		break;
		case "class":wt.until(ExpectedConditions.elementToBeSelected(By.className(locator)));
		break;
		}
	}
	public void waitForpresenceOfElementLocated(WebDriver driver, int time, String type, String locator) {			// Generic Method of presence Of Element Located
//		WebDriverWait wt = new WebDriverWait(driver, Duration.ofSeconds(time));											//  for all Locator.
		WebDriverWait wt = new WebDriverWait(driver,time);
		switch (type) {																							// It is used when the element is located(presence) in DOM		
		case "xpath":wt.until(ExpectedConditions.presenceOfElementLocated(By.xpath(locator)));					// It get run when it find out Webelement in DOM.
		break;
		case "css":wt.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector(locator)));
		break;
		case "id":wt.until(ExpectedConditions.presenceOfElementLocated(By.id(locator)));
		break;
		case "class":wt.until(ExpectedConditions.presenceOfElementLocated(By.className(locator)));
		break;
		}
	}
	
//		public void waitForVisibilityofElementLocated1(WebDriver driver, int time, String locator) {		// For only x-path Locator.
//			WebDriverWait wt = new WebDriverWait(driver, Duration.ofSeconds(time));		
//			wt.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath(locator)));
//		}
//		public void waitForVisibilityofElementLocated2(WebDriver driver, int time, String locator) {			// For only CSS Locator.
//			WebDriverWait wt = new WebDriverWait(driver, Duration.ofSeconds(time));		
//			wt.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath(locator)));
//		}
	public void waitForVisibilityofElement(WebDriver driver, int time, WebElement ele) {			// This Generic Method is applicable to clickable button only[like Logout].
//		WebDriverWait wt = new WebDriverWait(driver, Duration.ofSeconds(time));					//Not possible for another WebElement [Day-56 Time:- 1.57.44]
		WebDriverWait wt = new WebDriverWait(driver,time);
		wt.until(ExpectedConditions.visibilityOf(driver.findElement(By.id("logoutLink"))));		// Pass WebElemennt
	}
}