package dropdown_test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Fbtest {

	public static void main(String[] args) {
		
		WebDriver driver= new FirefoxDriver();
		driver.get("https://facebook.com");
		
		WebElement day=driver.findElement(By.id("day"));
		WebElement month=driver.findElement(By.id("month"));
		WebElement year=driver.findElement(By.id("year"));
		
		Select sel= new Select(day);
		boolean stat=sel.isMultiple();
		System.out.println(stat);
		
		sel.selectByIndex(0);
		WebElement firstoption=sel.getFirstSelectedOption();
		System.out.println(firstoption.getText());
		
	Select sel1= new Select(year);
	sel1.selectByVisibleText("2007");
	List<WebElement> lst=sel.getAllSelectedOptions();
	System.out.println(lst.size());
	String optionname;
	for(int i=0;i<lst.size();i++)
	{
		 optionname=lst.get(i).getText();
		 System.out.println(optionname);
	}
			
		sel.deselectByVisibleText("2007");
		
	}
	
}
