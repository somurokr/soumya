package com.actitime.objectrepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class OpenTask {

	@FindBy(xpath="//a[text()='Projects & Customers']")
	WebElement project_custlnk;

	public WebElement getProject_custlnk() {
		return project_custlnk;
	}
	
	public void navtoAct_proj_custpage()
	{
		project_custlnk.click();
	}
	
	
	
}
