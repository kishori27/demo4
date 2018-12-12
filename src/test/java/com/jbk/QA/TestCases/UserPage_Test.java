package com.jbk.QA.TestCases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.jbk.QA.Base.TestBase;
import com.jbk.QA.pages.AddUserPage;
import com.jbk.QA.pages.DashBoardPage;
import com.jbk.QA.pages.LoginPage;
import com.jbk.QA.pages.LogoutPage;
import com.jbk.QA.pages.OperatorPage;
import com.jbk.QA.pages.UserPage;

public class UserPage_Test extends TestBase {
	LoginPage loginpage;
	DashBoardPage dashboardpage;
	UserPage userpage;
	OperatorPage operatorpage;
	LogoutPage logoutpage;
	AddUserPage adduserpage;
	

	@BeforeMethod
	public void setUp()
	{
		initialization();
		loginpage=new LoginPage();
		 dashboardpage=new DashBoardPage();
		 userpage=new UserPage();
		 operatorpage=new OperatorPage();
		 logoutpage=new LogoutPage();
		 adduserpage=new AddUserPage();
		 loginpage.login(prop.getProperty("username"), prop.getProperty("password"));
		 dashboardpage.users_link();
	}
	@Test(priority=1)
	public void verifyuserpagesubtitle()
	{
		String actual_title=userpage.userpagetitle();
		Assert.assertEquals(actual_title, "AdminLTE 2 | User");
	}
	
	@Test(priority=2)
	public void valiadteAdduser()
	{
		userpage.validateadduser();
		String actual_title=adduserpage.Adduser_title();
		Assert.assertEquals(actual_title, "AdminLTE 2 | Add User");
	}
	@AfterMethod
	public void tearDown(){
		driver.quit();
	}
}
