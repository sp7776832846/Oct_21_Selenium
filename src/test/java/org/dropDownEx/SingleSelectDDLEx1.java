package org.dropDownEx;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.utilities.BaseUtility;

public class SingleSelectDDLEx1 {

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
		WebElement ddl = driver.findElement(By.id("oldSelectMenu"));
		Select sel = new Select(ddl);
		sel.selectByVisibleText("Black");				// This Method is Generally[popular] used for finding WebElement.
//		sel.selectByValue("4");							// It is only used when there is a attriute value present in the option tag.
//		sel.selectByIndex(10);							// This Method will used only in multi Item selection[select Tag].
		
	}

}
