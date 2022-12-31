package com.stepDefinations;

import org.testng.Assert;

import com.pageObjects.RegisterPage;
import com.pageObjects.StartPage;
import com.utils.Helper;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class RegisterStepDef extends BaseClass {
	
	@Given("user opens browser and launch the url {string}")
	public void user_opens_browser_and_launch_the_url(String url) {
		registerPage = new RegisterPage(Helper.getDriver());
		sp = new StartPage(Helper.getDriver());
	    Helper.openPage(url);	    
	}
	
	@When("user clicks on {string} button")
	public void user_clicks_on_button(String getStartedText) throws Exception {
		sp.clickGetStartedBtn();
	}
	@When("clicks on register link")
	public void clicks_on_register_link() throws Exception {
		registerPage.clickRegisterLink();
	}
	@Then("user should successfully able to see register page title {string}")
	public void user_should_successfully_able_to_see_register_page_title(String registrationText) {
		Assert.assertEquals(Helper.getTitle(), registrationText);
	}
	@When("user enter the {string}, {string}, {string}")
	public void user_enter_the(String username, String password1, String password2) throws Exception {
		registerPage.sendUsernameText(username);
		registerPage.sendPasswordText1(password1);
		registerPage.sendPasswordText2(password2);
	}
	@When("user click on register button")
	public void user_click_on_register_button() throws Exception {
		registerPage.clickRegisterButton();
	}
	@Then("user should be successfully able to see the label as {string}")
	public void user_should_be_successfully_able_to_see_the_label_as(String text) {
		Assert.assertEquals(registerPage.getNewAccountCreatedLabelText().contains(text), true);
		
	}
	@Then("user click on Sign Out")
	public void user_click_on_sign_out() throws Exception {
		registerPage.clickSignOutLink();
	}
	
	
	//Scenario: Register validation with invalid inputs
	@When("user click register link without entering anything")
	public void user_click_register_link_without_entering_anything() throws Exception {
		registerPage.clickRegisterButton();
	}
	@Then("user should get fillout field error message {string} below username field.")
	public void user_should_get_fillout_field_error_message_below_password_field(String errorMsg) throws InterruptedException {
		//Assert.assertEquals(registerPage.validationEmptyFields(), errorMsg);
		Assert.assertEquals(registerPage.validationEmptyFields(), "Please fill out this field.");
		
	}

	//  Scenario Outline: Register validation with invalid inputs/blank fields

	@When("user enters {string} with username and click on register button")
	public void user_enters_with_username_and_click_on_register_button(String userName) throws Exception {
		registerPage.sendUsernameText(userName);
	    registerPage.clickRegisterButton();
	}
	@Then("user should get fillout field error message {string}")
	public void user_should_get_fillout_field_error_message(String string) throws InterruptedException {
		Assert.assertEquals(registerPage.validationEmptyFieldspassword1(), "Please fill out this field.");
  
	}
	
	@When("user enters {string} {string}  with username and password fields  and click on register button")
	public void user_enters_with_username_and_password_fields_and_click_on_register_button(String userName, String password) throws Exception {
		registerPage.sendUsernameText(userName);
	    registerPage.sendPasswordText1(password);
	    registerPage.clickRegisterButton();
	}
	@Then("user should get error message password confirmation {string}")
	public void user_should_get_error_message_password_confirmation(String string) throws Exception {
		Assert.assertEquals(registerPage.validationEmptyFieldspassword2(), "Please fill out this field."); 
	}
	
	@When("user enters  {string} {string} with password,password confirmation fields blank inputs and click on register button")
	public void user_enters_with_password_password_confirmation_fields_blank_inputs_and_click_on_register_button(String password, String password2) throws Exception {
		registerPage.sendPasswordText1(password);
	    registerPage.sendPasswordText2(password2);
	    registerPage.clickRegisterButton();
	}
	@Then("user should get error message user name {string}")
	public void user_should_get_error_message_user_name(String string) throws Exception {
		Assert.assertEquals(registerPage.validationEmptyFields(), "Please fill out this field.");
	}
	
	@When("user enters  {string}  with password field  and click on register button")
	public void user_enters_with_password_field_and_click_on_register_button(String password) throws Exception {
		registerPage.sendPasswordText1(password);
	    registerPage.clickRegisterButton();

	}
	@Then("user should get error message under user name  {string}")
	public void user_should_get_error_message_under_user_name(String string) throws Exception {
		Assert.assertEquals(registerPage.validationEmptyFields(), "Please fill out this field."); 
	}
	@When("user enters {string} with passwordconfirmation and click on register button")
	public void user_enters_with_passwordconfirmation_and_click_on_register_button(String password2) throws Exception {
		registerPage.sendPasswordText2(password2);
	    registerPage.clickRegisterButton();
	}
	@Then("user will get error message username {string}")
	public void user_will_get_error_message_username(String string) throws Exception {
		Assert.assertEquals(registerPage.validationEmptyFields(), "Please fill out this field.");
	}
	@When("user enters {string} {string} {string} with mismatching passwords")
	public void user_enters_with_mismatching_passwords(String userName, String password, String password2) throws Exception {
	    registerPage.sendUsernameText(userName);
	    registerPage.sendPasswordText1(password);
	    registerPage.sendPasswordText2(password2);
	    registerPage.clickRegisterButton();
	}
	@Then("user should get a password mismatch error message {string}")
	public void user_should_get_a_password_mismatch_error_message(String string) throws Exception {
		Assert.assertEquals(registerPage.validationPwdMismatch(), "Please fill out this field.");
	}
}



