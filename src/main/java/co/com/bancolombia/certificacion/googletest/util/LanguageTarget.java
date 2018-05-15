package co.com.bancolombia.certificacion.googletest.util;

import co.com.bancolombia.certificacion.googletest.user_interface.GoogleTranslatePage;
import net.serenitybdd.screenplay.targets.Target;

public class LanguageTarget {
	
	public static Target getSourceLanguageTarget(String sourceLanguage) {
		
		switch (sourceLanguage) {
		case Language.ENGLISH:
			return GoogleTranslatePage.SOURCE_LANGUAGE_OPTION_ENGLISH;
		
		case Language.JAVANES:
			return GoogleTranslatePage.SOURCE_LANGUAGE_OPTION_JAVANES;
			
		default:
			return GoogleTranslatePage.SOURCE_LANGUAGE_OPTION_ENGLISH;
		}
	}

	public static Target getTargetLanguageTarget(String targetLanguage) {
		
		switch (targetLanguage) {
				
			case Language.SPANISH:
				return GoogleTranslatePage.TARGET_LANGUAGE_OPTION_SPANISH;
				
			default:
				return GoogleTranslatePage.TARGET_LANGUAGE_OPTION_SPANISH;
		}
	}
	
}
