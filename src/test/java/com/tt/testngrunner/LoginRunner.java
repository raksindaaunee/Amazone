package com.tt.testngrunner;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(
		plugin= {"pretty","html:target","com.cucumber.listener.ExtentCucumberFormatter:target/Cucumber_Extents_report.html"},
		features= "./Feature/",
		glue="com.tt.stepdef"
		//plugin= {"pretty","html:target","com.cucumber.listener.ExtentCucumberFormatter:target/Cucumber_Extents_report.html"},
		//features= {"Feature"},
		//glue= {"com.tt.stepdef"},
		//tags= {"@loging","@dropdown"}
		
		)
public class LoginRunner extends AbstractTestNGCucumberTests{

}
