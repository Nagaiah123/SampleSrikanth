package stepDefination;

import org.testng.Assert;

import browser.Browser;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.Page1;

public class Sample1Scenario
{
	@Given("User opens the Browser")
	public void user_opens_the_browser() throws Exception {
		Browser.openBrowser();

	}
	@And("User navigates to the {string} Webpage")
	public void user_navigates_to_the_webpage(String string) throws Exception {
     Browser.navigateToUrl();

	}
	@Then("User verifies the title of the Webpage")
	public void user_verifies_the_title_of_the_webpage() {
	    String expectedTitle = "OrangeHRM";  // Replace with the actual expected title
	    String actualTitle = Browser.driver.getTitle();
	    
	    Assert.assertEquals(actualTitle, expectedTitle, "Title mismatch!");
	}

	
	@And("User closes the Browser")
	public void user_closes_the_browser() {
      Browser.closeBrowser();

	}
}
