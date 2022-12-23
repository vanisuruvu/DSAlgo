package com.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.utils.Utils;

public class LoginPage {
	
	public LoginPage(WebDriver webDriver) {
		PageFactory.initElements(webDriver, this);
	}
	

	
	@FindBy(xpath ="//a[text()='Sign in']")
	WebElement signInLink;
	
	@FindBy(xpath ="//input[@value='Login']")
	WebElement logInBtn;
	
	@FindBy (xpath ="//a[text()='Register!']")
	WebElement registerLink;
	
	@FindBy (xpath ="//input[@value='Register']")
	WebElement validateRegisterBtn;
	
	@FindBy (xpath ="//input[@id='id_username']")
	WebElement usernameTxtBox;
	
	@FindBy (xpath="//input[@id='id_password']")
	WebElement passowrdTxtBox;
	
	@FindBy (xpath ="//a[text()='Sign out']")
	WebElement logoutLink;
	
	@FindBy (xpath ="//div[contains(text(),'You are logged in')]")
	WebElement successfulLoginMsg;
	
	 
	
	 public void signInClick() throws Exception {
		 Thread.sleep(2000);
		 Utils.webClick(signInLink);
		    }
	 
	 public String validateSignInPage() throws InterruptedException {
		 Thread.sleep(2000);
		 String text = logInBtn.getAttribute("value");
			return text;
		    }
	 
	 public void registrationLinkClick() throws Exception {
		 Thread.sleep(2000);
		 Utils.webClick(registerLink);
		    }
	 
	 public String validateRegBtn() {
		 String text = validateRegisterBtn.getAttribute("value");
			return text;
		    }
	 
	 public void enterUserName(String value) throws InterruptedException {
		 Thread.sleep(1000);
		 Utils.webSendKeys(usernameTxtBox, value);
		
		}
	 public void enterPassword(String value) throws InterruptedException {
		 Thread.sleep(1000);
		 Utils.webSendKeys(passowrdTxtBox, value);
		
		}
	 
	 public void clickLogInBtn() throws InterruptedException {
		 Thread.sleep(2000);
		 Utils.webClick(logInBtn);
		 
	 }
	 
	 public void clickSignOutLink() throws InterruptedException {
		 Thread.sleep(2000);
		 Utils.webClick(logoutLink);
		 Thread.sleep(2000);
	 }
	 public String validateSuccessLoginMsg() {
		 String text = successfulLoginMsg.getText();
			return text;
		    }
	 
	 
	
	

}
