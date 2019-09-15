package calenderpopup;

import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Filedldtest1 {

	public static void main(String[] args) throws Throwable {
		
		WebDriver driver= new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.oracle.com/technetwork/java/javase/downloads");
		String xpath=
    "//a[@href='/technetwork/java/javase/downloads/jdk12-downloads-5295953.html']//img[@alt='Download JDK']";
		driver.findElement(By.xpath(xpath)).click();
		
		driver.findElement(By.xpath("//input[contains(@onclick,'acceptAgreement')]")).click();
		Thread.sleep(200);
		
    driver.findElement(By.xpath("//a[@id='jdk-12.0.2-oth-JPRXXXjdk-12.0.2_windows-x64_bin.zip']")).click();
		Thread.sleep(3000);
    Robot robot= new Robot();
    robot.keyPress(KeyEvent.VK_ESCAPE);
    robot.keyRelease(KeyEvent.VK_ESCAPE);
    
	}
}
