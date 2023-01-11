package com.stepDefinations;

import static org.testng.Assert.assertEquals;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import com.pageObjects.LinkedListPage;
import com.pageObjects.StackPage;
import com.utils.Helper;
import com.utils.Loggerload;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StackStepDef extends BaseClass {
	WebDriver driver = Helper.getDriver();
	

@When("user click on Get Started button in Stack section")
public void user_click_on_get_started_button_in_stack_section() {
	stackPage = new StackPage(driver);
    stackPage.clickGetStarted();
}
//@Then("user should navigate to corresponding stack page with title {string}")
//public void user_should_navigate_to_corresponding_stack_page_with_title(String title) {
//	Assert.assertEquals(title, Helper.getDriver().getTitle());
//    
//}

@When("user click on operations in stack link")
public void user_click_on_operations_in_stack_link() {
	stackPage = new StackPage(driver);
   stackPage.clickoperationInStackLink();
}
@When("user enter the Python code in text editor")
public void user_enter_the_python_code_in_text_editor(io.cucumber.datatable.DataTable pythonCode) throws InterruptedException {
	listPage=new LinkedListPage(Helper.getDriver());
	 List<List<String>>data=pythonCode.cells();
	 listPage.enterCode(data.get(0).get(0));
}
@Then("User navigate back to page as title {string}")
public void user_navigate_back_to_page_as_title(String url) {
	
		Helper.getDriver().get(url);
	}

@When("user click on Implementation link")
public void user_click_on_implementation_link() {
	stackPage = new StackPage(driver);
    stackPage.implementationLinkClick();
}

@When("user click on Applications link")
public void user_click_on_applications_link() {
	stackPage = new StackPage(driver);
    stackPage.applicationsLinkClick();
}

@When("user enters invalid Python code in text editor")
public void user_enters_invalid_python_code_in_text_editor(io.cucumber.datatable.DataTable pythonCode) throws InterruptedException {
	listPage=new LinkedListPage(Helper.getDriver());
	 List<List<String>>data=pythonCode.cells();
	 listPage.enterCode(data.get(0).get(0)); 
}
@Then("user should get error message")
public void user_should_get_error_message() {
	stackPage = new StackPage(Helper.getDriver());
	String actualMsg = stackPage.getErrormsg();
	Loggerload.info("Actual result  :" + actualMsg);
	assertEquals(actualMsg,"NameError: name 'hello' is not defined on line 1", "Result do not match");
}

}


	



