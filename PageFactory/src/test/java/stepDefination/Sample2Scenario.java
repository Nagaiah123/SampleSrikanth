package stepDefination;

import org.testng.Assert;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import locaters.Page2Objects;
import pages.Page1;
import pages.Page2;

public class Sample2Scenario 
{
	@When("User enters  {string} the username")
	public void user_enters_the_username(String string) {
	 Page1.enterusername(string);  
	}

	@And("User enters {string} the password")
	public void user_enters_the_password(String string) {
	    Page1.enterpassword(string);
	}

	@And("User clicks on the Login button")
	public void user_clicks_on_the_login_button() {
	  Page1.click();
	}

	@Then("User verifies the Profile Account")
	public void user_verifies_the_profile_account() throws InterruptedException {
//	   Assert.assertEquals(Page2.Username(), "manda user");
	}




}
