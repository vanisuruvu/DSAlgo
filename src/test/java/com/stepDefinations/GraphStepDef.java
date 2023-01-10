package com.stepDefinations;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebDriver;

import com.pageObjects.ArraysPage;
import com.pageObjects.GraphPage;
import com.utils.Helper;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import com.utils.Loggerload;

public class GraphStepDef extends BaseClass{

	WebDriver driver = Helper.getDriver();
	
	@When("user click on Graph Representations")
	public void user_click_on_graph_representations() {
		graphPage= new GraphPage(Helper.getDriver());
		graphPage.clickOnGraphRepresentation();
	}
	
	@When("user click on Get Started button on Graph")
	public void user_click_on_get_started_button_on_graph() {
		graphPage= new GraphPage(Helper.getDriver());
		graphPage.clickGetStartedOnGraph();
	}
	
	@When("user click on Graph")
	public void user_click_on_graph() {
	    graphPage.clickOnGraph();
	}
	
	@When("The user clicks the graph item from the drop down menu")
	public void the_user_clicks_the_graph_item_from_the_drop_down_menu() {
		graphPage = new GraphPage(driver);
		graphPage.dropDownGraphClick();
	}
	
	@Given("The user is in Editor page and navigates to graph representations page")
	public void the_user_is_in_editor_page_and_navigates_to_graph_representations_page() {
		arrayPage = new ArraysPage(driver);
	    arrayPage.navigateTo("graphrepresentationsurl");
	}
	
	@When("the user clicks on Practice Questions in graph representations page")
	public void the_user_clicks_on_practice_questions_in_graph_representations_page() {
		graphPage = new GraphPage(driver);
	    graphPage.clickOnGraphPracQuesLink();
	}
	
	@Then("The user is directed to graph Practice page")
	public void the_user_is_directed_to_graph_practice_page() {
		String Title = driver.getTitle();
		Loggerload.info("Title of current page is :" + Title);
		assertEquals(Title, "Practice Questions", "Title not matched");
	}
}
