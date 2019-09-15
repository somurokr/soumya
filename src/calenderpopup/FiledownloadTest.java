package calenderpopup;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class FiledownloadTest {

	public static void main(String[] args) throws Throwable {
		
		FirefoxOptions config= new FirefoxOptions();
		config.addPreference("browser.download.folderList","2");
		config.addPreference("browser.helperApps.neverAsk.saveToDisk", "application/zip");
		config.addPreference("browser.download.dir","C:\\Users\\Soumya\\Desktop\\fftest");
		WebDriver driver= new FirefoxDriver(config);
		driver.manage().window().maximize();
		driver.get("https://www.oracle.com/technetwork/java/javase/downloads");
		String xpath=
    "//a[@href='/technetwork/java/javase/downloads/jdk12-downloads-5295953.html']//img[@alt='Download JDK']";
		driver.findElement(By.xpath(xpath)).click();
		
		driver.findElement(By.xpath("//input[contains(@onclick,'acceptAgreement')]")).click();
		Thread.sleep(200);
		
    driver.findElement(By.xpath("//a[@id='jdk-12.0.2-oth-JPRXXXjdk-12.0.2_windows-x64_bin.zip']")).click();
		
	}
	
	
}
