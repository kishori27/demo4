package com.jbk.QA.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.jbk.QA.Base.TestBase;

public class OperatorPage extends TestBase{
	@FindBy(xpath="html/body/div[1]/div[1]/section[1]/h1")
	WebElement operator;
	@FindBy(xpath="html/body/div[1]/div[1]/section[2]/div/div/div/div[1]/h3")
	WebElement operatorlist;
	@FindBy(xpath="html/body/div[1]/div[1]/section[2]/div/div/div")
	WebElement table;
	
	//initializing the page object
	public OperatorPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	public void validateoperatorlisttitle()
	{
		driver.getTitle();
	}
	 
	
	

	public String opertaorpagetitle()
	{
		return driver.getTitle();
	}
}
