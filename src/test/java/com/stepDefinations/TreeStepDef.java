package com.stepDefinations;

import java.util.List;

import org.openqa.selenium.WebDriver;


import com.pageObjects.TreePage;
import com.utils.Helper;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TreeStepDef  extends BaseClass {

	WebDriver driver = Helper.getDriver();
	
	@When("user click on Get Started button in tree section")
	public void user_click_on_get_started_button_in_tree_section() {
		treePage = new TreePage(Helper.getDriver());	
		treePage.clickGetStarted();
	}
	@When("user click on overview of Trees")
	public void user_click_on_overview_of_trees() {
	    treePage.clickoverviewOfTreeslink();
	}
	
	@When("user enters the Python code in text editor")
	public void user_enters_the_python_code_in_text_editor(io.cucumber.datatable.DataTable pythonCode) throws InterruptedException {
		treePage=new TreePage(Helper.getDriver());
		List<List<String>>data=pythonCode.cells();
		treePage.enterCode(data.get(0).get(0));
	}
	
	@Then("User navigate back to tree page {string}")
	public void user_navigate_back_to_tree_page(String url) {
		Helper.getDriver().get(url);
	}
	
	@When("user click on Terminologies")
	public void user_click_on_terminologies() {
		treePage = new TreePage(Helper.getDriver());
	    treePage.clickTerminologiesLink();
	}
	
	@When("user click on Types of Trees")
	public void user_click_on_types_of_trees() {
		treePage = new TreePage(Helper.getDriver());
	    treePage.clickTypesOfTreesLink();
	}
	
	@When("user click on Tree Traversals")
	public void user_click_on_tree_traversals() {
		treePage = new TreePage(Helper.getDriver());
	    treePage.clickTreeTraversalsLink();
	}
	
	@When("user click on Traversals-Illustration")
	public void user_click_on_traversals_illustration() {
		treePage = new TreePage(Helper.getDriver());
	    treePage.clickTraversalsIllustrationLink();
	}
	
	@When("user click on Binary Trees")
	public void user_click_on_binary_trees() {
		treePage = new TreePage(Helper.getDriver());
	    treePage.clickBinaryTreesLink();
	}
	
	@When("user click on Types of Binary Trees")
	public void user_click_on_types_of_binary_trees() {
		treePage = new TreePage(Helper.getDriver());
	    treePage.clickTypesOfBinaryTreesLink();
	}
	
	@When("user click on Binary Tree Traversals")
	public void user_click_on_binary_tree_traversals() {
		treePage = new TreePage(Helper.getDriver());
	    treePage.clickBinaryTreeTraversalsLink();
	}
	
	@When("user click on Implementation in Python")
	public void user_click_on_implementation_in_python() {
		treePage = new TreePage(Helper.getDriver());
	    treePage.clickImplementationInPythonLink();
	}
	
	@When("user click on Applications of Binary trees")
	public void user_click_on_applications_of_binary_trees() {
		treePage = new TreePage(Helper.getDriver());
	    treePage.clickApplicationsOfBinaryTreesLink();
	}
	
	@When("user click on Implementation of Binary Trees")
	public void user_click_on_implementation_of_binary_trees() {
		treePage = new TreePage(Helper.getDriver());
	    treePage.clickImplementationOfBinaryTreesLink();
	}
	
	@When("user click on Binary Search Trees")
	public void user_click_on_binary_search_trees() {
		treePage = new TreePage(Helper.getDriver());
	    treePage.clickBinarySearchTreesLink();
	}
	
	@When("user click onImplementation Of BST")
	public void user_click_on_implementation_of_bst() {
		treePage = new TreePage(Helper.getDriver());
	    treePage.clickImplementationOfBSTLink();
	}
	
	
}
