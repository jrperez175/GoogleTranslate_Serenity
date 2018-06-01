package co.com.bancolombia.certificacion.googletest.questions;

import static co.com.bancolombia.certificacion.googletest.user_interface.GoogleTranslatePage.TARGET_LANGUAGE_TEXT_AREA;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class TheResult implements Question<String>  {
	
	@Override
	public String answeredBy(Actor actor) {    //obtiene el texto para comparar
		
		return Text.of(TARGET_LANGUAGE_TEXT_AREA).viewedBy(actor).asString();
	}
	
	public static TheResult is() {
		return new TheResult();
	}

}
