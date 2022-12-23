package com.utils;

import java.time.Duration;
import java.util.Random;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.stepDefinations.BaseClass;

public class Utils {
	public static int getRandomNum() {
		Random random = new Random();
		 return random.nextInt(100000);
				
	}
	
	public static WebDriver driver = Helper.getDriver();
	
	/**
	 * @author vijayabharathi
	 * @purpose : This is a method which will accept WebElement and perform click action
	 * @category Unit TestCase
	 * @exception Exception
	 * @DateCretaed : 
	 * @dateModified : 
	 * @param element
	 * @return boolean
	 */
	public static boolean webClick(WebElement element) {
		try {
			WebElement ele = new WebDriverWait(driver, Duration.ofSeconds(10)).
					until(ExpectedConditions.visibilityOf(element));
			
			if(ele.isDisplayed()) {
				if(ele.isEnabled()) {
					try {
						ele.click();
//						Actions action = new Actions(driver);
//						action.moveToElement(ele);
//						action.click(ele);
	//					reporting line will go here
					
						return true;
					}
					catch(Exception e) {
						((JavascriptExecutor) driver).executeScript("arguments[0].click();", ele);
					}	
				}
				else {
					throw new Exception("Element is not enabled");
				}
			}
			else {
				throw new Exception("Element is not displayed");
			}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return false;
	}

	
	public static boolean webSendKeys(WebElement element, String text) {
		try {
			WebElement ele = new WebDriverWait(driver, Duration.ofSeconds(10)).
					until(ExpectedConditions.visibilityOf(element));
			
			if(ele.isDisplayed()) {
				if(ele.isEnabled()) {
					try {
						ele.clear();
						ele.sendKeys(text);
//						Actions action = new Actions(driver);
//						action.moveToElement(ele);
//						action.click(ele);
	//					reporting line will go here
					
						return true;
					}
					catch(Exception e) {
						((JavascriptExecutor) driver).executeScript("arguments[0].value='"+text+"';", ele);
					}	
				}
				else {
					throw new Exception("Element is not enabled");
				}
			}
			else {
				throw new Exception("Element is not displayed");
			}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return false;
	}
	

	public static boolean webSelect(WebElement element, String text) {
		try {
			WebElement ele = new WebDriverWait(driver, Duration.ofSeconds(10)).
					until(ExpectedConditions.visibilityOf(element));
			
			if(ele.isDisplayed()) {
				if(ele.isEnabled()) {
					try {
						new Select(ele).deselectByVisibleText(text);

//						reporting and logging here
						return true;
					}
					catch(Exception e) {
//						((JavascriptExecutor) driver).executeScript("arguments[0].value='"+text+"';", ele);
					}	
				}
				else {
					throw new Exception("Element is not enabled");
				}
			}
			else {
				throw new Exception("Element is not displayed");
			}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return false;
	}

	
}


