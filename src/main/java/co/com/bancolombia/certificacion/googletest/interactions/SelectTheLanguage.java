package co.com.bancolombia.certificacion.googletest.interactions;

import static net.serenitybdd.screenplay.Tasks.instrumented;

import co.com.bancolombia.certificacion.googletest.tasks.GoTo;
import co.com.bancolombia.certificacion.googletest.user_interface.GoogleTranslatePage;
//import co.com.bancolombia.certificacion.googletest.util.LanguageTarget;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.targets.Target;

public class SelectTheLanguage implements Interaction{

	private  final Target LANGUAGE_DROPDOWN;
	private  final Target LANGUAGE;
	
	public SelectTheLanguage(Target LANGUAGE_DROPDOWN, Target LANGUAGE) {
		this.LANGUAGE_DROPDOWN = LANGUAGE_DROPDOWN;
		this.LANGUAGE = LANGUAGE;
	}

	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(Click.on(LANGUAGE_DROPDOWN));
		actor.attemptsTo(Click.on(LANGUAGE));
	}
	
	public static SelectTheLanguage with (Target languageDropdown, Target language) {
		return instrumented(SelectTheLanguage.class, languageDropdown, language );
	}

}
