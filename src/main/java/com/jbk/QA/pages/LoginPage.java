package com.jbk.QA.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.jbk.QA.Base.TestBase;

public class LoginPage extends TestBase {
	
	//pagefactory
	@FindBy(xpath=".//*[@id='email']")
	WebElement username;
	
	@FindBy(xpath=".//*[@id='password']")
	WebElement password;
	
	@FindBy(xpath=".//*[@id='form']/div[3]/div/button")
	WebElement button;
	
	@FindBy(xpath=".//*[@id='email_error']")
	WebElement emailerror;
	
	@FindBy(xpath=".//*[@id='password_error']")
	WebElement passworderror;
	
	@FindBy(xpath="html/body/div[1]/div[2]/a")
	WebElement registernewmember;
	
	//initializing the page object
	public LoginPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	//Action
	public String validateloginpagetitle()
	{
		return driver.getTitle();
	}
	public String enterusername()
	{
		return username.getAttribute("placeholder");
	}
	
	public String enterpassword()
	{
		return password.getAttribute("placeholder");

	}
	public DashBoardPage login(String Username,String Password)
	{
		username.sendKeys(Username);
		password.sendKeys(Password);
		button.click();
		return new DashBoardPage();
	}
	
	public String incorrectemaill()
	{
	return emailerror.getText();
	}
	public String incorectpasswrd()
	{
		return passworderror.getText();
	}
    public void validatenewmember()
    {
    	registernewmember.click();
    }
	
  }
	





