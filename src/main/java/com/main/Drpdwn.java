package com.main;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Drpdwn {
	WebDriver driver;
	public void select_music() throws Throwable {
		Select slt = new Select (driver.findElement(By.xpath("//select[@aria-label='Select a category for search']")));
		slt.selectByVisibleText("Music");
		WebElement we = slt.getFirstSelectedOption();
		System.out.println(we);
		System.out.println("=====================");
		List<WebElement> option = slt.getOptions();
		System.out.println(option.size());
		System.out.println("=====================");
		for(int i=0; i<option.size();i++) {
		System.out.println(option.get(i).getText());
		}

}
}