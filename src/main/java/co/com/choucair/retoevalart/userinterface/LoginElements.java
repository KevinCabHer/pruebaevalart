package co.com.choucair.retoevalart.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class LoginElements extends PageObject {
    public static final Target INPUT_NAME = Target.the("input name")
            .located(By.xpath("(//input[@class=\"p-2 rounded-md\"])[1]"));
    public static final Target INPUT_PASSWORD = Target.the("input password")
            .located(By.xpath("(//input[@class=\"p-2 rounded-md\"])[2]"));
    public static final Target BUTTON_LOGIN = Target.the("button login")
            .located(By.xpath("//button[@type=\"submit\"]"));
}
