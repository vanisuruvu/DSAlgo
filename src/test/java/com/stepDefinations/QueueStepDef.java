package com.stepDefinations;

import static org.testng.Assert.assertEquals;

import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.testng.Assert;

import com.utils.Loggerload;

import context.TestContext;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;;

public class QueueStepDef {

	String expectedMsg;
	TestContext testContext;
	
	public QueueStepDef(TestContext testContext) {
		this.testContext = testContext;
	}
	
	@Given("The user is in home page with title {string}")
	public void the_user_is_in_home_page_with_title(String title) {
		Assert.assertEquals(title, testContext.getDriver().getTitle());
	}
	
	@When("user click on Get Started button on Queue")
	public void user_click_on_get_started_button_on_queue() {
		testContext.initializePageObject(testContext.getDriver());
		testContext.getQueuePage().clickOnGetStartedQueue();
		
	}
	
	@When("user click on Implementation of Queue in Python")
	public void user_click_on_implementation_of_queue_in_python() {
		testContext.getQueuePage().clickOnImplementationOfQueue();
	}
	
	@When("user click on Queue Operations")
	public void user_click_on_queue_operations() {
		testContext.initializePageObject(testContext.getDriver());
		testContext.getQueuePage().clickOnQueueOperations();
	}
	
	@When("user click on Implementation using collections.deque")
	public void user_click_on_implementation_using_collections_deque() {
		testContext.initializePageObject(testContext.getDriver());
		testContext.getQueuePage().clickOnImplentationCollection();
	}
	
	@When("user click on Implementation using array")
	public void user_click_on_implementation_using_array() {
		testContext.initializePageObject(testContext.getDriver());
		testContext.getQueuePage().clickOnImplementationArray();
	}

	@Given("The user is in Editor page and navigates to QueueOp page")
	public void the_user_is_in_editor_page_and_navigates_to_queue_op_page() {
		testContext.initializePageObject(testContext.getDriver());
		testContext.getQueuePage().navigateToQPracQuesPage();
	}
	
	@When("the user clicks on Practice Questions")
	public void the_user_clicks_on_practice_questions() {
		testContext.getQueuePage().clickOnPracticeQuestionsLink();
	}
	
	@Then("The user is directed to Practice page")
	public void the_user_is_directed_to_practice_page() {
		String Title = testContext.getDriver().getTitle();
		Loggerload.info("User is in " + Title );
		assertEquals(Title, "Practice Questions", "Title not matched");
	}

	@Given("The user is in a page having an Editor with a Run button to test")
	public void the_user_is_in_a_page_having_an_editor_with_a_run_button_to_test() {
		testContext.initializePageObject(testContext.getDriver());
		testContext.getQueuePage().navigateToEditorUrl();
	}
	
	@When("The user enters valid python code in Editor from sheet {string} and {int}")
	public void the_user_enters_valid_python_code_in_editor_from_sheet_and(String sheetName, Integer rowNum) throws InvalidFormatException, IOException {
		testContext.getQueuePage().enterPythonCode(sheetName, rowNum);
		expectedMsg = testContext.getQueuePage().getExpectedResult(sheetName, rowNum);
	}
	
	@Then("The user is presented with the result after run button is clicked")
	public void the_user_is_presented_with_the_result_after_run_button_is_clicked() {
		Loggerload.info("Expected result - Excel Sheet :  " + expectedMsg);
		String actualMsg = testContext.getQueuePage().getActualResult();
		Loggerload.info("Actual result  :" + actualMsg);
		assertEquals(actualMsg, expectedMsg);
	}

	@When("The user enters invalid python code in Editor from sheet {string} and {int}")
	public void the_user_enters_invalid_python_code_in_editor_from_sheet_and(String sheetName, Integer rowNum) throws InvalidFormatException, IOException {
		testContext.getQueuePage().enterPythonCode(sheetName, rowNum);
	}

}
