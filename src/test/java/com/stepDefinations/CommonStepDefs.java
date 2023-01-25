package com.stepDefinations;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import com.pageObjects.ArraysPage;
import com.pageObjects.DS_IntroPage;
import com.pageObjects.LinkedListPage;
import com.pageObjects.QueuePage;
import com.pageObjects.StackPage;
import com.pageObjects.TreePage;
import com.utils.Helper;
import com.utils.Loggerload;

import context.TestContext;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CommonStepDefs {

	Scenario s;
	TestContext testContext;
	
	public CommonStepDefs(TestContext testContext) {
		this.testContext = testContext;
	}
	
	@When("user clicks on Try here")
	public void user_clicks_on_try_here() throws InterruptedException {
		testContext.getDs_IntroPage().clickTryHereLink();	

	}

	@Given("The user is at home page with title {string}")
	public void the_user_is_at_home_page_with_title(String title) {
		
		testContext.initializePageObject(testContext.getDriver());
		System.out.println("title of page :"+testContext.getDriver().getTitle());
		Assert.assertEquals(title, testContext.getDriver().getTitle());

	}

	@When("click on run button")
	public void click_on_run_button() throws InterruptedException {
		testContext.getDs_IntroPage().clickRunBtn();
	}

	@Then("It should navigate to corresponding page with title {string}")
	public void it_should_navigate_to_corresponding_page_with_title(String title) {
		Assert.assertEquals(Helper.getTitle(), title);
	}

	@Then("The user gets an error message")
	public void the_user_gets_an_error_message() {
		Loggerload.info("Invalid code is taken from excel and clicked on run button");
		
		String actualMsg = testContext.getArrayPage().getErrorText();
		Loggerload.info("Error message for invalid python code is -" + actualMsg);
		assertEquals(actualMsg,"NameError: name 'hello' is not defined on line 1", "Result do not match");
	}
}
