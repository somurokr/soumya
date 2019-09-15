package com.actitime.genericlib;

import java.util.concurrent.TimeUnit;

import org.junit.AfterClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

import com.beust.jcommander.Parameter;

public class Baseclass {
	
    public static WebDriver driver;
	FileUtils flib= new FileUtils();
	
	/*
	@Parameters("browser")
	@BeforeTest
	public void configBT(String browsername)
	{
		if(browsername.equals("firefox"))
			driver= new FirefoxDriver();
		else if(browsername.equals("chrome"))
			driver= new ChromeDriver();
	}
	*/
	
	@BeforeClass
	public void configBC() throws Throwable
	{
		String browser=flib.getpropertyobject("browser");
		if(browser.equals("chrome"))
		{
			driver= new ChromeDriver();
		}
		else if(browser.equals("firefox"))
		{
			driver= new FirefoxDriver();
		}
		
	}
	
	@BeforeMethod
	public void configBM1() throws Throwable
	{
		Reporter.log("======login to app======");
		
		String url=flib.getpropertyobject("url");
		String user=flib.getpropertyobject("username");
		String password=flib.getpropertyobject("password");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get(url);
		driver.findElement(By.name("username")).sendKeys(user);
		driver.findElement(By.name("pwd")).sendKeys(password);
		driver.findElement(By.id("loginButton")).click();
		Thread.sleep(500);
		
	}
	
	@AfterMethod
	public void configAM() throws Throwable
	{
		Reporter.log("logout of the application");
		driver.findElement(By.linkText("Logout")).click();
		
	}
	
	@AfterClass
	public void configAC()
	{
		Reporter.log("=====close the window=====");
		driver.close();
    }
	
}
