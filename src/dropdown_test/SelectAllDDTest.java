package dropdown_test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectAllDDTest {

	public static void main(String[] args) {
		
		WebDriver driver= new ChromeDriver();
		driver.get("file:///C:/Users/Soumya/Desktop/new%201.html");
		WebElement wb=driver.findElement(By.xpath("//select[@name='sel']"));
		Select sel= new Select(wb);
		List<WebElement> lst=sel.getOptions();
		//select all option 
		for(int i=0;i<lst.size();i++)
		{
			sel.selectByIndex(i);
		}
		sel.deselectAll();
	}
}
