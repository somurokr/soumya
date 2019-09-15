package complex_xpath;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NewtabTest1 {

	
	public static void main(String[] args) throws Throwable {
		
		WebDriver driver= new ChromeDriver();
		driver.get("https://naukri.com/");
		String parent=driver.getWindowHandle();
		System.out.println("parent window is"+parent);
		Set<String>allwindows=driver.getWindowHandles();
		System.out.println("total no of window is"+allwindows.size());
		//after switching to advertisement window close them 
		for(String child:allwindows)
		{
			if(!parent.equalsIgnoreCase(child))
			{
				driver.switchTo().window(child);
				System.out.println("child window title is"+driver.getTitle());
				Thread.sleep(3000);
				driver.close();
			}
		}
		driver.switchTo().window(parent);
		System.out.println("parent window title is"+driver.getTitle());
		
	}
}
