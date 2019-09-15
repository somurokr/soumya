package browser_control;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SampleTest {

	public static void main(String[] args) {
		
		WebDriver driver= new ChromeDriver();
		driver.get("https://gmail.com");
		
		String ptitle=driver.getTitle();
		System.out.println(ptitle);
		
		String purl=driver.getCurrentUrl();
		System.out.println(purl);
		
		String htmlsourcecode=driver.getPageSource();
		System.out.println(htmlsourcecode);
		
	}
}
