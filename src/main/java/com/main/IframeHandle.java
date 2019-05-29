package com.main;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class IframeHandle {

public static void main(String[] args) throws Throwable {
	
	System.setProperty("webdriver.chrome.driver","./Driver/chromedriver");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.guru99.com/handling-iframes-selenium.html#1");
	driver.manage().window().maximize();
	driver.switchTo().frame("google_ads_iframe_/24132379/guru99.com_300x600_sticky_0__container__");
	driver.findElement(By.xpath("//div[@id='privacy_5ca6478763987aa120739ae97e75054f_0']")).click();
	
		/*
		 * driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		 * driver.findElement(By.xpath("//span[contains(text(),'Log In')]")).click();
		 * driver.findElement(By.xpath("//input[@type='text']")).sendKeys(
		 * "talent_tech2019@yahoo.com");
		 * driver.findElement(By.xpath("//input[@type='password']")).sendKeys("Login007"
		 * ); driver.findElement(By.
		 * xpath("//div[@class='ui fluid large blue submit button']")).click();
		 * Thread.sleep(5000);
		 */  
	    // first select the frame
	   /* driver.switchTo().frame("intercom-borderless-frame");
	    // then mouse hover on corner
	    Actions action = new Actions(driver);
	    action.moveToElement(driver.findElement(By.xpath("//div[contains(@class,'intercom-chat-card-author')]"))).build().perform();
	    // Closes the fream
	    driver.findElement(By.xpath("//div[contains(@class,'intercom-borderless-dismiss-button')]//span")).click();
	    // then Login button work as well
	    driver.findElement(By.xpath(".//*[@id='loginForm']/div/div/input")).click();
	    Thread.sleep(5000);
	    driver.quit();
}	*/
	
}}
