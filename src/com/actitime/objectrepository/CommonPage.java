package com.actitime.objectrepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CommonPage {

	@FindBy(xpath="//a[text()='Logout']")
	WebElement logoutlnk;
	
	public void LogoutofApp()
	{
		logoutlnk.click();
	}
	
}
