package yahoo;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Listeners;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import atu.testng.reports.listeners.ATUReportsListener;
import atu.testng.reports.listeners.ConfigurationListener;
import atu.testng.reports.listeners.MethodListener;

@Listeners({ATUReportsListener.class, ConfigurationListener.class,MethodListener.class})
public class Sanity_Test 
{

	WebDriver driver;
	
	 {
		 System.setProperty("atu.reporter.config", "e:/june_18_16/myproj/atu.properties");
	 }
	 
	@Test
	@Parameters({"browser"})
	public void sanityTest(String br) throws Exception
	{
		if(br.matches("ff"))
		{
			driver=new FirefoxDriver();
		}		
		Home h=new Home(driver);
		h.login();
		
		Compose c=new Compose(driver);
		c.logout();
		
	}
}


















