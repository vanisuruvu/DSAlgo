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

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CommonStepDefs extends BaseClass {


	WebDriver driver = Helper.getDriver();

	@When("user clicks on Try here")
	public void user_clicks_on_try_here() throws InterruptedException {
		ds_IntroPage = new DS_IntroPage(driver);
		//listPage = new LinkedListPage(driver);
		ds_IntroPage.clickTryHereLink();	

	}

	@Given("The user is at home page with title {string}")
	public void the_user_is_at_home_page_with_title(String title) {
		listPage = new LinkedListPage(driver);	
		stackPage = new StackPage(driver);
		treePage = new TreePage(driver);
		System.out.println("title of page :"+driver.getTitle());
		Assert.assertEquals(title, driver.getTitle());

	}

	@When("click on run button")
	public void click_on_run_button() throws InterruptedException {
		ds_IntroPage = new DS_IntroPage(driver);
		queuePage = new QueuePage(driver);
		ds_IntroPage.clickRunBtn();
	}

	@Then("It should navigate to corresponding page with title {string}")
	public void it_should_navigate_to_corresponding_page_with_title(String title) {
		listPage = new LinkedListPage(driver);	
		stackPage = new StackPage(driver);
		arrayPage = new ArraysPage(driver);
		ds_IntroPage = new DS_IntroPage(driver);

		Assert.assertEquals(Helper.getTitle(), title);
	}

	@Then("The user gets an error message")
	public void the_user_gets_an_error_message() {
		Loggerload.info("Invalid code is taken from excel and clicked on run button");
		arrayPage = new ArraysPage(driver);
		String actualMsg = arrayPage.getErrorText();
		Loggerload.info("Error message for invalid python code is -" + actualMsg);
		assertEquals(actualMsg,"NameError: name 'hello' is not defined on line 1", "Result do not match");
	}
}
