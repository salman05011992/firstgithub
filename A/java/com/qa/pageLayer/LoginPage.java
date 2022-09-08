package com.qa.pageLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.testBase.TestBase;

public class LoginPage extends TestBase {
	
	public LoginPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	//email Address
	@FindBy(xpath="//input[@name='email']")
	private WebElement email_address;
	
	public void enterEmailAddress(String email)
	{
		email_address.sendKeys(email);
	}
	
	//Password
	@FindBy(xpath="//input[@name='password']")
	private WebElement password;
	
	public void enterPassword(String pass)
	{
		password.sendKeys(pass);
	}
	
	//Loginbutton
	@FindBy(xpath="//button[@class='btn btn-dark btn-block']")
	private WebElement login_btn;
	
	public void clickOnLoginButton()
	{
		login_btn.click();;
	}
	

}
