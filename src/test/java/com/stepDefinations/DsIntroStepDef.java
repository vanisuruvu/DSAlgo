package com.stepDefinations;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import com.pageObjects.DS_IntroPage;
import com.pageObjects.LoginPage;
import com.pageObjects.StartPage;
import com.utils.Helper;

import context.TestContext;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class DsIntroStepDef {
	TestContext testContext;
	
	public DsIntroStepDef(TestContext testContext) {
		this.testContext = testContext;
	}
	
	@Given("user open browser and launch the url {string}")
	public void user_open_browser_and_launch_the_url(String url) {
		testContext.initializePageObject(testContext.getDriver());
		Helper.openPage(url); 		
	}
	
	@When("user click  {string} button")
	public void user_click_button(String getStartedText) throws Exception {
		testContext.getSp().clickGetStartedBtn();
	}
	
	@When("click on signin link")
	public void click_on_link ()throws Exception {
		testContext.getLoginPage().signInClick();
	}
	
	@When("user enters  {string} {string}")
	public void user_enters(String username, String password) throws InterruptedException {
		testContext.getLoginPage().enterUserName(username);
		testContext.getLoginPage().enterPassword(password);
	}
	
	@When("user click on login button")
	public void user_click_on_login_button() throws InterruptedException {
		testContext.getLoginPage().clickLogInBtn();
	}
	
	@When("user click on Get started button in Data Structure")
	public void user_click_on_get_started_button_in_data_structure() throws InterruptedException {
		testContext.getDs_IntroPage().clickGetStartedDs();
	}
	
	@Then("user will successfully navigate to corresponding page with title {string}")
	public void user_will_successfully_navigate_to_corresponding_page_with_title(String title) {
		 Assert.assertEquals(title, Helper.getDriver().getTitle());
	}
	
	@When("user click on Time Complexity")
	public void user_click_on_time_complexity() throws InterruptedException {
		testContext.getDs_IntroPage().clickTimeComplexityLink();
	}
	
	@When("user enter the python code")
	public void user_enter_the_python_code(io.cucumber.datatable.DataTable pythonCode) throws InterruptedException {
		 List<List<String>>data=pythonCode.cells();
		 testContext.getDs_IntroPage().enterCode(data.get(0).get(0)); 
	}	
	
	@Then("user is navigated to home page {string}")
	public void user_is_navigated_to_home_page(String url) {
	   Helper.getDriver().get(url);
	}

}