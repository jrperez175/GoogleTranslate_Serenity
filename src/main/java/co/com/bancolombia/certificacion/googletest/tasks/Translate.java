package co.com.bancolombia.certificacion.googletest.tasks;

import static net.serenitybdd.screenplay.Tasks.instrumented;

import co.com.bancolombia.certificacion.googletest.model.TranslateExpression;
import co.com.bancolombia.certificacion.googletest.user_interface.GoogleTranslatePage;
import co.com.bancolombia.certificacion.googletest.util.LanguageTarget;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.targets.Target;

public class Translate implements Task{
	
	private TranslateExpression translateExpression;
	
	public Translate(TranslateExpression translateExpression) {
		this.translateExpression = translateExpression;
	}
	
	@Override
	public <T extends Actor> void performAs(T actor) {
		
		actor.attemptsTo(Click.on(GoogleTranslatePage.SOURCE_LANGUAGE_BUTTON));
		//actor.attemptsTo(Click.on(LanguageTarget.getSourceLanguageTarget(translateExpression.getSourceLanguage())));
		actor.attemptsTo(Click.on(GoogleTranslatePage.SOURCE_LANGUAGE_OPTION));
		
		actor.attemptsTo(Click.on(GoogleTranslatePage.TARGET_LANGUAGE_BUTTON));
		//actor.attemptsTo(Click.on(LanguageTarget.getTargetLanguageTarget(translateExpression.getTargetLanguage())));
		actor.attemptsTo(Click.on(GoogleTranslatePage.TARGET_LANGUAGE_OPTION));
		
		actor.attemptsTo(Enter.theValue(translateExpression.getWord()).into(GoogleTranslatePage.SOURCE_LANGUAGE_TEXT_AREA));
		actor.attemptsTo(Click.on(GoogleTranslatePage.TRANSLATE_BUTTON));
		
	}

	public static Translate the(TranslateExpression translateExpression) {
		
		return instrumented(Translate.class, translateExpression);
	}
	
	

}
