package org.dropDownEx;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.utilities.BaseUtility;

public class SingleSelectDDLEx2 {

	public static void main(String[] args) {
		WebDriver driver;
		String url = "https://demoqa.com/select-menu";
		BaseUtility bu = new BaseUtility();
		driver = bu.StartUp("ch", url);
		try {
			driver.findElement(By.id("details-button")).click();
			driver.findElement(By.id("proceed-link")).click();	
		} catch (Exception e) {
			System.out.println("URL launched directly");
		}
		driver.findElement(By.cssSelector("#close-fixedban>img")).click();
		
		WebElement ddl = driver.findElement(By.id("oldselectmenu"));				// Return type of findElement is WebElement, that why sw store it in WebElement.
		Select sel = new Select(ddl);
		WebElement ele = sel.getFirstSelectedOption();
//		String defaultselected = ele.getText();							// Retun tpe of getType method is String, we can store it in String, 
		System.out.println("default selected : "+ele.getText());		// But, We try to store it in System.out.println() directly. [1.42.33]
		
		sel.selectByIndex(10); //aqua
		String actualColour = sel.getFirstSelectedOption().getText();
		System.out.println("selected colour : "+actualColour);
		
		if (actualColour.equals("Aqua")) {
			System.out.println("selected color Aqua.");
		}
	}

}
