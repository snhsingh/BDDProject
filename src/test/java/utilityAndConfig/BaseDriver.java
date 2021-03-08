package utilityAndConfig;

import java.io.File;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseDriver {
	private static WebDriver driver;	
	private static BaseDriver instdriver;
	
	String chromedriver= "webdriver.chrome.driver";
	String path= "C:"+File.separator+"chromedriver.exe";
	
	// Constructor
	public BaseDriver() {
		
	}

	public WebDriver getDriver() {
		System.setProperty(chromedriver, path);
		if(driver == null) {
			driver = new ChromeDriver();
		}
		return driver;
	}
	
	public static BaseDriver getInstance() {
		if(instdriver==null) {
			instdriver=new BaseDriver();
		}
		return instdriver;
	}
	

}
