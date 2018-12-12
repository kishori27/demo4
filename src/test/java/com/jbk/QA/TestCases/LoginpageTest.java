package com.jbk.QA.TestCases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.jbk.QA.Base.TestBase;
import com.jbk.QA.pages.DashBoardPage;
import com.jbk.QA.pages.LoginPage;

public class LoginpageTest extends TestBase{
	public static LoginPage loginpage;
	public static DashBoardPage dashboardpage;
	
	public LoginpageTest()
	{
		super();
	}
	
	
	@BeforeMethod
	public void SetUp()
	{
		initialization();
	 loginpage=new LoginPage();
	 dashboardpage=new DashBoardPage();
	}
	
	@Test(priority=1)
	public void LoginPageTitleTest()
	{
		String title=loginpage.validateloginpagetitle();
	Assert.assertEquals(title, "AdminLTE 2 | Log in");
	}

@Test(priority=2)
public void verifyLogin()
{
	
	loginpage.login(prop.getProperty("username"),prop.getProperty("password"));
	String Actual_title=dashboardpage. dashboardpagetitle();
	Assert.assertEquals(Actual_title, "AdminLTE 2 | Dashboard");
}
	
	
@Test(priority=3)
	public void wrongverifylogin()
	{
		loginpage.login("kira@gmail.com", "123456");
		String Actual_Id=loginpage.incorrectemaill();
		Assert.assertEquals(Actual_Id, "Please enter email as kiran@gmail.com");
	}
	
	
	
	
	
	
	
	
	
	
	@AfterMethod
	public void tearDown()
	{
		driver.quit();
	}

}
