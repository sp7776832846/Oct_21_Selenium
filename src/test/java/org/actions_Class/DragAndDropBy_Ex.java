package org.actions_Class;			//[Date :- 27-01-22]

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.utilities.BaseUtility;

public class DragAndDropBy_Ex {

	public static void main(String[] args) {
		WebDriver driver;
		String url = "https://demoqa.com/droppable";
		BaseUtility bu = new BaseUtility();
		driver = bu.StartUp("ch", url);
		driver.findElement(By.cssSelector("#close-fixedban>img")).click();
		WebElement src = driver.findElement(By.id("draggable"));
		WebElement des = driver.findElement(By.id("droppable"));
		Point d = des.getLocation();
		int x=d.getX();
		int y=d.getY();
		System.out.println("Des X = "+x+"\n Des Y = "+y);
		Actions act = new Actions(driver);
		act.dragAndDropBy(src, 210,55).perform();
		
	}

}
