package com.actitime.objectrepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Activeproj_Cust {

	@FindBy(xpath="//input[@value='Create New Customer']")
	WebElement createnewcustbtn;
	
	@FindBy(xpath="//input[@value='Create New Customer']")
	WebElement createnewprojbtn;

	public WebElement getCreatenewcustbtn() {
		return createnewcustbtn;
	}

	public WebElement getCreatenewprojbtn() {
		return createnewprojbtn;
	}
	
	public void navtocreatenewcustPage()
	{
		createnewcustbtn.click();
	}
	
}
