package com.stepDefinations;

import static org.testng.Assert.assertEquals;

import java.util.List;

import org.openqa.selenium.WebDriver;

import com.utils.Loggerload;

import context.TestContext;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StackStepDef {
	
	TestContext testContext;
	
	public StackStepDef(TestContext testContext) {
		this.testContext = testContext;
	}
	

@When("user click on Get Started button in Stack section")
public void user_click_on_get_started_button_in_stack_section() {
    testContext.getStackPage().clickGetStarted();
}

@When("user click on operations in stack link")
public void user_click_on_operations_in_stack_link() {
	testContext.getStackPage().clickoperationInStackLink();
}
@When("user enter the Python code in text editor")
public void user_enter_the_python_code_in_text_editor(io.cucumber.datatable.DataTable pythonCode) throws InterruptedException {
	 List<List<String>>data=pythonCode.cells();
	 testContext.getListPage().enterCode(data.get(0).get(0));
}
@Then("User navigate back to page as title {string}")
public void user_navigate_back_to_page_as_title(String url) {
	
		testContext.getDriver().get(url);
	}

@When("user click on Implementation link")
public void user_click_on_implementation_link() {
	testContext.getStackPage().implementationLinkClick();
}

@When("user click on Applications link")
public void user_click_on_applications_link() {
	testContext.getStackPage().applicationsLinkClick();
}

@When("user enters invalid Python code in text editor")
public void user_enters_invalid_python_code_in_text_editor(io.cucumber.datatable.DataTable pythonCode) throws InterruptedException {
	 List<List<String>>data=pythonCode.cells();
	 testContext.getListPage().enterCode(data.get(0).get(0)); 
}
@Then("user should get error message")
public void user_should_get_error_message() {
	String actualMsg = testContext.getStackPage().getErrormsg();
	Loggerload.info("Actual result  :" + actualMsg);
	assertEquals(actualMsg,"NameError: name 'hello' is not defined on line 1", "Result do not match");
}

}


	



