package utilityAndConfig;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hook {

	@Before
	public void beforeMethod() {
		System.out.println("Our BDD Assessment starting Now");
	}
	
	@After
	public void afterMethod() {
		System.out.println("Our BDD Assessment Finished here");
	}
	
	
}
