package com.pom;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Login{

@Test	
public void loginApp()
{
	System.setProperty("webdriver.chrome.driver", "C:\\jar\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	 driver.manage().window().maximize();
	 driver.get("http://quickfuseapps.com/");
}
}
