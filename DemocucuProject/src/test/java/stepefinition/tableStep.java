package stepefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import PageObjects.Tableobject;
import cucumber.api.DataTable;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class tableStep {
	static WebDriver driver;
	@When("^search the product in the search box$")
	
	public void search_the_product_in_the_search_box(DataTable arg1) throws Throwable {
		Tableobject po = new Tableobject(tableStep.driver);
	    // Write code here that turns the phrase above into concrete actions
	    // For automatic transformation, change DataTable to one of
	    // List<YourType>, List<List<E>>, List<Map<K,V>> or Map<K,V>.
	    // E,K,V must be a scalar (String, Integer, Date, enum etc)
		System.setProperty("webdriver.chrome.driver", "src/test/resources/Drivers/chromedriver.exe");
		 driver = new ChromeDriver();
		 driver.get("http://demowebshop.tricentis.com/");
		 po.search.click();
		 
			 po.search.sendKeys("Head");
			 
		 
		 
	}

	@Then("^product should be added in the cart if available$")
	public void product_should_be_added_in_the_cart_if_available() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	}





}
