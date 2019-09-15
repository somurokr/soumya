package complex_xpath;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CaptureAllAutosuggestlst {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.get("https://google.com");
		driver.findElement(By.name("q")).sendKeys("wipro jobs");
		Thread.sleep(300);
		String xpath="//ul[@class='erkvQe']/li[*]//span";
		List<WebElement> lst=driver.findElements(By.xpath(xpath));
		System.out.println(lst.size());
		
		for(int i=0;i<lst.size();i++)
		{
			System.out.println(lst.get(i).getText());
		}
		
	}
}
