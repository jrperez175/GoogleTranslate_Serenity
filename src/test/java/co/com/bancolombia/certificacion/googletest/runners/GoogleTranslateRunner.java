package co.com.bancolombia.certificacion.googletest.runners;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
		features="src/test/resources/features/google_traslate.feature",
		glue= {"co.com.bancolombia.certificacion.googletest.step_definitions"},
		snippets = SnippetType.CAMELCASE //para escribir el metodo en Camel desde el feature al step definition
		,tags = {"@Scenario_OK"}
		)

public class GoogleTranslateRunner {

}
