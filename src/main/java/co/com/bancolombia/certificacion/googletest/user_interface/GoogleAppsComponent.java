package co.com.bancolombia.certificacion.googletest.user_interface;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;


public class GoogleAppsComponent {
	public final static Target GOOGLE_APPS_BUTTON = Target.the("Google Apps Button").locatedBy("//*[@id=\"gbwa\"]/div[1]/a");
	public final static Target GOOGLE_TRASLATE_BUTTON = Target.the("Google Traslate Button").located(By.id("gb51"));
		
}

