package com.main;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class Main {
	WebDriver driver;
	  public static void main(String[] args) throws Throwable { WebDriver driver;
	  System.setProperty("webdriver.chrome.driver","./Driver/chromedriver");
	  driver=new ChromeDriver(); driver.get("https://www.yahoo.com");
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	  driver.findElement(By.xpath("//a[@id='uh-mail-link']")).click();
	  driver.findElement(By.xpath("//input[@id='login-username']")).sendKeys("talent_tech2019");
	  Thread.sleep(1000);
	  driver.findElement(By.xpath("//input[@id='login-username']")).sendKeys(Keys.ENTER);
	  Thread.sleep(1000);
	  driver.findElement(By.xpath("//input[@id='login-passwd']")).sendKeys("Yahoo007");
	  Thread.sleep(1000);
	  driver.findElement(By.xpath("//input[@id='login-passwd']")).sendKeys(Keys.ENTER); 	
	  Thread.sleep(1000);
	  driver.navigate().refresh();
	  Thread.sleep(1000);
	  driver.findElement(By.xpath("//span[@class='_yb_dbe04 _yb_d3t5p _yb_yqa58 _yb_p8m0k _yb_1n3ae']")).click();
	  Thread.sleep(1000);
	  driver.findElement(By.xpath("//span[@class='_yb_1n3ae _yb_18jb5 _yb_yqa58']")).click();
	  } 
}
