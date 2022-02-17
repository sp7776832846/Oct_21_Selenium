package org.dropDownEx;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.utilities.BaseUtility;

public class MultiSelectDDL_Ex {

	public static void main(String[] args) {
		WebDriver driver;
		String url = "https://demoqa.com/select-menu";
		BaseUtility bu = new BaseUtility();
		driver = bu.StartUp("ch", url);
		
		bu.handleDemoQALaunch();				// Called the Method directly from BaseUtility file.
		driver.findElement(By.cssSelector("#close-fixedban>img")).click();
		WebElement ddl = driver.findElement(By.id("oldSelectMenu"));				// Return type of findElement is WebElement, that why sw store it in WebElement.
		Select sel = new Select(ddl);
		
		List<WebElement> allOptions = sel.getOptions();						// Return Type of getOption is List of WebElement that it's why store it in that. 
		ArrayList<String> colorNames = new ArrayList<String>();
		
		for(int i=0; i<allOptions.size(); i++) {
			System.out.println(allOptions.get(i).getText()); 
			colorNames.add(allOptions.get(i).getText());
		}
		if(colorNames.contains("Purple")) {
			sel.selectByVisibleText("Purple");
			System.out.println("Purple color is present");
		}else {
			System.out.println("Purple color is not present");
			System.out.println("Default selected color : "
					+sel.getFirstSelectedOption().getTagName());
		}
	}
}


