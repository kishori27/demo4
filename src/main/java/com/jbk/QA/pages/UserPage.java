package com.jbk.QA.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.jbk.QA.Base.TestBase;

public class UserPage extends TestBase{
	
	@FindBy(xpath="html/body/div[1]/div[1]/section[1]/h1")
	WebElement users;
	
	@FindBy(xpath="html/body/div[1]/div[1]/section[2]/div/div/div/div[1]/h3")
	WebElement userlist;
	
	@FindBy(xpath="html/body/div[1]/div[1]/section[2]/div/div/div/div[1]/a/button")
	WebElement adduser;
	
	//initializing the page object
	public UserPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	public String validateuserpagesubtitle()
	{
		return driver.getTitle();
	}
	
	public String validateuserlist()
	{
		return driver.getTitle();
		
	}
	
	public void validateadduser()
	{
		adduser.click();
	}
	
	
	
	
	
	public String userpagetitle()
	{
		return driver.getTitle();
		
	}

}
