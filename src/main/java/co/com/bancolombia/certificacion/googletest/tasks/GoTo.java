package co.com.bancolombia.certificacion.googletest.tasks;

import static co.com.bancolombia.certificacion.googletest.user_interface.GoogleAppsComponent.GOOGLE_APPS_BUTTON;
import static co.com.bancolombia.certificacion.googletest.user_interface.GoogleAppsComponent.GOOGLE_TRASLATE_BUTTON;
import static net.serenitybdd.screenplay.Tasks.instrumented;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.targets.Target;



public class GoTo implements Task {
	private Target googleApp;
	
	public GoTo (Target googleApp) {
		this.googleApp = googleApp;
	}
	
	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(Click.on(GOOGLE_APPS_BUTTON));
		actor.attemptsTo(Click.on(googleApp));
	}

	public static GoTo theApp(Target googleTraslateButton) {
		
		return instrumented(GoTo.class, googleTraslateButton);
	}

}
