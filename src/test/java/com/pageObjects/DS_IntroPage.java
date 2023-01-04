package com.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.utils.Utils;

public class DS_IntroPage {
	public DS_IntroPage(WebDriver webDriver) {
		PageFactory.initElements(webDriver, this);
	}
	
	@FindBy(xpath ="//h5[text()='Data Structures-Introduction']/..//a[text()='Get Started']")
	WebElement getStartedLinkDs;
	
	@FindBy(xpath ="//a[text()='Time Complexity']")
	WebElement timeComplexityLink;
	
	@FindBy(xpath ="//a[text()='Try here>>>']")
	WebElement tryHereLink;
	
	@FindBy (xpath ="//form/div/div/div/textarea")
	WebElement editor; 
	
	@FindBy (xpath ="//form/div/div/div/textarea")
	WebElement textEditor; 
	
	@FindBy(xpath ="//button[text()='Run']")
	WebElement runBtn;
	
	public void clickGetStartedDs() throws InterruptedException {
		Thread.sleep(1000);
		Utils.webClick(getStartedLinkDs);
	}
	
	public void clickTimeComplexityLink() throws InterruptedException {
		Thread.sleep(1000);
		Utils.webClick(timeComplexityLink);
	}
	
	public void clickTryHereLink() throws InterruptedException {
		Thread.sleep(1000);
		Utils.webClick(tryHereLink);
	}
	
	public void enterCode(String pythonCode) throws InterruptedException {
		Utils.enterPythonCode(textEditor, pythonCode);
	} 
	
	public void clickRunBtn() throws InterruptedException {
		Thread.sleep(1000);
		Utils.webClick(runBtn);
	}
	

}
