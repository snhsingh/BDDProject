package webPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
WebDriver driver;
	
	public LoginPage(WebDriver baseDriver) {
		this.driver=baseDriver;
		PageFactory.initElements(driver, this);
		
	}

	@FindBy(css="img.logo")
	private WebElement logoImage;
	
	@FindBy(xpath="//a[@title='Contact Us']")
	private WebElement contactUs;
	
	@FindBy(css=".login")
	private WebElement signLink;
	
	@FindBy(id="email")
	private WebElement email;
	
	@FindBy(id="passwd")
	private WebElement password;
	
	@FindBy(id="SubmitLogin")
	private WebElement SubmitLogin;
	
	@FindBy(css=".logout")
	private WebElement logout;
	
	
	
	public WebElement getLogout() {
		return logout;
	}

	public Boolean verifyPresenseOfLogoImg() {
		return logoImage.isDisplayed();		
	}
	
		public Boolean verifyPresenseOfContactUs() {
		return contactUs.isDisplayed();		
	}
	
	public Boolean verifyPresenseOfSignIn() {
		return signLink.isDisplayed();		
	}
	
	public void doSignIn() {
		signLink.click();
	}
	
	public WebElement getEmail() {
		return email;
	}

	public WebElement getPassword() {
		return password;
	}

	public WebElement getSubmitLogin() {
		return SubmitLogin;
	}
	
	public void login(String user, String pwd) {
		getEmail().sendKeys(user);
		getPassword().sendKeys(pwd);
		getSubmitLogin().click();
	}
	
	
	
	
	
	
	
	

}
