package datadriventest;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ReadDataTest {
  
	public static void main(String[] args) throws Throwable {
		
	    //step1 :get the java representation object of physical file
		FileInputStream fis= new FileInputStream("./commondata.properties.txt");
		//step2:create an object properties class to load all the keys and value
		
		Properties pobj= new Properties();
		pobj.load(fis);
		
		String url=pobj.getProperty("url");
		String user=pobj.getProperty("username");
		String password=pobj.getProperty("password");
		String browser=pobj.getProperty("browser");
		System.out.println(url+" "+user+" "+password+" "+browser);
		
		WebDriver driver= null;
		if(browser.equals("chrome"))
		{
			driver= new ChromeDriver();
		}
		else if(browser.equals("firefox"))
		{
			driver= new FirefoxDriver();
		}
		driver.get(url);
		driver.findElement(By.name("username")).sendKeys(user);
		driver.findElement(By.name("pwd")).sendKeys(password);
		driver.findElement(By.id("loginButton")).click();
		
		
	}
}
