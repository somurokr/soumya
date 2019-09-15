package complex_xpath;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AlertTest {

    public static void main(String[] args) {
		
    	WebDriver driver= new ChromeDriver();
    	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
    	driver.get("https://www.services.irctc.co.in/homebody.html");
    	
    	driver.findElement(By.id("button")).click();
    	Alert alt=driver.switchTo().alert();
    	System.out.println(alt.getText());
    	
    	alt.accept();
    	
    	
    	
    	
    	
    	
	}
	
}
