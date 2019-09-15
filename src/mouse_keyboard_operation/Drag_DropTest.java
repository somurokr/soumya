package mouse_keyboard_operation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Drag_DropTest {

	public static void main(String[] args) throws Throwable {
		
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demos.telerik.com/kendo-ui/dragdrop/index");
		driver.findElement(By.xpath("//button[@title='Accept Cookies']")).click();
		Thread.sleep(1000);
		
		WebElement droptarget=driver.findElement(By.xpath("//div[@id='droptarget']"));
		WebElement dragtarget=driver.findElement(By.xpath("//div[@id='draggable']"));
		driver.manage().deleteAllCookies();
		Actions act= new Actions(driver);
		
		//aact.dragAndDrop(source, target);
	}
}
