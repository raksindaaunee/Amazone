package com.tt.stepdef;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.tt.common.Common;
import com.tt.pageobjectmodel.Mousehvr;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Mousehover {
	WebDriver driver;
	Mousehvr mhv;
	@Given("^Amazon Homepage$")
	public void amazon_Homepage() throws Throwable {
	driver=Common.getBrowser("chrome",driver);
	driver.get(Common.getGetURL());
	mhv=PageFactory.initElements(driver,Mousehvr.class);
	   
	}

	@When("^I Mousehover on account and list$")
	public void i_Mousehover_on_account_and_list() throws Throwable {
	   
	   
	}

	@When("^click on find a gift$")
	public void click_on_find_a_gift() throws Throwable {
	 mhv.mshover();   
	   
	}

	@When("^I want the page titme of that page$")
	public void i_want_the_page_titme_of_that_page() throws Throwable {
	  
	}
	@When("^Take a screenshot$")
	public void take_a_screenshot() throws Throwable {
	mhv.ss(driver,"Gift");
	Thread.sleep(2000);
	driver.quit();
	}

	@Then("^it should take me to the Men's Shoes Page$")
	public void it_should_take_me_to_the_Men_s_Shoes_Page() throws Throwable {
	    
	   
	}


	
}
