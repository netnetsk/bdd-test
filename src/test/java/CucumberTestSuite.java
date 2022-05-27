import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import net.serenitybdd.junit.runners.SerenityRunner;
import org.junit.runner.RunWith;



@RunWith(CucumberWithSerenity.class)
@CucumberOptions(plugin = { "pretty","html:target/cucumber" }, features = "src/test/resources/features",tags = "@test")
public class CucumberTestSuite {

}