package com.actitime.genericlib;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class ListenerImp implements ITestListener {
	@Override
	public void onTestFailure(ITestResult result) {
		
		String failedtestname=result.getMethod().getMethodName();
		     System.out.println(failedtestname);
		     EventFiringWebDriver edDriver= new EventFiringWebDriver(Baseclass.driver);
		     File src=edDriver.getScreenshotAs(OutputType.FILE);
		     File dstfile= new File("./screenshot/"+failedtestname+".png");
		     try {
				FileUtils.copyFile(src, dstfile);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		     
		
	}


	@Override
	public void onTestStart(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	
	@Override
	public void onTestSkipped(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onFinish(ITestContext context) {
		// TODO Auto-generated method stub
		
	}

}
