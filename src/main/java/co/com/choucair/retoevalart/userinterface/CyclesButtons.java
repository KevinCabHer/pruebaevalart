package co.com.choucair.retoevalart.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class CyclesButtons extends PageObject {

    // CICLO UNO

    public static final Target BUTTON_C1 = Target.the("button cycle one")
            .located(By.xpath("(//button[@class=\"grid_button\"])[134]"));
    public static final Target BUTTON_P = Target.the("button push")
            .located(By.xpath("(//button[@type=\"button\"])[134]"));
    public static final Target INPUT_C1 = Target.the("input cycle one")
            .located(By.xpath("//input[@placeholder=\"Suma total\"]"));
    public static final Target SUBMIT_C1 = Target.the("submit cycle one")
            .located(By.xpath("//button[@type=\"submit\"]"));

    // CICLO DOS
    public static final Target BUTTON_C2 = Target.the("button cycle one")
            .located(By.xpath("//button[@value=\"118\"]"));

    // CICLO TRES
    public static final Target BUTTON_C3 = Target.the("button cycle one")
            .located(By.xpath("//button[@value=\"57\"]"));

    // CICLO CUATRO
    public static final Target BUTTON_C4 = Target.the("button cycle one")
            .located(By.xpath("//button[@value=\"59\"]"));

    public static final Target BUTTON_C5 = Target.the("button cycle one")
            .located(By.xpath("//button[@value=\"183\"]"));

    public static final Target BUTTON_C6 = Target.the("button cycle one")
            .located(By.xpath("//button[@value=\"31\"]"));

    public static final Target BUTTON_C7 = Target.the("button cycle one")
            .located(By.xpath("//button[@value=\"87\"]"));

    public static final Target BUTTON_C8 = Target.the("button cycle one")
            .located(By.xpath("//button[@value=\"89\"]"));

    public static final Target BUTTON_C9 = Target.the("button cycle one")
            .located(By.xpath("//button[@value=\"197\"]"));

    public static final Target BUTTON_C10 = Target.the("button cycle one")
            .located(By.xpath("//button[@value=\"149\"]"));
}
