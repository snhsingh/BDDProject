package webPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrderSummaryPage {
	
WebDriver driver;
	
	public OrderSummaryPage(WebDriver baseDriver) {
		this.driver=baseDriver;
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(xpath="//a[@title='Proceed to checkout']")
	private WebElement proceedToCheckout;
	
	@FindBy(xpath="//h1[text()='Addresses']")
	private WebElement addressPage;
	
	@FindBy(id="uniform-cgv")
	private WebElement checkBox;
	
	public WebElement getCheckBox() {
		return checkBox;
	}

	@FindBy(xpath="//h1[contains(text(),'payment')]")
	private WebElement paymentPage;	
	
	@FindBy(xpath="//h1[contains(text(),'Shipping')]")
	private WebElement shippingPage;	
	
	@FindBy(id="total_price")
	private WebElement totalPrice;
	
	@FindBy(id="HOOK_PAYMENT")
	private WebElement paymentType;
	
	
	public Boolean verifyPresenseOfpaymentType() {
		return paymentType.isDisplayed();		
	}
	
	public Boolean verifyPresenseOftotalPrice() {
		return totalPrice.isDisplayed();		
	}
	
	
	
	public Boolean verifyPresenseOfaddress() {
		return addressPage.isDisplayed();		
	}
	
	public Boolean verifyPresenseOfshipping() {
		return shippingPage.isDisplayed();		
	}
	
	public Boolean verifyPresenseOfpayment() {
		return paymentPage.isDisplayed();		
	}
	
	public Boolean verifySelectionOfcheckBox() {
		return checkBox.isSelected();		
	}

	public WebElement getProceedToCheckout() {
		return proceedToCheckout;
	}
	

}
