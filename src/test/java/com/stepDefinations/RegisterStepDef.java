package com.stepDefinations;

import org.testng.Assert;

import com.pageObjects.RegisterPage;
import com.utils.Helper;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class RegisterStepDef extends BaseClass {
	
	@Given("user opens browser and launch the url {string}")
	public void user_opens_browser_and_launch_the_url(String url) {
		registerPage = new RegisterPage(Helper.getDriver());
	    Helper.openPage(url);	    
	}
	
	@When("user clicks on {string} button")
	public void user_clicks_on_button(String getStartedText) throws Exception {
		registerPage.clickGetStarted();
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
	public void user_click_register_link_without_entering_anything() {

	}
	@Then("user should get fillout field error message {string} below password field.")
	public void user_should_get_fillout_field_error_message_below_password_field(String string) {
	
	}

	//  Scenario Outline: Register validation with invalid inputs/blank fields

	@When("user enters {string} {string} {string} with one or more fields blank inputs and click on register button")
	public void user_enters_with_one_or_more_fields_blank_inputs_and_click_on_register_button(String string, String string2, String string3) {
	    
	}
	// same error message  as Scenario: Register validation with invalid inputs 
	
	//Scenario Outline: Register validation with invalid inputs/ password mismatch
	@When("user enters {string} {string} {string} with mismatching passwords")
	public void user_enters_with_mismatching_passwords(String string, String string2, String string3) {
	    
	}
	@Then("user should get a password mismatch error message {string}")
	public void user_should_get_a_password_mismatch_error_message(String string) {

	}
	
	//Scenario Outline: Register validation with invalid inputs/ password format less than 8 characters
	@When("user enters {string} {string} {string} password less than eight characters")
	public void user_enters_password_less_than_eight_characters(String string, String string2, String string3) {
	   
	}
	@Then("user should get password atleast {int} char error message {string}")
	public void user_should_get_password_atleast_char_error_message(Integer int1, String string) {
	    
	}
	//  Scenario Outline: Register validation with invalid inputs/  password format all numeric
	@When("user enters {string} {string} {string} password with all numeric input")
	public void user_enters_password_with_all_numeric_input(String string, String string2, String string3) {
	    
	}
	@Then("user should get enter valid input error message {string}")
	public void user_should_get_enter_valid_input_error_message(String string) {
	  
	}
	
	//Scenario Outline: Register validation with invalid inputs/ similar fields
	@When("user enters the {string} {string} {string} all similar to one another")
	public void user_enters_the_all_similar_to_one_another(String string, String string2, String string3) {
	   
	}
	@Then("user should get password not similar to username error message {string}")
	public void user_should_get_password_not_similar_to_username_error_message(String string) {
	   
	}
	

}



