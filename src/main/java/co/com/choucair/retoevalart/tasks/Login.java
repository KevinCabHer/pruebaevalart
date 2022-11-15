package co.com.choucair.retoevalart.tasks;

import co.com.choucair.retoevalart.userinterface.LoginElements;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class Login implements Task {

    public static Login onThePage() {
        return Tasks.instrumented(Login.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue("490468").into(LoginElements.INPUT_NAME),
                Enter.theValue("10df2f32286b7120My0zLTg2NDA5NA==30e0c83e6c29f1c3").into(LoginElements.INPUT_PASSWORD),
                Click.on(LoginElements.BUTTON_LOGIN)
        );

    }
}
