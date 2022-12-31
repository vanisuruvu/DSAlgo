package com.pageObjects;

	import org.openqa.selenium.Keys;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.support.FindBy;
	import org.openqa.selenium.support.PageFactory;

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
		
		@FindBy (xpath ="//form/div/div/div/textarea")
		WebElement textEditor;
		
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
//		public void enterCodeInTextEditor(String PythonCode) {
//			textEditor.sendKeys(Keys.TAB, Keys.SHIFT,Keys.TAB, Keys.SHIFT,PythonCode);
//		}
		
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
		
		public void clearPythoncode() throws InterruptedException {
			Thread.sleep(1000);
			System.out.println("************************************clear Code*************************");
			textEditor.sendKeys(Keys.CONTROL,"a");
			textEditor.sendKeys(Keys.DELETE);
		}

		public void enterPythonCode(String pythoncode) {
			System.out.println("************************************Phython code**************************");
			textEditor.sendKeys(pythoncode);
		}
	}



