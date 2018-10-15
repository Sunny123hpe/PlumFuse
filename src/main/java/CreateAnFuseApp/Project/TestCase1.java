package CreateAnFuseApp.Project;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.pom.CreateAnApp;


import selenium.pom.BaseTest1;

public class TestCase1 extends BaseTest1{

@Parameters({"Pagename","Phoneno","MessageSendasms","SMTP","PortNo","Username","Pwd","From","To","Subject","MailMessage"})	
@Test
public void CreateanApp(String page,String Phoneno,String MessageSendasms,String SMTP,String PortNo,String Username,String Pwd,String From,String To,String Subject,String MailMessage) throws InterruptedException
{
	
	CreateAnApp app=new CreateAnApp(get());
	app.clickonCreateanApp();
	app.clickonLetsGetStarted();
	app.clickonNewPage();
	app.Enteranewname(page);
	app.ClickonCreate();
	app.clickonMessagingdropdown();
	app.clickonAddMessaging();
	app.Enterphoneno(Phoneno);
	app.EnterTextInMessageText(MessageSendasms);
	app.clickonAddEmail();
	app.EnterTextInSMTPHost(SMTP);
	app.EnterTextInPort(PortNo);
	app.EnterTextInUsername(Username);
	app.EnterTextInPassword(Pwd);
	app.EnterTextInFrom(From);
	app.EnterTextInTo(To);
	app.EnterTextInSubject(Subject);
	app.EnterTextInMessageTextinEamil(MailMessage);
	app.DragtheMailWindow(300, 100);
	app.ClickonBasicDropDown();
	app.ClickonExit();
	Thread.sleep(3000);
	app.ClickonExit();
	Thread.sleep(3000);
	app.ClickonExit();
	Thread.sleep(3000);
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
