package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import selenium.pom.SeleniumUtility;
public class CreateAnApp extends SeleniumUtility{
	
	public CreateAnApp(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//a[@id='link-create']")
	private WebElement btn_Createanapp;
	

	@FindBy(xpath="//div[@id='intro-dialog-cont']/div[2]/button")
	private WebElement btn_Letsgetstarted;
	
	
	@FindBy(xpath="//div[@class='syn-editor']")
	private WebElement page_Plumpage;
	
	@FindBy(xpath="//div[@class='syn-editor']/div/ul/li[3]/a")
	private WebElement btn_Newpage;
	
	
	@FindBy(xpath="(//input[@name='name' and @type='text'])[2]")
	private WebElement Editbox_Newname;
	
	
	@FindBy(xpath="(//button[text()='Create'])[2]")
	private WebElement btn_Create;	
	
	@FindBy(xpath="//div[@id='accordion']/h3[4]/span")
	private WebElement btn_Dropdown_Messaging;	
	
	
	@FindBy(xpath="//li[text()='Send an SMS']/a")
	private WebElement btn_plus_SendaSms;	
	
	
	@FindBy(xpath="//div[@id='module-1']/div[5]/div")
	private WebElement Src_Sendasms;	
	
	//@FindBy(xpath="//div[@class='panel']/following-sibling::div[1]/div")
	@FindBy(xpath="//div[@id='module-2']/div[2]/div")
	private WebElement Dest_Sendasms;
	
	
	@FindBy(xpath="//li[text()='Send an Email']/a")
	private WebElement btn_plus_SendanEmail;
	
	
	@FindBy(xpath="//div[text()='Send an Email']")
	private WebElement Window_plus_SendanEmail;
	
	@FindBy(xpath="//textarea[@name='phone_constant']")
	private WebElement Edit_Box_Phoneno;
	
	
	
	@FindBy(xpath="//textarea[@name='message_phrase[]'][1]")
	private WebElement Edit_Box_MessageText;
	
	
	@FindBy(xpath="//div[@class='inner']/div[3]/div[2]")
	private WebElement Sendasmsrt_node;
	
	
	@FindBy(xpath="(//div[@class='inner']/div[3]/div[1])[1]")
	private WebElement Sendasmsleft_node;	
	
	@FindBy(xpath="(//div[@class='inner']/div[4]/div[1])[1]")
	private WebElement Sendamailleft_node;	
	
	
	@FindBy(xpath="//div[@class='inner']/div[4]/div[2]")
	private WebElement Sendamailrt_node;
	
	
	
	
//	@FindBy(xpath="(//div[@class='panel']/following-sibling::div/div)[4]")
//	@FindBy(xpath="(//div[@class='mod-rail mod-north']/div)[2]")
	
	@FindBy(xpath="(//div[@id='module-3']/div[2]/div)")	
	private WebElement Sendamail_node;
	
	
	@FindBy(xpath="//input[@name='smtp_url']")
	private WebElement Editbox_SMTP_Host;
	
	
	@FindBy(xpath="//input[@name='port']")
	private WebElement Editbox_Port;
	
	
	@FindBy(xpath="(//input[@name='username'])[1]")
	private WebElement Editbox_Username;
	
	
	@FindBy(xpath="(//input[@name='password'])[1]")
	private WebElement Editbox_Passord;
	
	@FindBy(xpath="//textarea[@name='from_constant']")
	private WebElement Editbox_From_constant;
	
	@FindBy(xpath="//textarea[@name='to_constant']")
	private WebElement Editbox_To_constant;
	
	@FindBy(xpath="//textarea[@name='subject_constant']")
	private WebElement Editbox_Subject;
	
	
	@FindBy(xpath="//textarea[@name='cc_constant']")
	private WebElement Editbox_CC;
	
	@FindBy(xpath="(//textarea[@name='message_phrase[]'])[3]")
	private WebElement Editbox_MessagePahse;
	
	@FindBy(xpath="(//ul[@class='module-group']/li/a)[1]")
	private WebElement Btn_Exit;
	
	@FindBy(xpath="(//div[text()='Exit App'])[1]")
	private WebElement Window_Exit_Node_1;
	
	
	@FindBy(xpath="(//div[text()='Exit App'])[2]")
	private WebElement Window_Exit_Node_2;
	
	
	@FindBy(xpath="(//div[text()='Exit App'])[3]")
	private WebElement Window_Exit_Node_3;
	
	@FindBy(xpath="//div[@id='module-4']/div[2]/div")
	private WebElement Exit_Node_First;
	
	
	@FindBy(xpath="//div[@id='module-5']/div[2]/div")
	private WebElement Exit_Node_Second;
	
	@FindBy(xpath="//div[@id='module-6']/div[2]/div")
	private WebElement Exit_Node_Third;
	
	@FindBy(xpath="(//div[@id='accordion']/h3/span)[1]	")
	private WebElement Dropdwn_Btn_Basic;
	
//	SeleniumUtility s=new SeleniumUtility();
		
	
	/*public void launch() {
		 System.setProperty("webdriver.chrome.driver", "C:\\jar\\chromedriver.exe");
		 WebDriver driver=new ChromeDriver();
		 driver.get("http://quickfuseapp com/");
		 driver.manage().window().maximize();
	}*/
	
	//Click on Create app Button
	public void clickonCreateanApp()
	{
		clickElement(btn_Createanapp);
	}

	//Click on Lets get Started Button
	public void clickonLetsGetStarted()
	{
		clickElement(btn_Letsgetstarted);
	}
	
	//Click on New Page Button
	public void clickonNewPage()
	{
		clickElement(btn_Newpage);
	}
	
	//Enter value in name Edit box
	public void Enteranewname(String Value)
	{
		 enterText(Editbox_Newname, Value);
	}
	
	//Click on Create  Button
	public void ClickonCreate()
	{
		 clickElement(btn_Create);
	}
	
	//Click on drop down of Messaging Module
	public void clickonMessagingdropdown()
	{			
		 clickElement(btn_Dropdown_Messaging);
	
	}
	
	//Click on add button on messaging
	public void clickonAddMessaging()
	{			
		 clickElement(btn_plus_SendaSms);
	
	}
	
	
	//Enter value in name Edit box
	public void Enterphoneno(String Value)
	{			
		 enterText(Edit_Box_Phoneno, Value);
	
	}
	
	//Enter text in Message Text
	public void EnterTextInMessageText(String Value)
	{
		 enterText(Edit_Box_MessageText, Value);
	}
	
	//Drag the Item Start to Send a Sms
	public void JoinheStarttoSendanSms()
	{	
		
		DragLine(Src_Sendasms, Dest_Sendasms);
	}
	
	//Click on add button on messaging
	public void clickonAddEmail()
	{			
		 clickElement(btn_plus_SendanEmail);		
    }
	
	
	//Click on Basic 
	public void ClickonBasicDropDown()
	{
		 clickElement(Dropdwn_Btn_Basic);	
	}
	
	//Drag the Send a mail Window
	public void DragtheMailWindow(int x,int y)
	{
			Dragwindow(Window_plus_SendanEmail, x, y);
	}
		
	//Click on Exit
	public void ClickonExit()
	{
		 clickElement(Btn_Exit);	
	}
	
	//Enter the SMTP Host
	public void EnterTextInSMTPHost(String Smpt)
	{
		 enterText(Editbox_SMTP_Host, Smpt);
	}
	
	//Enter the Port
	public void EnterTextInPort(String Port)
	{
		 enterText(Editbox_Port, Port);
	}
	
	//Enter the Username
	public void EnterTextInUsername(String Username)
	{			
		 enterText(Editbox_Username, Username);
	}
	
	//Enter the Password
	public void EnterTextInPassword(String Password)
	{						
		 enterText(Editbox_Passord, Password);
	}
	
	//Enter the From
	public void EnterTextInFrom(String From)
	{						
		 enterText(Editbox_From_constant, From);
	}
	
	//Enter the From
	public void EnterTextInTo(String To)
	{						
		 enterText(Editbox_To_constant, To);
	}
	
	//Enter the Subject
	public void EnterTextInSubject(String Subject)
	{						
		 enterText(Editbox_Subject, Subject);
	}
	
	//Enter the CC
	public void EnterTextInCC(String cc)
	{						
			 enterText(Editbox_CC, cc);
	}
	
	//Enter the MessageText
	public void EnterTextInMessageTextinEamil(String MessageText)
	{					
		 enterText(Editbox_MessagePahse, MessageText);
	}
	
	//Drag the 1st exit Window
	public void DragfirstExitWnd(int x,int y) 
	{
		Dragwindow(Window_Exit_Node_1, x, y);
	}
	
	//Drag the 2nd exit Window
	public void DragSecondExitWnd(int x,int y) 
	{
		Dragwindow(Window_Exit_Node_2, x, y);
	}
	
	//Drag the 2nd exit Window
	public void DragThirdExitWnd(int x,int y) 
	{	
		Dragwindow(Window_Exit_Node_3, x, y);
	}
	
	//Join the left node of send Sms and first exit Node
	public void Jointheleftsmsandfirstexitnode() 
	{
		DragLine(Sendasmsleft_node, Exit_Node_First);
	}
	
	//Join the left node of send Email and Second exit Node
	public void JointhleftEamilandSecondexitnode() 
	{
		DragLine(Sendamailleft_node, Exit_Node_Second);
	}
	
	//Join the Right node of send Email and Thrird exit Node
	public void JointhRightEamilandThirdexitnode() 
	{
		DragLine(Sendamailrt_node, Exit_Node_Third);
	}
	
	//Join the Right Send a Sms and Email Node
	public void jointheRightsmsnodeandEmailNode()
	{
		DragLine(Sendasmsrt_node, Sendamail_node);
	}
	
	
}

