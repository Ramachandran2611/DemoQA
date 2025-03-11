package testRunner;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.testng.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions( features ="/Test-Selenium/src/test/java/cucumber_feature/cucumber_feature.feature",
  glue="steps")
public class LoginRunner {

}
