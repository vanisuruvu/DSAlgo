package com.stepDefinations;


import java.util.List;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import com.pageObjects.LinkedListPage;
import com.utils.Helper;

import context.TestContext;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LinkedListStepDef  {

WebDriver driver = Helper.getDriver();
	TestContext testContext;
	
	public LinkedListStepDef(TestContext testContext) {
		this.testContext = testContext;
	}
	
	@When("user click on Get Started button in Linkedlist section")
	public void user_click_on_get_started_button_in_linkedlist_section() {
		testContext.getListPage().clickGetStarted();
	}

	@Then("user should navigate to corresponding page with title {string}")
	public void user_should_navigate_to_corresponding_page_with_title(String title) {
		Assert.assertEquals(title, Helper.getDriver().getTitle());
	}

	@When("user click on Introduction")
	public void user_click_on_introduction() {
		testContext.getListPage().clickIntroductionLink();
	}

	@When("user enters the Python code")
	public void user_enters_the_python_code(io.cucumber.datatable.DataTable pythonCode) throws InterruptedException {
		 List<List<String>>data=pythonCode.cells();
		 testContext.getListPage().enterCode(data.get(0).get(0));
	}
	
	@Then("User navigate back to page with title {string}")
	public void user_navigate_back_to_page_with_title(String url) {
		Helper.getDriver().get(url);
	}

	@When("user click on Creating Linked List")
	public void user_click_on_creating_linked_list() {
		testContext.initializePageObject(driver);
		testContext.getListPage().clickCreatingLinkedListLink();
	}
	
	@Then("user will navigate to corresponding page with title {string}")
	public void user_will_navigate_to_corresponding_page_with_title(String title) {
		Assert.assertEquals(title, Helper.getDriver().getTitle());

	}
	
	@When("user click on Types of Linked List")
	public void user_click_on_types_of_linked_list() {
		testContext.initializePageObject(driver);
		testContext.getListPage().clickTypesOfLinkedListLink();
	}
	
	@When("user click on Implement Linked List in Python")
	public void user_click_on_implement_linked_list_in_python() {
		testContext.initializePageObject(driver);
		testContext.getListPage().clickImplementLLInPythonLink();
	}
	
	@When("user click on Traversal link")
	public void user_click_on_traversal_link() {
		testContext.initializePageObject(driver);
		testContext.getListPage().clickTraversalLink();
	}
		
	@When("user click on Insertion link")
	public void user_click_on_insertion_link() {
		testContext.initializePageObject(driver);
		testContext.getListPage().clickInsertionLink();
	}
		
	@When("user click on Deletion link")
	public void user_click_on_deletion_link() {
		testContext.initializePageObject(driver);
		testContext.getListPage().clickDeletionLink();
	}
	
}
