package co.com.bancolombia.certificacion.googletest.user_interface;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("http://www.google.com")
public class GoogleHomePage extends PageObject {

	public static final Target GOOGLE_LOGO = Target.the("Google Home Logo").located(By.id("hplogo"));
	public static final Target GOOGLE_POPUP = Target.the("Google Popup").located(By.xpath("//a[@class='gb_Ba gb_Cd gb_ld']"));
}
