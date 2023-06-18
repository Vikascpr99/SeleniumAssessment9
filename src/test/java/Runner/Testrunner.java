package Runner;

import org.junit.runner.RunWith;
import io.cucumber.junit.*;


@RunWith(Cucumber.class)
@CucumberOptions(
		features = "C:\\Users\\VK65778\\eclipse-workspace\\Uber\\src\\main\\resources\\Feature\\login.feature"
		,glue= {"Uber.functionality"},
		plugin= {"pretty", "html:test-outout"}
		)




public class Testrunner {


	
}
