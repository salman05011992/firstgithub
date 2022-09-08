package com.qa.pageLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.testBase.TestBase;

public class ExchangePage extends TestBase{
	
	public ExchangePage()
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//a[contains(text(),'Buy')]")
	private WebElement buy_btn1;
	
	public void clickOnBuyButton1()
	{
		buy_btn1.click();
	}
	
	@FindBy(xpath="//input[@name='input-Qunatity']")
	private WebElement quantity_box;
	
	public void enterQuantityOfShare(int count)
	{
		quantity_box.click();
		quantity_box.sendKeys(String.valueOf(count));
	}
	
	@FindBy(xpath="//button[contains(text(),'Buy')]")
	private WebElement buy_btn2;
	
	public void clickOnBuyButton2()
	{
		buy_btn2.click();
	}
	
	@FindBy(xpath="//div[text()='Order Created successfully']")
	private WebElement order_status;
	
	public String getStatus()
	{
		String status=order_status.getText();
		return status;
	}
	
	@FindBy(xpath="//a[contains(text(),'Sell')]")
	private WebElement sell_btn1;
	
	public void clickOnSellButton1()
	{
		sell_btn1.click();
	}
	
	@FindBy(xpath="//button[contains(text(),'Sell')]")
	private WebElement sell_btn2;
	
	public void clickOnSellButton2()
	{
		sell_btn2.click();
	}
	
	

}
