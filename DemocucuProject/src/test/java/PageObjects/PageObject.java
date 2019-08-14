package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PageObject {
	WebDriver driver;
	
	public PageObject(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	@FindBy(linkText="Log in")
	public WebElement login;
	
	@FindBy(name="Email")
	public WebElement username;
	
	@FindBy(name="Password")
	public WebElement password;
	
	@FindBy(xpath="//input[@value='Log in']")
	public WebElement loginbutton;
	
	@FindBy(linkText="Apparel & Shoes")
	public WebElement Apparel;
    
	@FindBy(linkText="Casual Golf Belt")
	public WebElement belt;
	
	@FindBy(id="addtocart_40_EnteredQuantity")
	public WebElement quan;
	
	@FindBy(id="add-to-cart-button-40")
	public WebElement cart;
	
	@FindBy(linkText="Shopping cart")
	public WebElement scart;
	
	@FindBy(id="termsofservice")
	public WebElement tos;

	@FindBy(id="checkout")
	public WebElement checkout;

	@FindBy(id="billing-address-select")
	public WebElement billadd;
	
	@FindBy(xpath="//option[@value='']")
	public WebElement newadd;
	
	@FindBy(id="BillingNewAddress_CountryId")
	public WebElement billnewadd;
	
	@FindBy(id="BillingNewAddress_City")
	public WebElement city;
	
	@FindBy(id="BillingNewAddress_Address1")
	public WebElement add1;
	
	@FindBy(id="BillingNewAddress_ZipPostalCode")
	public WebElement zip;
	
	@FindBy(id="BillingNewAddress_PhoneNumber")
	public WebElement phno;
	
	@FindBy(xpath="//div[@id='billing-buttons-container']//input[@value='Continue']")
	public WebElement continue0;

	@FindBy(xpath="//div[@id='shipping-buttons-container']//input[@value='Continue']")
	public WebElement continue1;

}
