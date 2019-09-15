package com.actitime.customertest;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.actitime.genericlib.Baseclass;
import com.actitime.genericlib.BaseclassNew;
import com.actitime.genericlib.FileUtils;
import com.actitime.objectrepository.Activeproj_Cust;
import com.actitime.objectrepository.Createnewcust;
import com.actitime.objectrepository.HomePage;
import com.actitime.objectrepository.OpenTask;

public class CreateCustomerTest extends BaseclassNew {

	
	FileUtils flib= new FileUtils();
	@Test
	public void createcustomerTest() throws Throwable
	{
	
		
		FileUtils flib= new FileUtils();
		
		//navigate to task page
		HomePage hp=PageFactory.initElements(driver, HomePage.class);
		hp.navtoopentaskpage();
		
		//click on proj&cust link
		OpenTask ot=PageFactory.initElements(driver,OpenTask.class);
		ot.navtoAct_proj_custpage();
		
		//click on createcustbtn
		Activeproj_Cust ac= PageFactory.initElements(driver,Activeproj_Cust.class);
		ac.navtocreatenewcustPage();
		
		//create new customerwith name only
		Createnewcust cnc=PageFactory.initElements(driver, Createnewcust.class);
		cnc.createcust_name(flib.getExcelData("sheet1", 1, 2));
		
		
    
	}
	@Test
	public void createcustwithdesc() throws Throwable
	{
		String expmsg="ok";
		FileUtils flib= new FileUtils();
		
		//navigate to task page
		HomePage hp=PageFactory.initElements(driver, HomePage.class);
		hp.navtoopentaskpage();
		
		//click on proj&cust link
		OpenTask ot=PageFactory.initElements(driver,OpenTask.class);
		ot.navtoAct_proj_custpage();
		
		//click on createcustbtn
		Activeproj_Cust ac= PageFactory.initElements(driver,Activeproj_Cust.class);
		ac.navtocreatenewcustPage();
		Createnewcust cnc=PageFactory.initElements(driver, Createnewcust.class);
		String name=flib.getExcelData("sheet1", 2, 2);
		String desc=flib.getExcelData("sheet1", 2, 3);
		cnc.createcust_with_desc(name, desc);
		
	}
	
	
}
