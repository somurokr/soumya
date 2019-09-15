package browser_control;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Verify_facebook_Element {

	public static void main(String[] args) {
		
		WebDriver driver= new FirefoxDriver();
		driver.get("https://facebook.com");
		String exptooltip="Go to Facebook home";
		//verify the facebook logo tooltip in gui
		
      String acttooltip=driver.findElement
(By.xpath("//a[@href='https://www.facebook.com/']")).getAttribute("title");
      
      System.out.println(acttooltip);
      
      if(exptooltip.equals(acttooltip))
      {
    	  System.out.println("verified ==pass");
      }
      else
      {
    	  System.out.println("not verified =fail");
      }

		//verify that people connect img should be displayed
      boolean imgstatus=driver.findElement(By.xpath
    		  ("//img[@class='img' and @src='https://static.xx.fbcdn.net/rsrc.php/v3/yi/r/OBaVg52wtTZ.png?_nc_x=Ij3Wp8lg5Kz']"))
      .isDisplayed();
      System.out.println(imgstatus);
      if(imgstatus){
    	  System.out.println("verified=pass");
      }
      else
      {
    	  System.out.println("not verified=fail");
      }
      //check status of the male female radio button
      
      boolean radiobtn1,radiobtn2,radiobtn3;
 radiobtn1=driver.findElement(By.xpath("//input[@name='sex' and @value='1']")).isSelected();
 radiobtn2=driver.findElement(By.xpath("//input[@name='sex' and @value='2']")).isSelected();
 radiobtn3=driver.findElement(By.xpath("//input[@name='sex' and @value='3']")).isSelected();
 
 if(radiobtn1||radiobtn2||radiobtn3)
 {
	 System.out.println("radio btn is selected==fail");
 }
 else
 {
	 System.out.println("radio btn is deselected==pass");
 }
 driver.close();
 
	}
}
