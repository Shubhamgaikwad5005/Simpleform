package Test_Runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


@CucumberOptions(features= {"src/test/resources/Feature"},

glue= {"Step_Definition"},

plugin= {"pretty","html:target/htmlreport.html"})


public class Cucumber_test_Runner extends AbstractTestNGCucumberTests {

}
