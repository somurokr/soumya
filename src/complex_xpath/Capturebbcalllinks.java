package complex_xpath;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Capturebbcalllinks {

	public static void main(String[] args) {
		
		WebDriver driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://bbc.com");
		
		List<WebElement> lst=driver.findElements(By.xpath("//a"));
		System.out.println(lst.size());
		for(int i=0;i<lst.size();i++)
		{
			WebElement link=lst.get(i);
			String links=link.getText();
			//System.out.println(i+":"+links);
			if(links.equals("TECHNOLOGY OF BUSINESS"));
			{
				
				link.click();
			}
			
			
		}
		
	}
}

	
	

