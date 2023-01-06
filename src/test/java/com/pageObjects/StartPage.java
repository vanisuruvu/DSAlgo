package com.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.stepDefinations.BaseClass;
import com.utils.Helper;
import com.utils.Loggerload;
import com.utils.Utils;

public class StartPage extends BaseClass {
	
	public StartPage(WebDriver webDriver) {
		PageFactory.initElements(webDriver, this);
	}
	
	@FindBy(xpath = "//button[text()='Get Started']")
	@CacheLookup
	WebElement getStartedBtn;
	
	@FindBy(xpath = "//a[text()='NumpyNinja']")
	@CacheLookup
	WebElement homePageTitle;
	
	@FindBy(xpath="//a[text()='Data Structures']")
	@CacheLookup
	WebElement dropDownLink;
	
	@FindBy(linkText = "Arrays")
	@CacheLookup
	WebElement dropDownValue;
	
	@FindBy(xpath = "//div[contains(text(),'You are not logged in')]")
	@CacheLookup
	WebElement startPageErrorMsg;
	
	@FindBy(xpath = "//h5[text()='Data Structures-Introduction']/..//a[text()='Get Started']")
	@CacheLookup
	WebElement getStartedDSBtn;
	
	public void clickGetStartedBtn() throws Exception {
		 Thread.sleep(2000);
		 Loggerload.info("click on getStartedPage "+getStartedBtn.getText()+" button");
		 Utils.webClick(getStartedBtn);
    }
	 
	public String validateHomePage() {
		Loggerload.info("click on getStartedPage "+homePageTitle.getText()+" button");
		String text = homePageTitle.getText();
		return text;
    }
	 
	public void dropDownClick() throws InterruptedException {
		 Thread.sleep(1000);
		 Loggerload.info("click on getStartedPage "+dropDownLink.getText()+" button");
		 Utils.webClick(dropDownLink); 
    }
	 
	public void enterDropdownValue(String value) throws InterruptedException {
		 Thread.sleep(1000);
		 Loggerload.info("click on getStartedPage "+dropDownValue.getText()+" button");
		 Utils.webSendKeys(dropDownValue, value);
		 Utils.webClick(dropDownValue);
	}
	 
	public String displayErrorMsg() {
		String text = startPageErrorMsg.getText();
		return text;
    }
	 
	public void getStartedClick() throws InterruptedException {
		 Thread.sleep(2000);
		 Utils.webClick(getStartedBtn);
	 }
}
