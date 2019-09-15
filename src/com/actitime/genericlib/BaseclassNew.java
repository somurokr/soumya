package com.actitime.genericlib;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import com.actitime.objectrepository.CommonPage;
import com.actitime.objectrepository.Login;

public class BaseclassNew {

	public static WebDriver driver;
	FileUtils flib= new FileUtils();
	
	@BeforeClass
	public void configBC() throws Throwable
	{
		String browsername=flib.getpropertyobject("browser");
		System.out.println(browsername);
		if(browsername.equals("chrome"))
		{
			driver=new ChromeDriver();
		}
		else if(browsername.equals("firefox"))
		{
			driver= new FirefoxDriver();
		}
	}
	@BeforeMethod
	public void configBM() throws Throwable
	{
		String url=flib.getpropertyobject("url");
		System.out.println(url);
		driver.get(url);
		
		Login lp= PageFactory.initElements(driver, Login.class);
		lp.logintoApp();
	}
	@AfterMethod
	public void configAM()
	{
		CommonPage cp=PageFactory.initElements(driver,CommonPage.class);
				cp.LogoutofApp();
	}
	@AfterClass
	public void configAC()
	{
		System.out.println("close the browser");
		driver.close();
	}
	
}
