package com.runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features="src/test/resources/features"
,glue ={"com.stepDefinations","com.utils.Helper"}
,monochrome=true,dryRun = false,   // tags="@arrays",

plugin= {"pretty","html:target/cucumber.html"
		,"html:target/HtmlReports.html","io.qameta.allure.cucumber7jvm.AllureCucumber7Jvm"
})
public class Runner extends AbstractTestNGCucumberTests {
	
	

}
