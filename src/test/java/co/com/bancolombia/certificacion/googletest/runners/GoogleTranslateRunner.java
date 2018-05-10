package co.com.bancolombia.certificacion.googletest.runners;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
		features="src/test/resources/features/google_traslate.feature",
		glue= {"co.com.bancolombia.certificacion.googletest.step_definitions"})

public class GoogleTranslateRunner {

}
