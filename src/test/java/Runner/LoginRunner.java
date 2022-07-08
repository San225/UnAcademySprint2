package Runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		
		plugin = {"json:target/cucumber.json"},
		features = {"src/test/java/features"}
		,glue={"StepDefination1"},
	    monochrome = true,
		tags = "@unacademy"
        )
public class LoginRunner extends AbstractTestNGCucumberTests {
	

}
