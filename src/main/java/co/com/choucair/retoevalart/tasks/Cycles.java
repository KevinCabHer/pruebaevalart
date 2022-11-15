package co.com.choucair.retoevalart.tasks;

import co.com.choucair.retoevalart.userinterface.CyclesButtons;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.*;

public class Cycles implements Task {

    public static Cycles cycle() {
        return Tasks.instrumented(Cycles.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                JavaScriptClick.on(CyclesButtons.BUTTON_P),
                Enter.theValue("1213").into(CyclesButtons.INPUT_C1),
                Click.on(CyclesButtons.SUBMIT_C1),

                JavaScriptClick.on(CyclesButtons.BUTTON_C2),
                Enter.theValue("1658").into(CyclesButtons.INPUT_C1),
                Click.on(CyclesButtons.SUBMIT_C1),

                JavaScriptClick.on(CyclesButtons.BUTTON_C3),
                Enter.theValue("1283").into(CyclesButtons.INPUT_C1),
                Click.on(CyclesButtons.SUBMIT_C1),

                JavaScriptClick.on(CyclesButtons.BUTTON_C4),
                Enter.theValue("1207").into(CyclesButtons.INPUT_C1),
                Click.on(CyclesButtons.SUBMIT_C1),

                JavaScriptClick.on(CyclesButtons.BUTTON_C5),
                Enter.theValue("1824").into(CyclesButtons.INPUT_C1),
                Click.on(CyclesButtons.SUBMIT_C1),

                JavaScriptClick.on(CyclesButtons.BUTTON_C6),
                Enter.theValue("1130").into(CyclesButtons.INPUT_C1),
                Click.on(CyclesButtons.SUBMIT_C1),

                JavaScriptClick.on(CyclesButtons.BUTTON_C7),
                Enter.theValue("1439").into(CyclesButtons.INPUT_C1),
                Click.on(CyclesButtons.SUBMIT_C1),

                JavaScriptClick.on(CyclesButtons.BUTTON_C8),
                Enter.theValue("1098").into(CyclesButtons.INPUT_C1),
                Click.on(CyclesButtons.SUBMIT_C1),

                JavaScriptClick.on(CyclesButtons.BUTTON_C9),
                Enter.theValue("1408").into(CyclesButtons.INPUT_C1),
                Click.on(CyclesButtons.SUBMIT_C1),

                JavaScriptClick.on(CyclesButtons.BUTTON_C10),
                Enter.theValue("1128").into(CyclesButtons.INPUT_C1),
                Click.on(CyclesButtons.SUBMIT_C1)


        );
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
