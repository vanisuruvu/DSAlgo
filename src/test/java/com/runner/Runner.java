package com.runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features="src/test/resources/features",glue ="com.stepDefinations"
,monochrome=true, tags =("@ds or @linkedlist or @arrays"),
//tags = "@ds", dryRun = false, 

plugin= {"pretty","html:target/cucumber.html"
})
public class Runner extends AbstractTestNGCucumberTests {
	
	

}
