package com.qa.pageLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.testBase.TestBase;

public class DashboardPage extends TestBase{
	
	public DashboardPage()
	{
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath="//input[@class='form-control']")
	private WebElement search_box;
	
	public void enterCompanyName(String company_name)
	{
		search_box.sendKeys(company_name);
	}
	
	@FindBy(linkText="WIPRO")
	private WebElement click_company_name_wipro;
	
	public void clickOnCompanyNameWipro()
	{
		click_company_name_wipro.click();
	}
	
	@FindBy(partialLinkText="AXIS")
	private WebElement click_company_name_axis;
	
	public void clickOnCompanyNameAxis()
	{
		click_company_name_axis.click();
	}
}
