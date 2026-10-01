package com.TravelTest.Runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions (features ="ScenarioInFeatureFormat",glue ={"com.TravelTest.cucumberStepDefiniation"},
plugin = "html:./target/cucumberreport.html")

public class cucumberRunner  extends  AbstractTestNGCucumberTests{

}
 