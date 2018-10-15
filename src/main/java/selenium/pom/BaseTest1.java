package selenium.pom;
import java.io.File;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest1 extends SeleniumUtility
{
	
	@BeforeMethod
	
	public void setUp() throws Exception
	{   System.setProperty("webdriver.chrome.driver", "./Test_Library/chromedriver.exe");
	set(new ChromeDriver());
	get().manage().window().maximize();
	get().get("http://quickfuseapps.com");
		
	}

	@AfterMethod
	public void tearDown() throws Exception
	{
		get().quit();
	}

	
}