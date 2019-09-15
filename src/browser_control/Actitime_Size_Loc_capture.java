package browser_control;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Actitime_Size_Loc_capture {
	
     public static void main(String[] args) {
	
    	 WebDriver driver= new FirefoxDriver();
    	 driver.get("http://soumya-pc/login.do");
    	//get location of the chk box 
    	 WebElement chwb=driver.findElement(By.id("keepLoggedInCheckBox"));
    	 Point p=chwb.getLocation();
    	 System.out.println("get xcoordinate="+p.getX());
    	 System.out.println("get ycoordinate="+p.getY());
    	 //get the size of the chkbox
    	 Dimension dem=chwb.getSize();
    	 System.out.println(dem.getHeight());
    	 System.out.println(dem.getWidth());
    	 //check status of the chkbox
    	 boolean status=chwb.isSelected();
    	 System.out.println(status);
    	 
    	 
}
}
