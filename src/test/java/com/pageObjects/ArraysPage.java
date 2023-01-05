package com.pageObjects;

import java.io.IOException;
import java.time.Duration;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import com.utils.Helper;
import com.utils.Utils;
import io.cucumber.java.BeforeAll;
import com.utils.ConfigReader;

import com.utils.Loggerload;

public class ArraysPage {
	
	public ArraysPage(WebDriver webDriver) {
		PageFactory.initElements(webDriver, this);
	}
	WebDriver driver = Helper.getDriver();
	
	@FindBy(xpath ="//a[@href='array']")
	WebElement getStartedArrayBt; 
	
	@FindBy(xpath ="//a[text()='Arrays in Python']")
	WebElement arraysInPythonLink;
	
	@FindBy(partialLinkText = "Try here")
	WebElement tryHereBtn;
	
	@FindBy (xpath ="//textarea[@tabindex='0']")
	WebElement textEditor;
	
	@FindBy (xpath ="//*[@id='answer_form']")
	WebElement answerForm;
	
	@FindBy(xpath="//a[text()='Arrays Using List']")
	WebElement arraysUsingListLink;
	
	@FindBy(xpath = "//a[text()='Basic Operations in Lists']")
	WebElement basicOperationsInListsLink;
			
	@FindBy(xpath ="//a[text()='Applications of Array']")
	WebElement applicationsofArrayLink;
		
	@FindBy(xpath ="//button[text()='Run']")
	WebElement runBtn;
	
	@FindBy(xpath="//*[@class='button']")
	WebElement submitButton;
	
	@FindBy(xpath ="//a[text()='Practice Questions']")
	WebElement praticeQuestionsLink;
	
	@FindBy(xpath ="//a[text()='Search the array']")
	WebElement searchtheArrayLink;
	
	@FindBy(xpath ="//a[text()='Max Consecutive Ones']")
	WebElement maxConsecutiveLink;
	
	@FindBy(xpath ="//a[text()='Find Numbers with Even Number of Digits']")
	WebElement findEvenLink;
	
	@FindBy(xpath ="//a[text()='Squares of  a Sorted Array']")
	WebElement sortedArrayLink;
	
	@FindBy(id="output")
	WebElement output;
	
	public void clickGetStartedBtn() throws InterruptedException {
		Thread.sleep(1000);
		Utils.webClick(getStartedArrayBt);
	}
	public void clickArraysInPythonLink() {
		Utils.webClick(arraysInPythonLink);
	}
	public void clickTryHereBtn() {
		Utils.webClick(tryHereBtn);
	}
	
	public void clickOnArrayUsingListLink() {
		Utils.webClick(arraysUsingListLink);
	}
	
	public void clickOnBasicOperationsInListsLink() {
		Utils.webClick(basicOperationsInListsLink);
	}
	
	public void clickOnApplicationsOfArrayLink() {
		Utils.webClick(applicationsofArrayLink);
	}
	public void clickOnArrayRunbtn() {
		Utils.webClick(runBtn);
	}
	
	public void clickOnPraticeQuestionsLink() {
		Utils.webClick(praticeQuestionsLink);
	}
	public void clickOnSearchTheArrayLink() {
		Utils.webClick(searchtheArrayLink);
	}
	public void clickOnMaxConsecutiveLink() {
		Utils.webClick(maxConsecutiveLink);
	}
	public void clickOnFindEvenLink() {
		Utils.webClick(findEvenLink);
	}
	public void clickOnSortedArrayLink() {
		Utils.webClick(sortedArrayLink);
	}
		
	public void enterPythonCode(String pythonCode) {
		Utils.enterPythonCode(textEditor, pythonCode);
	}
	
	public void enterPythonCode(String sheetName, int rowNumber) throws InvalidFormatException, IOException {
		String code = Utils.getCodefromExcel(sheetName, rowNumber);
		Utils.enterPythonCode(textEditor, code);
	}
	
	public void clickOnSubmitButton() {
		Loggerload.info("Click on Submit button");
		submitButton.click();
	}
	public void enterCodePractice(String sheetName, int rowNumber) throws InvalidFormatException, IOException {
		String code = Utils.getCodefromExcel(sheetName, rowNumber);
		Utils.enterCodePractice(textEditor, answerForm, code);
	}
	public String getActualResult() {
		Utils.waitForElement(output);
		return output.getText();
	}
	
	public String getExpectedResult(String sheetName, Integer rowNum) throws InvalidFormatException, IOException {
		String expectedResult = Utils.getResultfromExcel(sheetName, rowNum);
		return expectedResult;
	}
	
	public void navigateTo(String pagename) {
		String urlName = ConfigReader.geturl(pagename);
		driver.get(urlName);
	}
	
	public String getErrorText() {
		String errorMsg = driver.switchTo().alert().getText();
		driver.switchTo().alert().accept();
		return errorMsg;

	}
}



