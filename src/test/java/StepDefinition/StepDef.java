package StepDefinition;

import static org.junit.jupiter.api.Assertions.assertTrue;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import PomPackage.LoginElements;
import dev.failsafe.internal.util.Assert;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class StepDef {
	public WebDriver driver;
	public LoginElements log;
	@Given("User Launch Chrome browser")
	public void user_launch_chrome_browser() {
	    WebDriverManager.chromedriver().setup();
	 
	  
	    driver=new ChromeDriver();
	  
	    log=new LoginElements(driver);
	}
	@When("maximize the Chrome browser")
	public void maximize_the_chrome_browser() {
	    driver.manage().window().maximize();
	}

	@When("user opens URL {string}")
	public void user_opens_url(String URL) {
	   driver.get(URL); 
	}

	@When("Click on Login")
	public void click_on_login() throws Throwable {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	  log.loginclick();
	  Thread.sleep(5000);
	}
	
	@When("User enter email as {string} and password as {string}")
	public void user_enter_email_as_and_password_as(String string1, String string2) {
	    log.uname(string1);
	    log.pas(string2);
	}

	@When("User Click on Loginbutton")
	public void user_click_on_loginbutton() throws Throwable {
		log.logclick();
		Thread.sleep(15000);
	   
	}
	@When("User Click on ContentManagement")
	public void user_click_on_content_management() throws Throwable {
	   log.manageclick();
	   Thread.sleep(4000);
	}
	
	@When("User Click on ContentLibrary")
	public void user_click_on_content_library() throws Throwable {
	   log.contentlib();
	   Thread.sleep(10000);
	}
	@When("Click on AddContent button")
	public void click_on_add_content_button() throws Throwable {
	   log.addbutton(); 
	   Thread.sleep(7000);
	}
	
	@When("EnterContentName as {string}")
	public void enter_content_name_as(String string3) throws Throwable {
	   log.contentnames(string3);
	   Thread.sleep(6000);
	}
	
	@When("EnterPermalink as {string}")
	public void enter_permalink_as(String string5) throws Throwable {
	   log.contentlink(string5);
	   Thread.sleep(5000);
	}
	@When("Select cate")
	public void select_cate() throws Throwable {
	    log.categories();
	    Thread.sleep(5000);
	}
	@When("Scrolldown the page")
	public void scrolldown_the_page() throws Throwable {
	  log.downpage();
	}
	@When("Click on Checkall")
	public void click_on_checkall() {
	    log.selectcheck();
	    
	}

	@When("Click on Save and Close")
	public void click_on_save_and_close() throws Throwable {
	    log.saveform();
	    Thread.sleep(3000);
	}

	@Then("validate successfull message")
	public void validate_successfull_message() throws Throwable {
	   log.success();
	}


	
	
	
	
	


}
