package co.com.bancolombia.certificacion.googletest.step_definitions;

import org.openqa.selenium.WebDriver;

import co.com.bancolombia.certificacion.googletest.model.TranslateExpression;
import co.com.bancolombia.certificacion.googletest.tasks.GoTo;
import co.com.bancolombia.certificacion.googletest.tasks.OpenTheBrowser;
import co.com.bancolombia.certificacion.googletest.tasks.Translate;
import co.com.bancolombia.certificacion.googletest.user_interface.GoogleHomePage;
import static co.com.bancolombia.certificacion.googletest.user_interface.GoogleAppsComponent.GOOGLE_TRASLATE_BUTTON;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.thucydides.core.annotations.Managed;

public class GoogleTranslateStepDefinitios {
	
	@Managed(driver="chrome")
	private WebDriver hisDriver; 
	private GoogleHomePage googleHomePage; 
	
	private Actor nelson = Actor.named("nelson");
	
	@Before
	public void setUp() throws Exception {
		nelson.can(BrowseTheWeb.with(hisDriver));		
	}
	
	@Given("^that (.*) opens his browser al (.*)$")
	public void thatTheUserOpensHisBrowserAt(String name, String webpage) throws Exception {
	    nelson.wasAbleTo(OpenTheBrowser.at(googleHomePage));
	    //throw new PendingException();
	}

	@And("^he goes to (.*)$")
	public void theUserGoesTo(String googleApp) throws Exception {
	    
	    //throw new PendingException();
		
		nelson.wasAbleTo(GoTo.theApp(GOOGLE_TRASLATE_BUTTON));
	}

	@When("^he translates the word (.*) from (.*) to (.*)$")
	public void theUserTranslatesTheWordFromTo(String word, String sourceLanguage, String targetLanguage) throws Exception {
	    
	    //throw new PendingException();
		
		nelson.attemptsTo(Translate.the(new TranslateExpression(word, sourceLanguage, targetLanguage)));
	}

	@Then("^he would se the word (.*) in the screen$")
	public void theUserShouldSeeTheExpectedWord(String expectedWord) throws Exception {
	    
	    //throw new PendingException();
		
	}

}
