package co.com.bancolombia.certificacion.googletest.user_interface;

import org.openqa.selenium.By;

import net.serenitybdd.screenplay.targets.Target;

public class GoogleTranslatePage {
	
	public static final Target SOURCE_LANGUAGE_BUTTON = Target.the("Source Language Button").located(By.id("gt-sl-gms"));
	public static final Target TARGET_LANGUAGE_BUTTON = Target.the("Target Language Button").located(By.id("gt-tl-gms"));
	
	public static final Target SOURCE_LANGUAGE_TEXT_AREA = Target.the("Source Language Text Area").located(By.id("source"));
	public static final Target TARGET_LANGUAGE_TEXT_AREA = Target.the("Target Language Text Area").located(By.id("gt-res-dir-ctr"));
	
	public static final Target SOURCE_LANGUAGE_OPTION_ENGLISH = Target.the("Source Language Option Ingles").locatedBy("//*[@id=\"gt-sl-gms-menu\"]/table/tbody/tr/td/div/div/div[contains(text(),'Ingl')]");
	public static final Target SOURCE_LANGUAGE_OPTION_JAVANES = Target.the("Source Language Option Javanés").locatedBy("//*[@id=\"gt-sl-gms-menu\"]/table/tbody/tr/td/div/div/div[contains(text(),'Javan')]");
	
	public static final Target TARGET_LANGUAGE_OPTION_SPANISH = Target.the("Target Language Option Spanish").locatedBy("//*[@id=\"gt-tl-gms-menu\"]/table/tbody/tr/td/div/div/div[contains(text(),'Espa')]");
	
	
	public static final Target TRANSLATE_BUTTON = Target.the("Traslate Button").located(By.id("gt-submit"));
	
	
	
	
}
