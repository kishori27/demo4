package com.jbk.QA.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.jbk.QA.Base.TestBase;

public class DashBoardPage extends TestBase {
@FindBy(xpath="html/body/div[1]/header/a/span[2]")
WebElement subtitle;

@FindBy(xpath="html/body/div[1]/aside[1]/section/ul/li[2]/a/span")
WebElement dashboard;

@FindBy(xpath="html/body/div[1]/aside[1]/section/ul/li[3]/a/span")
WebElement user;

@FindBy(xpath="html/body/div[1]/aside[1]/section/ul/li[4]/a")
WebElement operator;

@FindBy(xpath="html/body/div[1]/aside[1]/section/ul/li[5]/a")
WebElement logout;


//initializing the page object
public DashBoardPage()
{
	PageFactory.initElements(driver, this);
}

public  String dashboardpagetitle()
{
return driver.getTitle();
}

public void users_link()
{
user.click();
}

public void operator_link()
{
	operator.click();
}

public void logout_link()
{
	logout.click();
}




}
