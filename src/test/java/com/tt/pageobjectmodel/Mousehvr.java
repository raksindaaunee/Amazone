package com.tt.pageobjectmodel;


import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;

public class Mousehvr {
WebDriver driver;

public Mousehvr (WebDriver driver) {
this.driver=driver;
PageFactory.initElements(driver,this);
}

	/*
	 * @FindBy(xpath="(//li[@class='hl-cat-nav__js-tab'])[2]") private WebElement
	 * Fashion; public WebElement getFashion() { return Fashion;}
	 */

public void mshover() throws InterruptedException{
	 Actions ac = new Actions (driver);
	  WebElement we = driver.findElement(By.xpath("(//a[@class='nav-a nav-a-2'])[1]"));
	  ac.moveToElement(we).moveToElement(driver.findElement(By.xpath("(//a[@class='nav-link nav-item'])[3]"))).click().build().perform();
	  	}
	/*
	 * public void moushvr() throws Throwable { Actions ac = new Actions (driver);
	 * WebElement we =
	 * driver.findElement(By.xpath("(//li[@class='hl-cat-nav__js-tab'])[2]"));(//li[@class='hl-cat-nav__js-tab'])[2]
	 * Thread.sleep(500);
	 * ac.moveToElement(we).moveToElement(driver.findElement(By.xpath(
	 * "(//a[@class='hl-cat-nav__js-link'])[18]"))).click().build().perform();
	 * 
	 * }
	 */
public void ss (WebDriver driver, String Gift) throws Throwable {
	TakesScreenshot tkss = (TakesScreenshot)driver;
	File fl = tkss.getScreenshotAs(OutputType.FILE);
	FileUtils.copyFile(fl,new File("/Users/rashelkhan/eclipse-workspace/Amazon/Screenshot/"+Gift+".jpg"));
	   
}

}

