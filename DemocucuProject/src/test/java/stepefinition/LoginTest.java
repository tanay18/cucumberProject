package stepefinition;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import PageObjects.PageObject;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginTest {
	WebDriver driver;
	
	@Given("^Navigates to homepage$")
	public void navigates_to_homepage() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		
		System.setProperty("webdriver.chrome.driver", "src/test/resources/driver/chromedriver.exe");
		 driver = new ChromeDriver();
		 driver.get("http://demowebshop.tricentis.com/");
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);	 
	}

	@When("^user enter username and password$")
	public void user_enter_username_and_password() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		
		PageObject po=new PageObject(this.driver);
		po.login.click();
		po.username.sendKeys("tanalu@gmail.com");
		po.password.sendKeys("123456");
		po.loginbutton.click();
		
	}

	@Then("^users logged in successfully$")
	public void users_logged_in_successfully() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("Successfully logged in");
	}



}
