package Selenium.seleniumpractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class launchchrome {
	@Test
	public void chromelaunch()
	{
		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"\\executables\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.google.co.uk");
		
	}
	
	

}
