package stepefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.WebDriver;

public class TestScripts {
	WebDriver driver;
	@Given("^I choose to sign up$")
	public void i_choose_to_sign_up() throws Throwable {

		System.setProperty("webdriver.chrome.driver", "src/test/resources/driver/chromedriver.exe");
		 driver = new ChromeDriver();
		
		// Write code here that turns the phrase above into concrete actions
		System.out.println("GIVEN: choose to sign up");
	}
	@Given("^I choose to Launch app$")
	public void i_choose_to_Launch_app() throws Throwable {
		driver.get("http://demowebshop.tricentis.com/");
	    // Write code here that turns the phrase above into concrete actions
	    Thread.sleep(1000);
	}
	
	
	@When("^I sign up with \"(.*?)\" and \"(.*?)\"$")
	public void i_sign_up_with_and(String arg1, String arg2) throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		driver.findElement(By.linkText("Log in")).click();
		driver.findElement(By.id("Email")).sendKeys(arg1);
		Thread.sleep(1000);
		driver.findElement(By.id("Password")).sendKeys(arg2);
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@value=\"Log in\"]")).click();
		Thread.sleep(1000);
		System.out.println("userane:" + arg1 + " password: " + arg2);
	}

	@Then("^I should be sign up on the webpage$")
	public void i_should_be_sign_up_on_the_webpage() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		System.out.println("THEN: Successfully sign up page");
		driver.close();
	}

}
