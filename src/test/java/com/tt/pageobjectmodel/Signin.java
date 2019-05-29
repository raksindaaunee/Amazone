package com.tt.pageobjectmodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Signin {
WebDriver driver;

public Signin(WebDriver driver) {
this.driver=driver;
PageFactory.initElements(driver,this);
}


@FindBy(xpath="(//a[@class='nav-a nav-a-2'])[1]")
private WebElement SigninButton;
public WebElement getSigninButton() {
	return SigninButton;}

@FindBy(xpath="//input[@id='ap_email']")
private WebElement Username;
public WebElement Username() {
	return Username;}

@FindBy(xpath="//input[@id='ap_password']")
private WebElement Password;
public WebElement Password() {
	return Password;}

@FindBy(xpath="//input[@id='signInSubmit']")
private WebElement Submit;
public WebElement Submit() {
	return Submit;}


}
