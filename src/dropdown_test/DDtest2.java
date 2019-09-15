package dropdown_test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class DDtest2 {

	public static void main(String[] args) {
		
		WebDriver driver= new FirefoxDriver();
		driver.get("file:///C:/Users/Soumya/Desktop/new%201.html");
		
		WebElement wb=driver.findElement(By.name("sel"));
		Select sel= new Select(wb);
		boolean stats=sel.isMultiple();
		System.out.println(stats);
		
		List<WebElement> lst=sel.getOptions();
		System.out.println(lst.size());
		
		System.out.println("capture by using for each loop");
		for(WebElement owb:lst)
		{
			System.out.println(owb.getText());
		}
		
		for(int i=0;i<lst.size();i++)
		{
			sel.selectByIndex(i);
			System.out.println(lst.get(i).getText());
			
			
		}
		sel.deselectByVisibleText("java");
	}
}
