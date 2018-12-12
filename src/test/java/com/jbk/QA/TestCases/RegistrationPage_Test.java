package com.jbk.QA.TestCases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.jbk.QA.Base.TestBase;
import com.jbk.QA.pages.LoginPage;
import com.jbk.QA.pages.RegistrationPage;

public class RegistrationPage_Test extends TestBase{
	LoginPage loginpage;
	RegistrationPage registration;
	@BeforeMethod
	public void setUp()
	{
		initialization();
		loginpage=new LoginPage();
		registration=new RegistrationPage();
		loginpage.validatenewmember();
	}
		@Test(priority=1)
		public void verifyNewMemberTitle()
		{
		String Actual=registration.title();
		Assert.assertEquals(Actual, "AdminLTE 2 | Registration Page");
		}
		
	   @Test(priority=2)
	   public void verifyPlaceholder()
	   {
			String [] Actual_placeholder=new String[4];
			Actual_placeholder[0]=registration.nameTextBox();
			Actual_placeholder[1]=registration.mobileTextBox();
			Actual_placeholder[2]=registration.emaillTextBox();
			Actual_placeholder[3]=registration.passwordTextBox();
			
			String [] Expected_placeholder=new String[4];
			Expected_placeholder[0]="Name";
			Expected_placeholder[1]="Mobile";
			Expected_placeholder[2]="Email";
			Expected_placeholder[3]="Password";
	        
			for(int i=0;i<=3;i++){
			Assert.assertEquals(Actual_placeholder[i], Expected_placeholder[i]);
			}
	   }
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		@AfterMethod
		public void teardown()
		{
			driver.quit();
		}
	
}
