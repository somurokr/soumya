package com.actitime.objectrepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.actitime.genericlib.FileUtils;

public class Login {

	FileUtils flib= new FileUtils();

	
	@FindBy(name="username")
	 private WebElement usernameedt;
	
	@FindBy(name="pwd")
	private WebElement passwordedt;
	
	@FindBy(id="loginButton")
	private WebElement loginbtn;
	
	
	public WebElement getUsernameedt() {
		return usernameedt;
	}


	public WebElement getPasswordedt() {
		return passwordedt;
	}


	public WebElement getLoginbtn() {
		return loginbtn;
	}


	public void  logintoApp() throws Throwable
	{
		usernameedt.sendKeys(flib.getpropertyobject("username"));
		passwordedt.sendKeys(flib.getpropertyobject("password"));
		loginbtn.click();
	}
	
}
