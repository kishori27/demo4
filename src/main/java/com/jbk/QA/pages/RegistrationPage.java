package com.jbk.QA.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.jbk.QA.Base.TestBase;

public class RegistrationPage extends TestBase {

@FindBy(xpath="html/body/div[1]/div[2]/p")
WebElement subtitle;
@FindBy(xpath=".//*[@id='name']")
WebElement name;
@FindBy(xpath=".//*[@id='mobile']")
WebElement mobile;
@FindBy(xpath=".//*[@id='email']")
WebElement email;
@FindBy(xpath=".//*[@id='password']")
WebElement password;
@FindBy(xpath=".//*[@id='form']/div[5]/div/button")
WebElement button;

public RegistrationPage()
{
	PageFactory.initElements(driver, this);
}

public void registerNewMember(String Name,String Mobile,String Email,String Password)
{
	name.sendKeys("Name");
	mobile.sendKeys("Mobile");
	email.sendKeys(".//*[@id='email']");
	password.sendKeys("Password");
	button.click();
}
public String nameTextBox()
{
	return name.getAttribute("placeholder");
}
public String mobileTextBox()
{
	return mobile.getAttribute("placeholder");
}
public String emaillTextBox()
{
	return email.getAttribute("placeholder");
}
public String passwordTextBox()
{
	return password.getAttribute("placeholder");
}
public String title()
{
return	driver.getTitle();
}



}
