package screenshot;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.testng.annotations.Test;

public class Take_Screenshot {

	@Test(enabled=false)
	public void screenshotTest() throws IOException
	{
		WebDriver driver= new FirefoxDriver();
		driver.get("https://google.com");
		
		EventFiringWebDriver edriver= new EventFiringWebDriver(driver);
		//take a file type screenshot
		File src=edriver.getScreenshotAs(OutputType.FILE);
		//get the current system date
		Date date= new Date();
       //create a new destination file to store screenshot
		String currentdate=date.toString().replace(" ", "_").replace(":", "_");
		File dstfile= new File("./screenshot/test_"+currentdate+".png");
		//copy the screenshot into new file
		org.apache.commons.io.FileUtils.copyFile(src, dstfile);	
	}
	@Test
	public static void getssTest(WebDriver driver, String screenshotname) throws IOException
	{
		EventFiringWebDriver edDriver= new EventFiringWebDriver(driver);
		       File src=edDriver.getScreenshotAs(OutputType.FILE);
		       File dstfile=new File("./screenshot/"+screenshotname+".png");
		       
		       org.apache.commons.io.FileUtils.copyFile(src, dstfile);
		     
		       
	}
}

