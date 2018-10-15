package selenium.pom;


import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
public class SeleniumUtility {
	//public  WebDriver driver;
	//BaseTest1 bese = new BaseTest1();
	
//	protected WebDriver createDriver()
//	{
//		return new ChromeDriver();
//	}
	
	
	private static final ThreadLocal<WebDriver> driverThread = new ThreadLocal<WebDriver>();
	 
    public static WebDriver get()
    {
        return driverThread.get();
    }
 
    public static void set(WebDriver driver)
    {
    	driverThread.set(driver);
    }
//	protected WebDriver getDriver()
//	{
//		if (driver == null)
//		{
//			createDriver();
//		}
//
//		return driver;
//	}
//	WebDriverWait wait=new WebDriverWait(driver, 20);
public void Wait(WebElement webelement) {
	WebDriverWait wait=new WebDriverWait(get(), 20);
	wait.until(ExpectedConditions.visibilityOf(webelement));	
}

	public void enterText(WebElement webelement, String value) {
		Wait(webelement);
		webelement.clear();
		webelement.sendKeys(value);
		
	}

        public void clickElement(WebElement webelement) {
        Wait(webelement);
		webelement.click();
	
	}
        
   public void  Dragwindow(WebElement Webelement,int x,int y)     
   {
	   Actions a=new Actions(get());
	   a.dragAndDropBy(Webelement, x, y).build().perform();
	   
	  
   }
   
   public void  DragLine(WebElement Webelement,WebElement Webelement1)     
   {
	   Actions a=new Actions(get());
	   a.dragAndDrop(Webelement,Webelement1).build().perform();
   }
   
   /*public void Switchframe(int index)
   {
	   get().switchTo().frame(index);
   }*/
	

}
