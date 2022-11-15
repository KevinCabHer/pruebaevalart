package co.com.choucair.retoevalart.tasks;

import co.com.choucair.retoevalart.userinterface.PageEvalart;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Open;

public class OpenPage implements Task {

private PageEvalart pageEvalart;

    public static OpenPage thePage() {
        return Tasks.instrumented(OpenPage.class);
    }


    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(Open.browserOn(pageEvalart));
    }
}
