package TestRunner;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)

@CucumberOptions(features= {"C:\\Users\\ELCOT\\Downloads\\eclipse-jee-oxygen-3a-win32-x86_64\\eclipse\\hello\\CucumberProject\\src\\test\\java\\Feature\\FeatureFile.feature"}, glue= {"C:\\Users\\ELCOT\\Downloads\\eclipse-jee-oxygen-3a-win32-x86_64\\eclipse\\hello\\CucumberProject\\src\\test\\java\\StepsDefinition\\Steps.java"})


public class RunnerClass {
	 

}
