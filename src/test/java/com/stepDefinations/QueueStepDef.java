package com.stepDefinations;

import org.testng.Assert;

import static org.testng.Assert.assertEquals;

import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.WebDriver;

import com.pageObjects.QueuePage;
import com.utils.Helper;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import com.utils.Loggerload;;

public class QueueStepDef extends BaseClass{

	WebDriver driver = Helper.getDriver();
	String expectedMsg;
	
	@Given("The user is in home page with title {string}")
	public void the_user_is_in_home_page_with_title(String title) {
		Assert.assertEquals(title, driver.getTitle());
	}
	
	@When("user click on Get Started button on Queue")
	public void user_click_on_get_started_button_on_queue() {
		queuePage = new QueuePage(driver);
		queuePage.clickOnGetStartedQueue();
		
	}
	
	@When("user click on Implementation of Queue in Python")
	public void user_click_on_implementation_of_queue_in_python() {
		queuePage = new QueuePage(driver);
		queuePage.clickOnImplementationOfQueue();
	}
	
	@When("user click on Queue Operations")
	public void user_click_on_queue_operations() {
	    queuePage = new QueuePage(driver);
	    queuePage.clickOnQueueOperations();
	}
	
	@When("user click on Implementation using collections.deque")
	public void user_click_on_implementation_using_collections_deque() {
		queuePage = new QueuePage(driver);
		queuePage.clickOnImplentationCollection();
	}
	
	@When("user click on Implementation using array")
	public void user_click_on_implementation_using_array() {
	    queuePage = new QueuePage(driver);
	    queuePage.clickOnImplementationArray();
	}

	@Given("The user is in Editor page and navigates to QueueOp page")
	public void the_user_is_in_editor_page_and_navigates_to_queue_op_page() {
		queuePage = new QueuePage(driver);
		queuePage.navigateToQPracQuesPage();
	}
	
	@When("the user clicks on Practice Questions")
	public void the_user_clicks_on_practice_questions() {
	    queuePage = new QueuePage(driver);
		queuePage.clickOnPracticeQuestionsLink();
	}
	
	@Then("The user is directed to Practice page")
	public void the_user_is_directed_to_practice_page() {
		String Title = driver.getTitle();
		Loggerload.info("User is in " + Title );
		assertEquals(Title, "Practice Questions", "Title not matched");
	}

	@Given("The user is in a page having an Editor with a Run button to test")
	public void the_user_is_in_a_page_having_an_editor_with_a_run_button_to_test() {
	    queuePage = new QueuePage(driver);
		queuePage.navigateToEditorUrl();
	}
	
	@When("The user enters valid python code in Editor from sheet {string} and {int}")
	public void the_user_enters_valid_python_code_in_editor_from_sheet_and(String sheetName, Integer rowNum) throws InvalidFormatException, IOException {
		queuePage = new QueuePage(driver);
		queuePage.enterPythonCode(sheetName, rowNum);
		expectedMsg = queuePage.getExpectedResult(sheetName, rowNum);
	}
	
	@Then("The user is presented with the result after run button is clicked")
	public void the_user_is_presented_with_the_result_after_run_button_is_clicked() {
		Loggerload.info("Expected result - Excel Sheet :  " + expectedMsg);
		String actualMsg = queuePage.getActualResult();
		Loggerload.info("Actual result  :" + actualMsg);
		assertEquals(actualMsg, expectedMsg);
	}

	@When("The user enters invalid python code in Editor from sheet {string} and {int}")
	public void the_user_enters_invalid_python_code_in_editor_from_sheet_and(String sheetName, Integer rowNum) throws InvalidFormatException, IOException {
		queuePage = new QueuePage(driver);
		queuePage.enterPythonCode(sheetName, rowNum);
	}

}
