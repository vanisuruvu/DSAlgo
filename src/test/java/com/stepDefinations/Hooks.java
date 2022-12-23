package com.stepDefinations;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;



import com.utils.Helper;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;



public class Hooks {
   
	@Before
	public static void setUp() {
        
		Helper.setUpDriver();
	}
//	@After
//    public static void tearDown(Scenario scenario) {
// 
//        if(scenario.isFailed()) {
//            final byte[] screenshot = ((TakesScreenshot) Helper.getDriver()).getScreenshotAs(OutputType.BYTES);
//            scenario.attach(screenshot, "image/png", scenario.getName()); 
//        }   
//         
//        Helper.tearDown();
    
	}


