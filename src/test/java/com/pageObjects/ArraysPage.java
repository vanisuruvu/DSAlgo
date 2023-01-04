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
	
	public void enterCodePractice(String sheetName, int rowNumber) throws InvalidFormatException, IOException {
		String code = Utils.getCodefromExcel(sheetName, rowNumber);
		Utils.enterCodePractice(textEditor, answerForm, code);
	}
	
}



