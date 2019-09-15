package com.actitime.projectTest;

import org.testng.annotations.Test;

import com.actitime.genericlib.Baseclass;

public class ProjectTest extends Baseclass {

	@Test
	public void createprojectTest()
	{
		System.out.println(" execute create project Test");
	}
	@Test(priority=2)
	public void modifyprojectTest()
	{
		System.out.println(" execute modify project test ");
	}
	@Test(priority=3)
	public void deleteprojectTest()
	{
		System.out.println("execute delete project test");
	}
}
