package com.stepDefinations;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.qameta.allure.Allure;


import java.io.ByteArrayInputStream;
import java.util.List;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import com.pageObjects.ArraysPage;
import com.utils.Helper;

public class ArraysStepDef extends BaseClass{

	WebDriver driver = Helper.getDriver();
	
	@Given("The user is in home page with title {string}")
	public void the_user_is_in_home_page_with_title(String string) {
		arrayPage= new ArraysPage(Helper.getDriver());
	}
	
	@Then("click on Get started button in array")
	public void click_on_get_started_button_in_array() throws InterruptedException {
		arrayPage.clickGetStartedBtn();
	}
	
	@Then("It should navigate to corresponding array page with title {string}")
	public void it_should_navigate_to_corresponding_array_page_with_title(String title) {
		Assert.assertEquals(Helper.getTitle(), title);
	}
	
	@Then("user click on array Try here")
	public void user_click_on_array_try_here() {
	    arrayPage.clickTryHereBtn();
	}
	
	@When("user click on Arrays in Phython")
	public void user_click_on_arrays_in_phython() {
		arrayPage.clickArraysInPythonLink();
	}
	
	
	@When("user enter the Python code")
	public void user_enter_the_python_code(io.cucumber.datatable.DataTable pythonCode) throws InterruptedException {
		arrayPage=new ArraysPage(Helper.getDriver());
		List<List<String>>data=pythonCode.cells();
		arrayPage.clearPythoncode();
		arrayPage.enterPythonCode(data.get(0).get(0));
	}
	
	@When("click on array run button")
	public void click_on_array_run_button() {
	    arrayPage.clickOnArrayRunbtn();
	}
	
	@Then("The result should be displayed below the run button")
	public void the_result_should_be_displayed_below_the_run_button() {
		Allure.addAttachment("Python output", new ByteArrayInputStream(((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES)));
	    driver.navigate().back();
	}
	
	@Then("User navigate back")
	public void user_navigate_back() {
		driver.navigate().back();
	}
	
	@When("User click on Arrays using list")
	public void user_click_on_arrays_using_list() {
		arrayPage= new ArraysPage(Helper.getDriver());
	    arrayPage.clickOnArrayUsingListLink();
	}
	
	@When("User click on Basic Operations in list")
	public void user_click_on_basic_operations_in_list() {
		arrayPage= new ArraysPage(Helper.getDriver());
		arrayPage.clickOnBasicOperationsInListsLink();
	}
	
	@When("User click on Applications of Array")
	public void user_click_on_applications_of_array() {
		arrayPage= new ArraysPage(Helper.getDriver());
		arrayPage.clickOnApplicationsOfArrayLink();
	}
	
	@When("user click on Practice Questions")
	public void user_click_on_practice_questions() {
		arrayPage= new ArraysPage(Helper.getDriver());
		arrayPage.clickOnPraticeQuestionsLink();
	}
	
	@When("user click on Search the array")
	public void user_click_on_search_the_array() {
		arrayPage= new ArraysPage(Helper.getDriver());
		arrayPage.clickOnSearchTheArrayLink();
	}
	
	@When("user clear the text and enter the Python code print\\({string})")
	public void user_clear_the_text_and_enter_the_python_code_print(String pythonCode) throws InterruptedException {
		arrayPage= new ArraysPage(Helper.getDriver());
		arrayPage.clearPythoncode();
		arrayPage.enterPythonCode(pythonCode);
	}
	
	@When("user click on Max Consecutive Ones")
	public void user_click_on_max_consecutive_ones() {
		arrayPage= new ArraysPage(Helper.getDriver());
		arrayPage.clickOnMaxConsecutiveLink();
	}
	
	@When("user click on Find Numbers with Even Number of Digits")
	public void user_click_on_find_numbers_with_even_number_of_digits() {
		arrayPage= new ArraysPage(Helper.getDriver());
		arrayPage.clickOnFindEvenLink();
	}
	
	@When("user click on Find Numbers with Squares of  a Sorted Array")
	public void user_click_on_find_numbers_with_squares_of_a_sorted_array() {
		arrayPage= new ArraysPage(Helper.getDriver());
		arrayPage.clickOnSortedArrayLink();
	}
	
	@When("^user clear the text and enter the examples Python code (.*)$")
	public void user_clear_the_text_and_enter_the_examples_python_code_print(String PythonCode) throws InterruptedException {
		arrayPage.clearPythoncode();
		System.out.println(PythonCode);
		arrayPage.enterPythonCode(PythonCode);
	}
}
