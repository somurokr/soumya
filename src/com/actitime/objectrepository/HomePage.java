package com.actitime.objectrepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage {

	
	@FindBy(xpath="//div[text()='Tasks']/..")
	WebElement taskimg;
	
	@FindBy(xpath="//div[text()='Reports']/..")
	WebElement reportimg;
	
	@FindBy(xpath="//div[text()='Users']/..")
	WebElement userimgedt;

	public WebElement getTaskimg() {
		return taskimg;
	}

	public WebElement getReportimg() {
		return reportimg;
	}

	public WebElement getUserimgedt() {
		return userimgedt;
	}
	
	public void navtoopentaskpage()
	{
		taskimg.click();
	}
	
	
	
}
