package dropdown_test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DynamicDDTest {

	public static void main(String[] args) {
		
		WebDriver driver= new ChromeDriver();
		driver.get("file:///C:/Users/Soumya/Desktop/new%201.html");
		
		String expvalue="java";
		boolean flag=false;
		//identify multiselect dropdown
		WebElement wb=driver.findElement(By.xpath("//select[@name='sel']"));
		Select sel= new Select(wb);
		List<WebElement> lst=sel.getOptions();
		//get the option count
		System.out.println(lst.size());
		//capture all values and check for expvalue & select if available
		for(WebElement optwb:lst)
		{
			String actopt=optwb.getText();
			if(expvalue.equals(actopt))
			{
				sel.selectByVisibleText(actopt);
				flag=true;
				break;
			}
		}
		
		if(flag)
		{
			System.out.println(expvalue+" "+"is available");
		}
		else
		{
			System.out.println(expvalue+" "+"is not available");
		}
		
		
	}
	
}
