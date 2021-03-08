package stepDefinitionFiles;


import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import cucumber.api.java.en.And;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import webPages.AddCart;
import webPages.LoginPage;
import webPages.OrderSummaryPage;

public class OrderPlacementSteps {

	WebDriver driver;	
	AddCart cart;	
	LoginPage login;
	OrderSummaryPage summary;
	Actions actions;
	JavascriptExecutor jse;
	
	@When("User adds items in the cart")
	public void user_adds_items_in_the_cart() {		
		actions = new Actions(driver);		
		actions.moveToElement(cart.getDress()).build().perform();		
		WebElement summerDress = cart.getSummerDress();		
		summerDress.click();
	    
		System.out.println("Able to click on Summer Dresses section");
		jse = (JavascriptExecutor)driver;		
		jse.executeScript("window.scrollBy(0, 500)");		
		actions.moveToElement(driver.findElement(By.xpath("//[contains(text(),'Printed Chiffon Dress]"))).build().perform();		WebElement summerDress1 = driver.findElement(By.className("button ajax_add_to_cart_button btn btn-default"));
		summerDress1.click();	    
	}

	@And("User navigates to summary page")
	public void user_navigates_to_summary_page() {
	    cart.getProceedToCheckout().click();
	}

	@Then("User clicks on Proceed to Checkout button and validate that user is on Address Page")
	public void user_clicks_on_proceed_to_checkout_button_and_validate_that_user_is_on_address_page() {
		summary.getProceedToCheckout().click();
		Assert.assertTrue(summary.verifyPresenseOfaddress());
		System.out.println("We are in address Page");
	}

	@And("User clicks on Proceed to Checkout button and validate that user is on Shipping Page")
	public void user_clicks_on_proceed_to_checkout_button_and_validate_that_user_is_on_shipping_page() {
		summary.getProceedToCheckout().click();
		Assert.assertTrue(summary.verifyPresenseOfshipping());
		System.out.println("We are in Shipping Page");		
	}

	@And("User verify that by-default checkbox for T&C is not selected")
	public void user_verify_that_by_default_checkbox_for_t_c_is_not_selected() {
		Assert.assertFalse(summary.verifySelectionOfcheckBox());
		System.out.println("T&C check box is not selected");	    
	}

	@And("User checks the “Terms and Condition” Check box and click on “Proceed To Checkout” button")
	public void user_checks_the_terms_and_condition_check_box_and_click_on_proceed_to_checkout_button() {
	    
		summary.getCheckBox().click();
		summary.getProceedToCheckout();
	}

	@And("User should be on Payment Page")
	public void user_should_be_on_payment_page() {
		summary.verifyPresenseOfpayment();
		System.out.println("We are in Payment Page");
	    
	}

	@And("User validates the total amount on the payment page is correct")
	public void user_validates_the_total_amount_on_the_payment_page_is_correct() {
		Assert.assertTrue(summary.verifyPresenseOftotalPrice());
	}

	@And("User validates the payment options")
	public void user_validates_the_payment_options() {
		Assert.assertTrue(summary.verifyPresenseOfpaymentType());
		System.out.println("Payment type is showing");
	    
	}

	@Then("User logs out of the website and Sign in link is displayed")
	public void user_logs_out_of_the_website_and_sign_in_link_is_displayed() {
	   
		login.getLogout().click();
		Assert.assertTrue(login.verifyPresenseOfSignIn());
		System.out.println("Sign In link is displaying");
	}


}
