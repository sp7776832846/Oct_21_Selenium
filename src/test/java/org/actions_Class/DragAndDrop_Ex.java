package org.actions_Class;        //[Date :- 27-01-22]

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.utilities.BaseUtility;

public class DragAndDrop_Ex {

	public static void main(String[] args) {
		WebDriver driver;
		String url = "https://demoqa.com/droppable";
		BaseUtility bu = new BaseUtility();
		driver = bu.StartUp("ch", url);
		driver.findElement(By.cssSelector("#close-fixedban>img")).click();
		WebElement src = driver.findElement(By.id("draggable"));
		WebElement des = driver.findElement(By.id("droppable"));
		Actions act = new Actions(driver);
		act.dragAndDrop(src, des).perform();
		
	}
}
