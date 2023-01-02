package com.pageObjects;

import org.apache.commons.lang3.StringUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.utils.Helper;
import com.utils.Utils;

import junit.framework.Assert;

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
	
	@FindBy(xpath = "//div[@class='alert alert-primary']")
	@CacheLookup
	WebElement passwordMismatch;
	
	
	public void clickRegisterLink() throws Exception {
		PageFactory.initElements(driver, this);
		Utils.webClick(registerLink);
	}
	
	public void sendUsernameText(String username) throws InterruptedException {
		PageFactory.initElements(driver, this);
		Utils.webSendKeys(usernameText, Utils.getRandomNum()+username);
	}
	
	public void sendPasswordText1(String password1) throws InterruptedException {
		Utils.webSendKeys(passwordText1, password1);
	}
	
	public void sendPasswordText2(String password2) throws Exception {
		Utils.webSendKeys(passwordText2, password2);
	}
	
	public void clickRegisterButton() throws Exception {
		Utils.webClick(registerButton);
		Thread.sleep(1000);
	}
	
	public String getNewAccountCreatedLabelText() {
		return newAccountCreatedLabel.getText();
	}
	
	public void clickSignOutLink() throws Exception {
		Utils.webClick(signOutLink);
		Thread.sleep(2000);
	}
	
	public String validationEmptyFields() throws InterruptedException {
		String mesg=usernameText.getAttribute("validationMessage");
		return mesg;
	}
	public String validationEmptyFieldspassword1() throws InterruptedException {
		String mesg=passwordText1.getAttribute("validationMessage");
		return mesg;
	}
	public String validationEmptyFieldspassword2() throws InterruptedException {
		//Thread.sleep(3000);
		String mesg=passwordText2.getAttribute("validationMessage");
		return mesg;
	}
	
	@SuppressWarnings("deprecation")
	public void validatePasswordMismatchInputs(String pwd1, String pwd2) {
		if(pwd1.equals(pwd2)) {
			Assert.fail();
		}
	}
	
	public String validationPwdMismatch() throws InterruptedException {
		String msg = passwordMismatch.getText();
		return msg;
	}
	
	@SuppressWarnings("deprecation")
	public void validateLessThanEightChars(String pwd1, String pwd2) {
		// checking if length of passwords is less than 8, if not fail the test case
		if(!(pwd1.length() < 8 || pwd2.length() < 8)) {
			Assert.fail();
		}
	}
	
	public String validatepwd() throws InterruptedException {
		String msg = passwordMismatch.getText();
		return msg;
	}
	
	public void validateCompareUnPwd(String username, String pwd1, String pwd2) {
		if(!(username.equals(pwd1) && username.equals(pwd2))) {
			Assert.fail(); 
			// failing test case when username, pwd1, pwd2 are not same
		}
	}
	
	public String validatecompare() throws InterruptedException {
		//Thread.sleep(3000);
		String msg = "";
		String usr=usernameText.getText();
		String pwd1=passwordText1.getText();
		String pwd2=passwordText2.getText();
		boolean a=(usr==pwd1);
	    boolean b =(usr==pwd2);
		if(a&b==true) {
			msg = passwordMismatch.getText();
		}
		return msg;
	}
	
	
	public void validateNumericInputs(String pwd1, String pwd2) {
		if(!(StringUtils.isNumeric(pwd1) && StringUtils.isNumeric(pwd2))) {
			// if passwords are not numeric, then fail the test case
			Assert.fail();
		}
	}
	
	public String validatenumeric() {
	    return passwordMismatch.getText();
	}

	private static boolean isNumeric(String str) {
		// returns true if str is numeric
		boolean isNumbers = false;
		for(int i = 0; i< str.length(); i++) {
		}
		return isNumbers;
	}
}
	