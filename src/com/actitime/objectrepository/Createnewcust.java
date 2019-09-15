package com.actitime.objectrepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Createnewcust {

	@FindBy(xpath="//tr/td[3]/input[@type='text']")
	WebElement custnameedtbox; 
	
	@FindBy(xpath="//textarea[@name='description']")
	WebElement custdesc_edtbox;
	
	@FindBy(xpath="//input[@name='createCustomerSubmit']")
	WebElement createcustbtn;
	
	@FindBy(xpath="//span[@class='successmsg']")
	WebElement succmsg;
	

	public WebElement getSuccmsg() {
		return succmsg;
	}

	public WebElement getCustnameedtbox() {
		return custnameedtbox;
	}

	public WebElement getCustdesc_edtbox() {
		return custdesc_edtbox;
	}

	public WebElement getCreatecustbtn() {
		return createcustbtn;
	}
	
	public void createcust_name(String name) throws InterruptedException
	{
		Thread.sleep(2000);
		custnameedtbox.sendKeys(name);
		createcustbtn.click();
	}
	public void createcust_with_desc(String name ,String desc) throws InterruptedException
	
	{
		Thread.sleep(2000);
		custnameedtbox.sendKeys(name);
		custdesc_edtbox.sendKeys(desc);
		createcustbtn.click();
	}
	
}
