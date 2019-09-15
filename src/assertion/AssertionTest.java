package assertion;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.testng.Reporter;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.actitime.genericlib.Baseclass;



public class AssertionTest extends Baseclass {

	@Test(enabled=false)
	public void assertionTest()
	{
		Reporter.log("verify wheather image is displayed");
		String imgxpath="//div[@style='position: relative']/div[3]//img";
		 boolean status=driver.findElement(By.xpath(imgxpath)).isDisplayed();
		 assertTrue(status);
		 
	}
	@Test(enabled=false)
	public void verifypagetitleTest()
	{
		String exppagetitle="Enter Time-crack";
		String pagetitle=driver.getTitle();
		Reporter.log(pagetitle,true);
		assertEquals(exppagetitle, pagetitle);
		System.out.println("ok");		
	}
	@Test
	public void createcustomerTest()
	{
		SoftAssert s=new SoftAssert();
		s.assertEquals("hdfc", "sbi");
		
		driver.findElement(By.xpath("//div[text()='Tasks']/..")).click();
		s.assertAll();
		
	}
	
}
