package com.tt.stepdef;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.tt.common.Common;
import com.tt.pageobjectmodel.Signin;
import com.tt.reuseable.ReUseable;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class SignIn {
	WebDriver driver;
	Signin si;
	ReUseable u;
	
	@Given("^Launch Browser$")
	public void launch_Browser() throws Throwable {
	driver=Common.getBrowser("chrome",driver);
	   
	}

	@When("^Go to home page$")
	public void go_to_home_page() throws Throwable {
	 driver.get(Common.getGetURL());   
	 si=PageFactory.initElements(driver,Signin.class);
	   
	}

	@When("^Click on signin button$")
	public void click_on_signin_button() throws Throwable {
	si.getSigninButton().click();    
	   
	}

	@When("^put Username as \"([^\"]*)\" and password as \"([^\"]*)\"$")
	public void put_Username_as_and_password_as(String Username, String password) throws Throwable {
	si.Username().sendKeys(Username); 
	si.Password().sendKeys(password);
	
	}

	@When("^Click on Submit button$")
	public void click_on_Submit_button() throws Throwable {	
	si.Submit().click();
	Thread.sleep(2000);
	driver.quit();
	   
	}

	@Then("^login should successfull$")
	public void login_should_successfull() throws Throwable {
	    
	   
	}






}
