package mouse_keyboard_operation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Moveto_ElementTest {

	public static void main(String[] args) throws Throwable {
		
		WebDriver driver= new FirefoxDriver();
		driver.get("https://amazon.com");
		Thread.sleep(2000);
		WebElement wb=driver.findElement(By.xpath("//span[text()='Departments']"));
		//move cursor to department menu using Action class
          		Actions act= new Actions(driver);
          		act.moveToElement(wb).perform();
          		
          		Thread.sleep(2000);
          	//now click on submenu	
          		driver.findElement(By.xpath("//span[text()='Books']")).click();
          		
          		
		
		
		
		
	}
}
