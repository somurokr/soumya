package screenshot;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.actitime.genericlib.Baseclass;
@Listeners(com.actitime.genericlib.ListenerImp.class)
public class SampleTest  extends Baseclass {

	@Test(enabled=false)
	public void sampleTest() throws Throwable
	{
		
		WebDriver driver= new FirefoxDriver();
		driver.get("https://indiatoday.in");
		Take_Screenshot.getssTest(driver, "soumya");
		
	}
	@Test
	public void simpleTest()
	{
     driver.findElement(By.xpath("//div[text()='tasks']")).click();
	}
}
