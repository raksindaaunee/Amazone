package com.tt.stepdef;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import com.tt.common.Common;
import com.tt.pageobjectmodel.DropDown;
import com.tt.reuseable.ReUseable;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class DpDown {
	WebDriver driver;
	DropDown dpd;
	ReUseable ut;
	@Given("^Amazon home page$")
	public void amazon_home_page() throws Throwable {
	driver=Common.getBrowser("chrome",driver);
	driver.get(Common.getGetURL());	    
	}

	@When("^I clicl on dropdown button$")
	public void i_clicl_on_dropdown_button() throws Throwable {
	 dpd.getOptionButton().click();   
	    
	}

	@When("^select Baby$")
	public void select_Baby() throws Throwable {
	dpd.ddown();   
	    
	}

	@When("^click on search button$")
	public void click_on_search_button() throws Throwable {
	dpd.SrchButton().click();
	Thread.sleep(1000);
	dpd.scroldwn();
	Thread.sleep(1000);
	driver.navigate().back(); 
	Thread.sleep(1000);
	driver.navigate().forward();
	dpd.scrolup();    
	}

	@When("^Take Screenshot of Music page$")
	public void take_Screenshot_of_Music_page() throws Throwable {
	dpd.SS(driver,"Bby"); 
	Thread.sleep(3000);
	driver.quit();
	
	}

	@Then("^It should take me to the  page$")
	public void it_should_take_me_to_the_page() throws Throwable {
	    
	    
	}

}
