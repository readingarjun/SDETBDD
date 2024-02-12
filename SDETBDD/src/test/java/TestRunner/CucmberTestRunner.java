package TestRunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(tags="" ,
features= {"D:\\Learn\\SELENIUM\\BDDFRAMEWORK\\src\\test\\resources\\Features"},
glue = {"StepsDefintion"},
plugin= {"pretty","html:target/htmlreport.html"})


public class CucmberTestRunner extends AbstractTestNGCucumberTests
{
	
	
	

}
