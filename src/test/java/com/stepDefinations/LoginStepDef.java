package com.stepDefinations;

import org.testng.Assert;

import com.utils.Helper;

import context.TestContext;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginStepDef {
	
	TestContext testContext;
		
	public LoginStepDef(TestContext testContext) {
		this.testContext = testContext;
	}
	
	@Given("user opens browser and launch the url{string}")
	public void user_opens_browser_and_launch_the_url(String url) {
		testContext.initializePageObject(testContext.getDriver());
		Helper.openPage(url);   
		
	    	}
	@When("user click on {string} button")
	public void user_click_on_button(String getStartedText) throws Exception {
		testContext.getSp().clickGetStartedBtn();
	}
	

	@When("clicks on signin link")
	public void clicks_on_link ()throws Exception {
		testContext.getLoginPage().signInClick();
	}

	@Then("user will successfuly able to see signIn page")
	public void user_will_successfuly_able_to_see_sign_in_page() throws InterruptedException {
		  String actualText = testContext.getLoginPage().validateSignInPage();
		   Assert.assertEquals(actualText, "Login");
	}

	@When("user clicks on Register link on signIn page")
	public void user_clicks_on_register_link_on_sign_in_page() throws Exception {
		testContext.getLoginPage().registrationLinkClick();
	   
	}

	@Then("user should be successfully redirected to register page")
	public void user_should_be_successfully_redirected_to_register_page() {
		String actualText = testContext.getLoginPage().validateRegBtn();
		   Assert.assertEquals(actualText, "Register");
	}
	
	@When("user clicks on signin link")
	public void user_clicks_on_signin_link() throws Exception {
		testContext.getLoginPage().signInClick();
	}

	@When("user enters valid {string} {string}")
	public void user_enters_valid(String username, String password) throws InterruptedException {
		testContext.getLoginPage().enterUserName(username);
		testContext.getLoginPage().enterPassword(password);
	}
	
	@When("user will click on login button")
	public void user_will_click_on_login_button() throws InterruptedException {
		testContext.getLoginPage().clickLogInBtn();
	}

	
	@Then("user should be successfully able to see the messgae {string}")
	public void user_should_be_successfully_able_to_see_the_messgae(String string) {
		String actualText = testContext.getLoginPage().validateSuccessLoginMsg();
		   Assert.assertEquals(actualText, "You are logged in");
	}
	@Then("user will click on logOut button")
	public void user_will_click_on_log_out_button() throws InterruptedException {
		testContext.getLoginPage().clickSignOutLink();
	}
	@Then("user will successfully loggesOut")
	public void user_will_successfully_logges_out() {
		String actualText = testContext.getLoginPage().validateSuccessLogOutMsg();
		   Assert.assertEquals(actualText, "Logged out successfully");
	}
	
	@When("user click on signIn without entering anything on textbox")
	public void user_click_on_sign_in_without_entering_anything_on_textbox() throws InterruptedException {
		testContext.getLoginPage().clickLogInBtn();
	}
	@Then("user should get error msg {string}")
	public void user_should_get_error_msg(String errorMsg) throws InterruptedException {
		Assert.assertEquals(testContext.getLoginPage().validationEmptyFieldUserName(), "Please fill out this field.");
	}
	
	@When("user enters  {string}  and click on SignIn")
	public void user_enters_and_click_on_sign_in(String username) throws Exception {
		testContext.getLoginPage().enterUserName(username);
		testContext.getLoginPage().clickLogInBtn();
	}
	
	@Then("user should be able to see error message {string} below password field.")
	public void user_should_be_able_to_see_error_message_below_password_field(String username) throws InterruptedException {
		Assert.assertEquals(testContext.getLoginPage().validationEmptyFieldPassword(), "Please fill out this field.");
	}
	
	@When("user enters invalid {string} {string} and click on SignIn")
	public void user_enters_invalid_and_click_on_sign_in(String username, String password) throws InterruptedException {
		testContext.getLoginPage().enterUserName(username);
		testContext.getLoginPage().enterPassword(password);
		testContext.getLoginPage().clickLogInBtn();
	   
	}
	@Then("user should be able to see error message {string}")
	public void user_should_be_able_to_see_error_message(String text) {
		 Assert.assertEquals(text, "Invalid Username and Password");
	    
	}

}
