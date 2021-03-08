package stepDefinitionFiles;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import utilityAndConfig.BaseDriver;
import webPages.AddCart;
import webPages.LoginPage;

public class AddItemToCartSteps {	
	
	WebDriver driver;	
	AddCart cart;	
	LoginPage login;	
    Actions actions;
	JavascriptExecutor jse;
	
	@Given("User logged in with valid login credentials")
	public void user_logged_in_with_valid_login_credentials() {
		
		driver=BaseDriver.getInstance().getDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();		
		driver.get("http://automationpractice.com");		
		login.doSignIn();
		login.login("qurate@bdd.com", "password");
		
	}

	@When("User hover on dresses and click on summer dresses")
	public void user_hover_on_dresses_and_click_on_summer_dresses() {		
		actions = new Actions(driver);		
		actions.moveToElement(cart.getDress()).build().perform();	
		WebElement summerDress = cart.getSummerDress();
		summerDress.click();	    
		System.out.println("Able to click on Summer Dresses section");		
	}

	@And("User adds any one item to the cart by clicking “Add to Cart”")
	public void user_adds_any_one_item_to_the_cart_by_clicking_add_to_cart(){	    
		jse = (JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy(0, 500)");		
		actions.moveToElement(driver.findElement(By.xpath("//[contains(text(),'Printed Chiffon Dress]"))).build().perform();		WebElement summerDress1 = driver.findElement(By.className("button ajax_add_to_cart_button btn btn-default"));
		summerDress1.click();			
    }

	@Then("User clicks on Continue shopping button")
	public void user_clicks_on_continue_shopping_button() {
		cart.getShoppingcart().click();
		System.out.println("Continue Shopping is clicked");		
	}

	@And("User adds one more item")
	public void user_adds_one_more_item() {
		jse = (JavascriptExecutor)driver;		
		jse.executeScript("window.scrollBy(0, 500)");		
		actions.moveToElement(driver.findElement(By.xpath("//[contains(text(),'Printed Chiffon Dress]"))).build().perform();		WebElement summerDress1 = driver.findElement(By.className("button ajax_add_to_cart_button btn btn-default"));
		summerDress1.click();	
		
	}

	@And("User clicks on Proceed to Checkout button")
	public void user_clicks_on_proceed_to_checkout_button() {
		cart.getProceedToCheckout().click();  
		
	}

	@Then("User validates whether {int} items are added in the cart")
	public void user_validates_whether_items_are_added_in_the_cart(Integer int1) {	   
	   System.out.println("Item Added to cart is " + cart.getCartItem().getSize());		
	}

	

}
