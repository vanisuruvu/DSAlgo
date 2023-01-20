package com.runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features="src/test/resources/features"
,glue ={"com.stepDefinations","com.utils.Helper", "appHooks"}
,monochrome=true,dryRun = false ,   
//tags = "@compareUnPwd",

plugin= {"pretty","html:target/cucumber.html",
		"html:target/HtmlReports.html",
		"io.qameta.allure.cucumber7jvm.AllureCucumber7Jvm",
		"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"
})

public class Runner extends AbstractTestNGCucumberTests {
	

}
