package CreateAnFuseApp.Project;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.pom.CreateAnApp;
import com.pom.KnwBase;

import selenium.pom.BaseTest1;

public class TestCase1 extends BaseTest1{
	
@Test
@Parameters({ "Pagename" },{"Phoneno"})
public void CreateanApp(@Optional("Abc") String Pagename) throws InterruptedException
{
	
	CreateAnApp app=new CreateAnApp(get());
	List<WebElement> iframeElements = get().findElements(By.tagName("iframe"));
	System.out.println("Total Iframe are "+iframeElements.size());
	app.clickonCreateanApp();
	app.clickonLetsGetStarted();
	app.clickonNewPage();
	app.Enteranewname(Pagename);
	app.ClickonCreate();
	app.clickonMessagingdropdown();
	app.clickonAddMessaging();
	app.Enterphoneno("121638383");
	app.EnterTextInMessageText("Hello World");
	app.clickonAddEmail();
	app.EnterTextInSMTPHost("smtp@gmail.com");
	app.EnterTextInPort("465");
	app.EnterTextInUsername("abc@gmail.com");
	app.EnterTextInPassword("1234");
	app.EnterTextInFrom("abc@gmail.com");
	app.EnterTextInTo("xyz@gmail.com");
	app.EnterTextInSubject("SmsnotSent");
	app.EnterTextInMessageTextinEamil("Sms to phone no 121638383 not sent");
	app.DragtheMailWindow(300, 100);
	app.ClickonBasicDropDown();
	app.ClickonExit();
	Thread.sleep(5000);
	app.ClickonExit();
	Thread.sleep(5000);
	app.ClickonExit();
	Thread.sleep(5000);
	app.DragThirdExitWnd(600, 160);
	app.DragSecondExitWnd(90, 100);
	app.DragfirstExitWnd(5, 100);
	app.JoinheStarttoSendanSms();
	app.Jointheleftsmsandfirstexitnode();
	app.jointheRightsmsnodeandEmailNode();
	app.JointhleftEamilandSecondexitnode();
	app.JointhRightEamilandThirdexitnode();	
}
}
