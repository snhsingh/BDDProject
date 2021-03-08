package webPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddCart {
	
WebDriver driver;
	
	public AddCart(WebDriver baseDriver) {
		this.driver=baseDriver;
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(xpath="//span[@title='Continue shopping']")
	private WebElement continueShopping;
	
	@FindBy(xpath="//a[contains(text(),'Summer Dresses')]")
	private WebElement summerDress;
	
	@FindBy(xpath="//li/a[@title='Dresses']")
	private WebElement Dress;
	
	@FindBy(xpath="//a[@title='Proceed to checkout']")
	private WebElement proceedToCheckout;
	
	@FindBy(xpath="//a[@title='View my shopping cart']")
	private WebElement shoppingcart;
	
	@FindBy(css="tr.cart_item")
	private WebElement cartItem;

	public WebElement getContinueShopping() {
		return continueShopping;
	}

	public WebElement getSummerDress() {
		return summerDress;
	}

	public WebElement getDress() {
		return Dress;
	}

	public WebElement getProceedToCheckout() {
		return proceedToCheckout;
	}

	public WebElement getShoppingcart() {
		return shoppingcart;
	}

	public WebElement getCartItem() {
		return cartItem;
	}
	
	
	
	
	
	
	
	

}
