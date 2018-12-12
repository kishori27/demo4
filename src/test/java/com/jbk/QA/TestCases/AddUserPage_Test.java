package com.jbk.QA.TestCases;

import java.util.HashMap;

import org.openqa.selenium.Alert;
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

public class AddUserPage_Test extends TestBase {
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
		 userpage.validateadduser();
	}
	@Test(priority=1)
	public void verifyAddUserTitle()
	{
		
		String Actual_title=adduserpage.Adduser_title();
		Assert.assertEquals(Actual_title, "AdminLTE 2 | Add User");
	}
	
	@Test(priority=2)
	public void verifyPlaceholders()
	{
		
		
		String [] Actual_placeholder=new String[4];
		Actual_placeholder[0]=adduserpage.usernameTextBox();
		Actual_placeholder[1]=adduserpage.emailTextBox();
		Actual_placeholder[2]=adduserpage.mobileTextBox();
		Actual_placeholder[3]=adduserpage.passwordTextBox();
		
		String [] Expected_placeholder=new String[4];
		Expected_placeholder[0]="Username";
		Expected_placeholder[1]="Email";
		Expected_placeholder[2]="Mobile";
		Expected_placeholder[3]="Password";
        
		for(int i=0;i<=3;i++){
		Assert.assertEquals(Actual_placeholder[i], Expected_placeholder[i]);
		}
	}
		@Test(priority=3)
		 public void verifyalladduser()
		 {
			 adduserpage.verifyadduser("kishori", "1234", "8623048661", "kishorijarile@gmail.com", "female", "Maharashtra");
			 Alert al=driver.switchTo().alert();
	         String	Actual_msg=	 al.getText();
			 Assert.assertEquals(Actual_msg, "User Added Successfully. You can not see added user.");
		 }
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
		
	
	@AfterMethod
	public void teardown()
	{
		driver.quit();
	}
	
}
