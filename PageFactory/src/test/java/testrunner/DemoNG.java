package testrunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features= "src\\test\\resources\\feature\\Sample2.feature",
glue = {"stepDefination","Hooks"},
plugin = {"pretty","html:target/cucumberReport/report1.html"})
//tags = ("@SmokeTest or @SystemTest"))
public class DemoNG extends AbstractTestNGCucumberTests {

}
