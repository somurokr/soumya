 
package com.actime.reporttest;

import org.testng.annotations.Test;

import com.actitime.genericlib.Baseclass;

public class ReportTest  extends Baseclass{

	@Test 
	public void createreportTest()
	{
		System.out.println("execute create report Test");
	}
	@Test(priority=2)
	public void modifyreportTest()
	{
		System.out.println("execute modify report test");
	}
	@Test(priority=3)
	public void deletereportTest()
	{
		System.out.println("execute delete reportTest");
	}
	
}
