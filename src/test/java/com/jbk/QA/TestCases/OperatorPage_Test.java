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

public class OperatorPage_Test extends TestBase {
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
		 loginpage.login(prop.getProperty("username"), prop.getProperty("password"));
		 dashboardpage.operator_link();
	}
	
	@Test(priority=1)
	public void verifyoperatorlisttitle()
	{
		
		String Actual=operatorpage.opertaorpagetitle();
		Assert.assertEquals(Actual, "AdminLTE 2 | Operators");
	}
	@Test(priority=2)
	public void verifyTextBox()
	{
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	@AfterMethod
	public void teardown()
	{
		driver.quit();
	}
	
	
	
	
	
	

}
