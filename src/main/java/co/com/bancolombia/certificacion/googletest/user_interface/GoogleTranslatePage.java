package co.com.bancolombia.certificacion.googletest.user_interface;

import org.openqa.selenium.By;

import co.com.bancolombia.certificacion.googletest.model.TranslateExpression;
import co.com.bancolombia.certificacion.googletest.tasks.Translate;




import net.serenitybdd.screenplay.targets.Target;

public class GoogleTranslatePage {
	
	private TranslateExpression translateExpressions;
	
	
	public static final Target SOURCE_LANGUAGE_BUTTON = Target.the("Source Language Button").located(By.id("gt-sl-gms"));
	public static final Target TARGET_LANGUAGE_BUTTON = Target.the("Target Language Button").located(By.id("gt-tl-gms"));
	
	public static final Target SOURCE_LANGUAGE_TEXT_AREA = Target.the("Source Language Text Area").located(By.id("source"));
	public static final Target TARGET_LANGUAGE_TEXT_AREA = Target.the("Target Language Text Area").located(By.id("gt-res-dir-ctr"));
	
	public static final Target SOURCE_LANGUAGE_OPTION = Target.the("Source Language Option").locatedBy("//*[@id=\"gt-sl-gms-menu\"]/table/tbody/tr/td/div/div/div[contains(text(),'" +  + "')]");
	
	
	public static final Target TARGET_LANGUAGE_OPTION = Target.the("Target Language Option").locatedBy("//*[@id=\"gt-tl-gms-menu\"]/table/tbody/tr/td/div/div/div[contains(text(),'" + TranslateExpression.getTargetLanguage() + "')]");
	
	
	public static final Target TRANSLATE_BUTTON = Target.the("Traslate Button").located(By.id("gt-submit"));
	
	
	
	
}
