package com.jbk.QA.TestCases;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.jbk.QA.Base.TestBase;
import com.jbk.QA.pages.DashBoardPage;
import com.jbk.QA.pages.LoginPage;
import com.jbk.QA.pages.LogoutPage;
import com.jbk.QA.pages.OperatorPage;
import com.jbk.QA.pages.UserPage;

public class DashboardPage_Test extends TestBase {
	LoginPage loginpage;
	DashBoardPage dashboardpage;
	UserPage userpage;
	OperatorPage operatorpage;
	LogoutPage logoutpage;
@BeforeMethod
public void setUp()
{
	initialization();
	loginpage=new LoginPage();
	 dashboardpage=new DashBoardPage();
	 userpage=new UserPage();
	 operatorpage=new OperatorPage();
	 logoutpage=new LogoutPage();
	loginpage.login(prop.getProperty("username"), prop.getProperty("password"));

}
@Test(priority=1)
public void verifyDashboardTitle()
{
	String Actual_title=dashboardpage.dashboardpagetitle();
	Assert.assertEquals(Actual_title, "AdminLTE 2 | Dashboard");
}

@Test(priority=2)
public void validateUserLink()
{
	dashboardpage.users_link();
	String UserPage_Title=userpage.userpagetitle();
	Assert.assertEquals(UserPage_Title, "AdminLTE 2 | User");
}

@Test(priority=3)
public void ValidateOperatorLink()
{
	dashboardpage.operator_link();
	String operatorpage_title=operatorpage.opertaorpagetitle();
	Assert.assertEquals(operatorpage_title, "AdminLTE 2 | Operators");
}

@Test(priority=4)
public void ValidateLogout_link()
{
	dashboardpage.logout_link();
	String logoutpage_title=logoutpage.logoutpagetitle();
	Assert.assertEquals(logoutpage_title, "AdminLTE 2 | Log in");
}

}
