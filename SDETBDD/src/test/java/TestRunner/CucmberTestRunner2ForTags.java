package TestRunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(tags="@Smoke and @Regression and not @Performance" ,
features= {"D:\\Learn\\SELENIUM\\BDDFRAMEWORK\\src\\test\\resources\\FeatureWithTags"},
glue = {"StepsDefintion"},
plugin= {"pretty","html:target/htmlreport.html"})


public class CucmberTestRunner2ForTags extends AbstractTestNGCucumberTests
{
	
	
	

}
