package co.com.bancolombia.certificacion.googletest.tasks;

import static net.serenitybdd.screenplay.Tasks.instrumented;

import co.com.bancolombia.certificacion.googletest.user_interface.GoogleHomePage;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Open;
import net.thucydides.core.annotations.Step;

public class OpenTheBrowser implements Task {
	
	private final PageObject page; 
	
	//constructor
	public OpenTheBrowser(PageObject page) {
		this.page = page; 
	}

	@Override
	@Step("{0} open #page")
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(Open.browserOn(page),
				Click.on(GoogleHomePage.GOOGLE_POPUP));		
	}

	public static OpenTheBrowser at(PageObject page) {
		return instrumented(OpenTheBrowser.class, page);
	}
	

}
