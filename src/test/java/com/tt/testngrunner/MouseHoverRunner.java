package com.tt.testngrunner;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions (
		plugin= {"pretty","html:target","com.cucumber.listener.ExtentCucumberFormatter:target/Cucumber_Extents_report.html"},
		features = "./Feature/Mousehover.feature",
		glue= "com.tt.stepdef")

public class MouseHoverRunner extends AbstractTestNGCucumberTests{

}
