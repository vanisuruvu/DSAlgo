package com.stepDefinations;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebDriver;

import com.pageObjects.ArraysPage;
import com.pageObjects.GraphPage;
import com.utils.Helper;

import io.cucumber.java.Scenario;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import com.utils.Loggerload;

import context.TestContext;

public class GraphStepDef {

	WebDriver driver = Helper.getDriver();
	TestContext testContext;
	
	public GraphStepDef(TestContext testContext) {
		this.testContext = testContext;
	}
	
	@When("user click on Graph Representations")
	public void user_click_on_graph_representations() {
		testContext.initializePageObject(driver);
		testContext.getGraphPage().clickOnGraphRepresentation();
	}
	
	@When("user click on Get Started button on Graph")
	public void user_click_on_get_started_button_on_graph() {
		testContext.getGraphPage().clickGetStartedOnGraph();
	}
	
	@When("user click on Graph")
	public void user_click_on_graph() {
		testContext.getGraphPage().clickOnGraph();
	}
	
	@When("The user clicks the graph item from the drop down menu")
	public void the_user_clicks_the_graph_item_from_the_drop_down_menu() {
		testContext.getGraphPage().dropDownGraphClick();
	}
	
	@Given("The user is in Editor page and navigates to graph representations page")
	public void the_user_is_in_editor_page_and_navigates_to_graph_representations_page() {
		testContext.initializePageObject(driver);
		testContext.getArrayPage().navigateTo("graphrepresentationsurl");
	}
	
	@When("the user clicks on Practice Questions in graph representations page")
	public void the_user_clicks_on_practice_questions_in_graph_representations_page() {
		testContext.getGraphPage().clickOnGraphPracQuesLink();
	}
	
	@Then("The user is directed to graph Practice page")
	public void the_user_is_directed_to_graph_practice_page() {
		String Title = driver.getTitle();
		Loggerload.info("Title of current page is :" + Title);
		assertEquals(Title, "Practice Questions", "Title not matched");
	}
}
