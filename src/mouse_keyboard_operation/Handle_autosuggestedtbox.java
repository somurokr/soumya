package mouse_keyboard_operation;

import java.awt.RenderingHints.Key;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Handle_autosuggestedtbox {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver= new FirefoxDriver();
		driver.get("https://google.com");
		
		WebElement wb=driver.findElement(By.xpath("//input[@name='q']"));
		wb.sendKeys("wipro jobs");
		Thread.sleep(1000);
		//now do enter keyboard operation using Action class
       Actions act= new Actions(driver);
       
      // act.sendKeys(Keys.TAB,Keys.TAB,Keys.TAB).perform();;
       
      // act.sendKeys(Keys.ARROW_DOWN,Keys.ARROW_DOWN,Keys.ARROW_DOWN,Keys.ENTER).perform();;
		
 //act.sendKeys(Keys.chord(Keys.CONTROL,"A",Keys.CONTROL,"c",Keys.CONTROL,"x")).perform();
       act.doubleClick(wb).perform();;
       //act.sendKeys(Keys.chord(Keys.CONTROL,"c")).build().perform();
       
       
       
	}
}
