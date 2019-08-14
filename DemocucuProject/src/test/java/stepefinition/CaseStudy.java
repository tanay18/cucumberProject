package stepefinition;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import PageObjects.PageObject;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class CaseStudy {
	WebDriver driver;
	@Given("^login yo the website$")
	public void login_yo_the_website() throws Throwable {
	
	    // Write code here that turns the phrase above into concrete actions
		System.setProperty("webdriver.chrome.driver", "src/test/resources/driver/chromedriver.exe");
		 driver = new ChromeDriver();
		 driver.get("http://demowebshop.tricentis.com/");
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);	
		 PageObject po=new PageObject(this.driver);
			po.login.click();
			po.username.sendKeys("tanalu@gmail.com");
			po.password.sendKeys("123456");
			po.loginbutton.click();
			
	}

	@When("^increase the quantity by (\\d+)$")
	public void increase_the_quantity_by(int arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		PageObject po1=new PageObject(this.driver);
		po1.Apparel.click();
		po1.belt.click();
		po1.quan.clear();
		po1.quan.sendKeys("10");
		po1.cart.click();
		po1.scart.click();
	}

	@When("^continue for checkout$")
	public void continue_for_checkout() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		PageObject po1=new PageObject(this.driver);
		po1.tos.click();
		po1.checkout.click();
		po1.billadd.click();
		po1.newadd.click();
		
	
		
	}

	@When("^change the shipping address to the new address pune$")
	public void change_the_shipping_address_to_the_new_address_pune() throws Throwable {
		PageObject po1=new PageObject(this.driver);

		Select t1=new Select(po1.billnewadd);
	    t1.selectByVisibleText("India");
	    po1.city.clear();
        po1.city.sendKeys("pune");
        po1.add1.clear();
        po1.add1.sendKeys("abc");
        po1.zip.clear();
        po1.zip.sendKeys("123");
        po1.phno.clear();
        po1.phno.sendKeys("456");
        po1.continue0.click();
        po1.continue1.click();
        driver.close();
	}

	@Then("^the product should be delievered to the new address$")
	public void the_product_should_be_delievered_to_the_new_address() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	}

}
