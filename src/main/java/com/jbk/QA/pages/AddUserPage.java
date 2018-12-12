package com.jbk.QA.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.jbk.QA.Base.TestBase;

public class AddUserPage extends TestBase{
	@FindBy(xpath=".//*[@id='username']")
	WebElement username;
	
	@FindBy(xpath=".//*[@id='mobile']")
	WebElement mobile;
	
	@FindBy(xpath=".//*[@id='email']")
	WebElement email;
	
	@FindBy(xpath=".//*[@id='Male']")
	WebElement male;
	
	@FindBy(xpath=".//*[@id='Female']")
	WebElement female;
	
	@FindBy(xpath="html/body/div[1]/div[1]/section[2]/div/div/div/form/div[1]/div[5]/div/select")
    WebElement selectstate;
	
	@FindBy(xpath=".//*[@id='password']")
	WebElement password;
	
	@FindBy(xpath=".//*[@id='submit']")
	WebElement submit;
	
	//initializing the page object
	public AddUserPage()
	{
		PageFactory.initElements(driver, this);
	}
	//for enter all parameter
	public void verifyadduser(String Username,String Password,String Mobile,String Email,String Gender,String State)
	{
		username.sendKeys(Username);
		mobile.sendKeys(Mobile);
		email.sendKeys(Email);
		if(Gender=="male"){
		male.click();
		}else{
			female.click();
		}
		Select select1=new Select(selectstate);
		select1.selectByVisibleText(State);
		password.sendKeys(Password);
		submit.click();
		}
	public String usernameTextBox()
	{
		return username.getAttribute("placeholder");
	}
    public String  mobileTextBox()
	{
		return mobile.getAttribute("placeholder");
	}
	public String emailTextBox()
	{
		return email.getAttribute("placeholder");
	}
	public String passwordTextBox()
	{
		return password.getAttribute("placeholder");
		
	}
	
	
	
	
	public String Adduser_title()
	{
		return driver.getTitle();
	}

}
