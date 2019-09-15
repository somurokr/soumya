package browser_control;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Windowmethords {

	public static void main(String[] args) throws Throwable {
		
		System.setProperty("webdriver.gecko.driver","C:\\E_selenium\\geckodriver.exe" );
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.amazon.com");
		
		String sessionid=driver.getWindowHandle();
		System.out.println(sessionid);
		Thread.sleep(2000);
		//change the browser window size
	       Dimension dem= new Dimension(100, 400);
	       driver.manage().window().setSize(dem);
	       Thread.sleep(500);
	       //maximize the browser
	       driver.manage().window().maximize();
	       //close only active window
	       driver.close();
	       //close all the window active by webdriver
	     //  driver.quit();
	       
		
		
		
	}
}
