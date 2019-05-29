package com.main;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Amazon {
	  public static void main(String[] args) throws Throwable {
	WebDriver driver;
	  System.setProperty("webdriver.chrome.driver","./Driver/chromedriver.exe");
	  driver=new ChromeDriver(); driver.get("https://www.amazon.com");
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	  Select slt = new Select (driver.findElement(By.xpath("//select[@class='nav-search-dropdown searchSelect']")));
		slt.selectByVisibleText("Baby");
		WebElement we = slt.getFirstSelectedOption();
		System.out.println(we);
		System.out.println("=====================");
		List<WebElement> option = slt.getOptions();
		System.out.println(option.size());
		System.out.println("=====================");
		for(int i=0; i<option.size();i++) {
			
		System.out.println(option.get(i).getText());
		//System.out.println("======================");
		//Select sl = new Select (driver.findElement(By.xpath("//select[@class='nav-search-dropdown searchSelect']")));
	   // sl.selectByVisibleText("Baby");
	    //List<WebElement> gtlst = sl.getOptions();
	 
		if(option.get(i).getText().equals(slt.getFirstSelectedOption().getText())){
			
            System.out.println("The index of the selected option is: "+ i);
            System.out.println("=====================");
           // break;
            }
                    
            }
            
            
}
	  }