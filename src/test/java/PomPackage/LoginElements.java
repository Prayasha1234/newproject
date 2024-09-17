package PomPackage;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginElements {

	WebDriver driver;
	public LoginElements(WebDriver idriver)
	{
		driver=idriver;
		PageFactory.initElements(idriver, this);
		
	}
	
	@FindBy(partialLinkText="Login")
	WebElement loginclicked;
	
	@FindBy(xpath="//input[@placeholder='Email address']")
	WebElement username;
	
	@FindBy(xpath="//input[@placeholder='Password']")
	WebElement pass;
	
	@FindBy(xpath="//span[contains(text(),\"Login\")]")
	WebElement login;
	
	@FindBy(xpath="//div[contains(text(),\" Content Management\")]")
	WebElement management;
	
	@FindBy(xpath="//a[contains(text(),\"Content Library\")]")
	WebElement contentLibrary;
	
	@FindBy(xpath="//div[contains(text(),\"Add Content\")]")
	WebElement addcontentbutton;
	
	@FindBy(xpath="//input[@placeholder='Content Name']")
	WebElement contentname;
	
	@FindBy(xpath="//input[@placeholder='Permalink Name']")
	WebElement permalink;
	
	@FindBy(id="categorySelect")
	WebElement category;
	
	@FindBy(id="chkAlls")
	WebElement checkedall;
	
	@FindBy(xpath="//button[contains(text(),\"Save & Publish\")]")
	WebElement savebutton;
	
	@FindBy(xpath="//div[contains(text(),\"Content added successfully!\")]")
	WebElement savedsuccess;
	
	public void loginclick()
	{
		loginclicked.click();
	}
	public void uname(String uname1)
	{
		username.sendKeys(uname1);
	}
	public void pas(String pas1)
	{
		pass.sendKeys(pas1);
	}
	public void logclick()
	{
		login.click();
	}
	
	public void manageclick()
	{
		management.click();
	}
	
	public void contentlib()
	{
		contentLibrary.click();
	}
	public void addbutton()
	{
		addcontentbutton.click();
	}
	
	public void contentnames(String contentsn)
	{
		contentname.sendKeys(contentsn);
	}
	
	public void contentlink(String conlink)
	{
		permalink.sendKeys(conlink);
	}
	
	
	
	public void downpage() throws Throwable
	{
JavascriptExecutor js=(JavascriptExecutor)driver;
js.executeScript("window.scrollBy(0,500)");
Thread.sleep(5000);
		
	}
	public void categories()
	{
		category.click();
	}
	//checkallcheckbox1
	public void selectcheck()
	{
		checkedall.click();
	}
	
	public void saveform()
	{
		savebutton.click();
	}
	public void success() throws Throwable
	{
		String actualsuc=savedsuccess.getText();
		String expectedsuc="Content added successfully!";
		if(actualsuc.equals(expectedsuc))
		{
			System.out.print("Success");
		}
		else
		{
			throw new Exception();
		}
	}
}
