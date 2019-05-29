package com.tt.reuseable;


import java.io.File;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

public class ReUseable {
	WebDriver driver;
	public void scroldwn() {
		Actions action = new Actions(driver);
		action.sendKeys(Keys.PAGE_DOWN).build().perform();
	}
	public void scrolup() {
		Actions action = new Actions(driver);
		action.sendKeys(Keys.PAGE_UP).build().perform();
	}
public void SS (WebDriver driver, String Sign) throws Throwable {
		
		TakesScreenshot tkss = (TakesScreenshot)driver;
		File fl = tkss.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(fl,new File("/Users/rashelkhan/eclipse-workspace/Amazon/Screenshot/"+Sign+".jpg"));
	}
	
}
