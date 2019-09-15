package mouse_keyboard_operation;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class ContextClickTest {

	public static void main(String[] args) throws Throwable {
		
		WebDriver driver= new ChromeDriver();
		driver.get("https://google.com");
		
		driver.findElement(By.xpath("//input[@name='q']")).sendKeys("indiatoaday",Keys.ENTER);
		
		Thread.sleep(1000);
		
		WebElement linkwb=driver.findElement(By.xpath("//div[@class='TbwUpd']"));
		
		Actions act= new Actions(driver);
		act.contextClick(linkwb);
		
		act.sendKeys("T").perform();
		
		
		
	}
}
