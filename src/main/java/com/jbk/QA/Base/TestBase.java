package com.jbk.QA.Base;


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestBase {
public static WebDriver driver;
public static Properties prop;

public TestBase()
{
	try
	{
		prop=new Properties();
		FileInputStream fis=new FileInputStream("D:/javaproject/AdminLTE_POM/src/main/java/com/Admin/QA/config/config.properties");
		prop.load(fis);
	}
	catch(FileNotFoundException e)
	{
		e.printStackTrace();
	}catch(IOException e)
	{
		e.printStackTrace();
	}
	}
public static void initialization()
{
	String browsername=prop.getProperty("Browser");
	if(browsername.equals("crome"))
	{
		System.setProperty("webdriver.crome.driver", "F:\\chromedriver.exe");
		driver=new ChromeDriver();
	}
	else
		if(browsername.equals("Firefox"))
		{
			System.setProperty("webdriver.firefox.marionette", "F:\\geckodriver.exe");
			driver=new FirefoxDriver();
			
		}
	driver.get(prop.getProperty("url"));
}



}

