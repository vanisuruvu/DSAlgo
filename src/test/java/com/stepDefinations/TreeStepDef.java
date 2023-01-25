package com.stepDefinations;

import java.util.List;

import org.openqa.selenium.WebDriver;


import com.pageObjects.TreePage;
import com.utils.Helper;

import context.TestContext;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TreeStepDef {

	TestContext testContext;
	
	public TreeStepDef(TestContext testContext) {
		this.testContext = testContext;
	}
	
	@When("user click on Get Started button in tree section")
	public void user_click_on_get_started_button_in_tree_section() {
			
		testContext.getTreePage().clickGetStarted();
	}
	@When("user click on overview of Trees")
	public void user_click_on_overview_of_trees() {
		testContext.getTreePage().clickoverviewOfTreeslink();
	}
	
	@When("user enters the Python code in text editor")
	public void user_enters_the_python_code_in_text_editor(io.cucumber.datatable.DataTable pythonCode) throws InterruptedException {
		List<List<String>>data=pythonCode.cells();
		testContext.getTreePage().enterCode(data.get(0).get(0));
	}
	
	@Then("User navigate back to tree page {string}")
	public void user_navigate_back_to_tree_page(String url) {
		testContext.getDriver().get(url);
	}
	
	@When("user click on Terminologies")
	public void user_click_on_terminologies() {
		testContext.initializePageObject(testContext.getDriver());
		testContext.getTreePage().clickTerminologiesLink();
	}
	
	@When("user click on Types of Trees")
	public void user_click_on_types_of_trees() {
		testContext.initializePageObject(testContext.getDriver());
		testContext.getTreePage().clickTypesOfTreesLink();
	}
	
	@When("user click on Tree Traversals")
	public void user_click_on_tree_traversals() {
		testContext.initializePageObject(testContext.getDriver());
		testContext.getTreePage().clickTreeTraversalsLink();
	}
	
	@When("user click on Traversals-Illustration")
	public void user_click_on_traversals_illustration() {
		testContext.initializePageObject(testContext.getDriver());
		testContext.getTreePage().clickTraversalsIllustrationLink();
	}
	
	@When("user click on Binary Trees")
	public void user_click_on_binary_trees() {
		testContext.initializePageObject(testContext.getDriver());
		testContext.getTreePage().clickBinaryTreesLink();
	}
	
	@When("user click on Types of Binary Trees")
	public void user_click_on_types_of_binary_trees() {
		testContext.initializePageObject(testContext.getDriver());
		testContext.getTreePage().clickTypesOfBinaryTreesLink();
	}
	
	@When("user click on Binary Tree Traversals")
	public void user_click_on_binary_tree_traversals() {
		testContext.initializePageObject(testContext.getDriver());
		testContext.getTreePage().clickBinaryTreeTraversalsLink();
	}
	
	@When("user click on Implementation in Python")
	public void user_click_on_implementation_in_python() {
		testContext.initializePageObject(testContext.getDriver());
		testContext.getTreePage().clickImplementationInPythonLink();
	}
	
	@When("user click on Applications of Binary trees")
	public void user_click_on_applications_of_binary_trees() {
		testContext.initializePageObject(testContext.getDriver());
		testContext.getTreePage().clickApplicationsOfBinaryTreesLink();
	}
	
	@When("user click on Implementation of Binary Trees")
	public void user_click_on_implementation_of_binary_trees() {
		testContext.initializePageObject(testContext.getDriver());
		testContext.getTreePage().clickImplementationOfBinaryTreesLink();
	}
	
	@When("user click on Binary Search Trees")
	public void user_click_on_binary_search_trees() {
		testContext.initializePageObject(testContext.getDriver());
		testContext.getTreePage().clickBinarySearchTreesLink();
	}
	
	@When("user click onImplementation Of BST")
	public void user_click_on_implementation_of_bst() {
		testContext.initializePageObject(testContext.getDriver());
		testContext.getTreePage().clickImplementationOfBSTLink();
	}
}
