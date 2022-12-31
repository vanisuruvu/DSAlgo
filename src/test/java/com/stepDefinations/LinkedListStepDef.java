package com.stepDefinations;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import com.pageObjects.DS_IntroPage;
import com.pageObjects.LinkedListPage;
import com.utils.Helper;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LinkedListStepDef extends BaseClass {

WebDriver driver = Helper.getDriver();
	
	
	@Given("The user is at home page with title {string}")
	public void the_user_is_at_home_page_with_title(String title) {
		listPage = new LinkedListPage(Helper.getDriver());		
		Assert.assertEquals(title, Helper.getDriver().getTitle());
	}
	
	@When("user click on Get Started button in Linkedlist section")
	public void user_click_on_get_started_button_in_linkedlist_section() {
		listPage.clickGetStarted();
	}

	@Then("user should navigate to corresponding page with title {string}")
	public void user_should_navigate_to_corresponding_page_with_title(String title) {
		Assert.assertEquals(title, Helper.getDriver().getTitle());
	}

	@When("user click on Introduction")
	public void user_click_on_introduction() {
		listPage.clickIntroductionLink();
	}

	@When("user clicks on Try here")
	public void user_clicks_on_try_here() throws InterruptedException {
		ds_IntroPage = new DS_IntroPage(Helper.getDriver());
		ds_IntroPage.clickTryHereLink();

	}

	@When("user enters the Python code")
	public void user_enters_the_python_code(io.cucumber.datatable.DataTable pythonCode) throws InterruptedException {
		listPage=new LinkedListPage(Helper.getDriver());
		 List<List<String>>data=pythonCode.cells();
		 listPage.enterCode(data.get(0).get(0));
	}

	@When("user will click on run button")
	public void user_will_click_on_run_button() {		
		listPage.clickRunBtn();
	}
	
	@Then("User navigate back to page with title {string}")
	public void user_navigate_back_to_page_with_title(String url) {
		Helper.getDriver().get(url);
	}

	@When("user click on Creating Linked List")
	public void user_click_on_creating_linked_list() {
		listPage = new LinkedListPage(Helper.getDriver());
	    listPage.clickCreatingLinkedListLink();
	}
	
	@Then("user will navigate to corresponding page with title {string}")
	public void user_will_navigate_to_corresponding_page_with_title(String title) {
		Assert.assertEquals(title, Helper.getDriver().getTitle());

	}

	@When("user click on Types of Linked List")
	public void user_click_on_types_of_linked_list() {
		listPage = new LinkedListPage(Helper.getDriver());
	    listPage.clickTypesOfLinkedListLink();
	}
	
	@When("user click on Implement Linked List in Python")
	public void user_click_on_implement_linked_list_in_python() {
		listPage = new LinkedListPage(Helper.getDriver());
	    listPage.clickImplementLLInPythonLink();
	}
	
	@When("user click on Traversal link")
	public void user_click_on_traversal_link() {
		listPage = new LinkedListPage(Helper.getDriver());
		listPage.clickTraversalLink();
	}
		
	@When("user click on Insertion link")
	public void user_click_on_insertion_link() {
		listPage = new LinkedListPage(Helper.getDriver());
		listPage.clickInsertionLink();
	}
		
	@When("user click on Deletion link")
	public void user_click_on_deletion_link() {
		listPage = new LinkedListPage(Helper.getDriver());
		listPage.clickDeletionLink();
	}
	
}
