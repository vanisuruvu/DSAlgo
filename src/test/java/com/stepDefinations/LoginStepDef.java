package com.stepDefinations;

import org.testng.Assert;

import com.pageObjects.LoginPage;
import com.pageObjects.StartPage;
import com.utils.Helper;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginStepDef extends BaseClass {
	
	@Given("user opens browser and launch the url{string}")
	public void user_opens_browser_and_launch_the_url(String url) {
		loginPage= new LoginPage(Helper.getDriver());
		Helper.openPage(url);   
		
	    	}
	

	@When("clicks on {string} link")
	public void clicks_on_link(String string) throws Exception {
	   loginPage.signInClick();
	}

	@Then("user will successfuly able to see signIn page")
	public void user_will_successfuly_able_to_see_sign_in_page() {
		  String actualText = loginPage.validateSignInPage();
		   Assert.assertEquals(actualText, "Login");
	}

	@When("user clicks on Register link on signIn page")
	public void user_clicks_on_register_link_on_sign_in_page() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("user should be successfully redirected to register page")
	public void user_should_be_successfully_redirected_to_register_page() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("user enters valid {string} {string}")
	public void user_enters_valid(String string, String string2) {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("user should be successfully able to see the messgae {string}")
	public void user_should_be_successfully_able_to_see_the_messgae(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

}
