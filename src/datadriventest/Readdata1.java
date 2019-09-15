package datadriventest;

import java.util.Properties;

import org.testng.annotations.Test;

import com.actitime.genericlib.FileUtils;

public class Readdata1 {

	@Test
	public void dataread() throws Throwable
	{
		FileUtils flib= new FileUtils();
		      String user=flib.getpropertyobject("username");
		      String password=flib.getpropertyobject("password");
		      String browser=flib.getpropertyobject("browser");
		      String url=flib.getpropertyobject("url");
		      System.out.println(user+"\t"+password+"\t"+browser+"\t"+url);
		      
		      
		      
		      
		      
		      
		    		  
		
	}
}
