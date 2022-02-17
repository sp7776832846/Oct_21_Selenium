package org.dropDownEx;		// Date:- [21-01-22]

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.utilities.BaseUtility;

public class MultiSelectDDL_Ex2 {

	public static void main(String[] args) {
		WebDriver driver;
		String url = "https://demoqa.com/select-menu";
		BaseUtility bu = new BaseUtility();
		driver = bu.StartUp("ch", url);

		bu.handleDemoQALaunch();				// Called the Method directly from BaseUtility file.
		driver.findElement(By.cssSelector("#close-fixedban>img")).click();
		WebElement ddl = driver.findElement(By.id("cars"));				// Return type of findElement is WebElement, that why sw store it in WebElement.
		Select sel = new Select(ddl);
		//we can select one by one
		sel.selectByVisibleText("Volvo");
		sel.selectByVisibleText("Audi");

		List<WebElement> selectedOptions = sel.getAllSelectedOptions();	  // get All Selected Options Used to verify whether all options selected or not. 
		System.out.println("Selected option :");
		for(int i=0; i<selectedOptions.size(); i++) {
			System.out.println(selectedOptions.get(i).getText()); 
		}
	}
}


