package com.actitime.usertest;

import org.testng.annotations.Test;

import com.actitime.genericlib.Baseclass;

public class UserTest extends Baseclass {

	@Test
	public void createuserTest()
	{
		System.out.println("execute create usertest");
	}
	@Test(priority=2)
	public void modifyuserTest()
	{
		System.out.println("execute modifyuserTest");
	}
	@Test(priority=3)
	public void deleteuserTest()
	{
		System.out.println("execute delete usertest");
	}
}
