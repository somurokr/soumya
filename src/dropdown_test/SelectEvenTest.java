package dropdown_test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectEvenTest {

	public static void main(String[] args) {
		
		WebDriver driver= new ChromeDriver();
		driver.get("file:///C:/Users/Soumya/Desktop/new%201.html");
		
		WebElement wb=driver.findElement(By.xpath("//select[@name='sel']"));
		Select sel= new Select(wb);
		List<WebElement> lst=sel.getOptions();
		
		int count=0;
		for(WebElement actwb:lst)
		{
			String actopt=actwb.getText();
			
			if(count%2==0)
			{
				sel.selectByVisibleText(actopt);
			}
			count++;
		}
		
		
	}
}
