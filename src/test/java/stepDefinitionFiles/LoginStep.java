package stepDefinitionFiles;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import utilityAndConfig.BaseDriver;
import webPages.LoginPage;


public class LoginStep {
	static WebDriver driver;
	
	LoginPage login;
	
	@Given("Browser launched")
	public void browser_launched() {		
		
		driver=BaseDriver.getInstance().getDriver();

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		driver.manage().window().maximize();
	}

	@And("User is on the login page")
	public void user_is_on_the_login_page() {
		
		driver.get("http://automationpractice.com");
	   
	}
	
	@Then("User is able to see Logo Image")
	public void User_is_able_to_see_Logo_Image() {

		Assert.assertTrue(login.verifyPresenseOfLogoImg());
		System.out.println("Logo Image is Present");
	   
	}
	
	

	@And("User is able to verify â€œYour Logo a new experienceâ€� logo on the page")
	public void user_is_able_to_verify_your_logo_a_new_experience_logo_on_the_page() {
		
		driver.findElement(By.id("header_logo")).isDisplayed();
		
		System.out.println("Your Logo a new experience logo is present on the page");
	   
	}

	@And("user is able to verify Contact us and Sign In links on the page")
	public void user_is_able_to_verify_contact_us_and_sign_in_links_on_the_page() {
		
		Assert.assertTrue(login.verifyPresenseOfContactUs());
		
		System.out.println("Contact-us link is present on the page");
		
		Assert.assertTrue(login.verifyPresenseOfSignIn());
		
		System.out.println("Sing In link is present on the page");
	   
	}

	@When("User cliks on Sign In link")
	public void user_cliks_on_sign_in_link() {
		
		login.doSignIn();
		System.out.println("Sign In clciked");
	    
	}

	@And("^User provides (.*) and (.*)$")
	public void user_provides_username_and_password(String username, String password) {
		
		System.out.println("User provides user name and password");

		login.login(username, password);		
		
	}
	

	@Then("User should be able to see error on invalid login and  able to see Qurate selenium tab on the next page with valid login")
	public void user_should_be_able_to_see_error_on_invalid_login_and_able_to_see_qurate_selenium_tab_on_the_next_page_with_valid_login() {
		
		if(driver.getPageSource().contains("Authentication failed."))
			System.out.println("Invalid login credentials");
		
		else {
			
        System.out.println("User navigated to the next page");
	    
		driver.findElement(By.className("account")).isDisplayed();
		
		System.out.println("User logged in successfully");
		
		driver.quit();
		}
	    
	}


}
