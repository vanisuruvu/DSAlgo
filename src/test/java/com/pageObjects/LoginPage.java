package com.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.utils.Helper;
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
	
	@FindBy(xpath="//div[contains(text(),'Logged out successfully')]")
	WebElement successfulLogOutMsg;
	
	@FindBy(xpath="//div[contains(text(),'Invalid Username and Password')]")
	WebElement invalidCredMsg;
	
	 
	
	 public void signInClick() throws Exception {
		 Utils.webClick(signInLink);
		    }
	 
	 public String validateSignInPage() throws InterruptedException {
		 String text = logInBtn.getAttribute("value");
			return text;
		    }
	 
	 public void registrationLinkClick() throws Exception {
		 PageFactory.initElements(Helper.getDriver(), this);
		 Utils.webClick(registerLink);
		    }
	 
	 public String validateRegBtn() {
		 String text = validateRegisterBtn.getAttribute("value");
			return text;
		    }
	 
	 public void enterUserName(String value) throws InterruptedException {
		 Utils.webSendKeys(usernameTxtBox, value);
		
		}
	 public void enterPassword(String value) throws InterruptedException {
		 Utils.webSendKeys(passowrdTxtBox, value);
		
		}
	 
	 public void clickLogInBtn() throws InterruptedException {
		 Utils.webClick(logInBtn);
		 
	 }
	 
	 public void clickSignOutLink() throws InterruptedException {
		 Utils.webClick(logoutLink);
	 }
	 public String validateSuccessLoginMsg() {
		 String text = successfulLoginMsg.getText();
			return text;
		    }
	 public String validateSuccessLogOutMsg() {
		 String text = successfulLogOutMsg.getText();
			return text;
		    }
	 
		public String validationEmptyFieldUserName() throws InterruptedException {
			String message = usernameTxtBox.getAttribute("validationMessage");
			System.out.println(message);
			return message;
		}
		
		public String validationEmptyFieldPassword() throws InterruptedException {
			String message = passowrdTxtBox.getAttribute("validationMessage");
			System.out.println(message);
			return message;
		}
		public String validateInvalidCredMsg() {
			 String text = invalidCredMsg.getText();
				return text;
			    }
}
