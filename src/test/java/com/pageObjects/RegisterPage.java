package com.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.utils.Helper;
import com.utils.Utils;

public class RegisterPage {
	public RegisterPage(WebDriver webDriver) {
		PageFactory.initElements(webDriver, this);
	}

	WebDriver driver = Helper.getDriver();
	
	
	@FindBy(linkText = "Register")
	@CacheLookup
	WebElement registerLink;
	
	@FindBy(id = "id_username")
	@CacheLookup
	WebElement usernameText;
	
	@FindBy(id = "id_password1")
	@CacheLookup
	WebElement passwordText1;
	
	@FindBy(id = "id_password2")
	@CacheLookup
	WebElement passwordText2;
	
	@FindBy(xpath = "//input[@value='Register']")
	@CacheLookup
	WebElement registerButton;
	
	@FindBy(xpath = "//div[@role='alert']")
	@CacheLookup
	WebElement newAccountCreatedLabel;
	
	@FindBy(linkText = "Sign out")
	@CacheLookup
	WebElement signOutLink;
	
	@FindBy(partialLinkText =  "fill out this")
	@CacheLookup
	WebElement alert;
	
	@FindBy(xpath = "//input[@name='username']")
	@CacheLookup
	WebElement message;
	
	@FindBy(xpath = "//div[contains(text(),'password_mismatch:The two password fields didn’t match.')]")
	@CacheLookup
	WebElement passwordMismatch;
	
	
	public void clickRegisterLink() throws Exception {
		PageFactory.initElements(driver, this);
		Utils.webClick(registerLink);
		Thread.sleep(2000);
	}
	
	public void sendUsernameText(String username) throws InterruptedException {
		PageFactory.initElements(driver, this);
		Utils.webSendKeys(usernameText, username);
		Thread.sleep(2000);
	}
	
	public void sendPasswordText1(String password1) throws InterruptedException {
		Utils.webSendKeys(passwordText1, password1);
		Thread.sleep(2000);
	}
	
	public void sendPasswordText2(String password2) throws Exception {
		Utils.webSendKeys(passwordText2, password2);
		Thread.sleep(2000);
	}
	
	public void clickRegisterButton() throws Exception {
		Utils.webClick(registerButton);
		Thread.sleep(2000);
	}
	
	public String getNewAccountCreatedLabelText() {
		return newAccountCreatedLabel.getText();
	
	}
	
	public void clickSignOutLink() throws Exception {
		Utils.webClick(signOutLink);
		Thread.sleep(2000);
		
	}
	
	public String validationEmptyFields() throws InterruptedException {
		Thread.sleep(3000);
		String mesg=usernameText.getAttribute("validationMessage");
		System.out.println(mesg);
		return mesg;
	}
	public String validationEmptyFieldspassword1() throws InterruptedException {
		Thread.sleep(3000);
		String mesg=passwordText1.getAttribute("validationMessage");
		System.out.println(mesg);
		return mesg;
	}
	public String validationEmptyFieldspassword2() throws InterruptedException {
		Thread.sleep(3000);
		String mesg=passwordText2.getAttribute("validationMessage");
		System.out.println(mesg);
		return mesg;
	}
	
	public String validationPwdMismatch() throws InterruptedException {
		Thread.sleep(3000);
		String pwd1=passwordText1.getText();
		String pwd2=passwordText2.getText();
		String msg = "";
		if(pwd1 != pwd2) {
			 msg=passwordMismatch.getText();
			
		}
		return msg;
		
		
	}
}