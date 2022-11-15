package co.com.choucair.retoevalart.stepdefinitions;

import co.com.choucair.retoevalart.tasks.Cycles;
import co.com.choucair.retoevalart.tasks.Login;
import co.com.choucair.retoevalart.tasks.OpenPage;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

public class solucionReto {
    @Before
    public void setStage(){
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("^That kevin wants to fill in the forms and get the hash$")
    public void kevinWantsToFillInTheFormsAndGetTheHash() {
        OnStage.theActorCalled("kevin").wasAbleTo(OpenPage.thePage(), Login.onThePage());
    }


    @When("^he manages to complete all the cycles$")
    public void whenHeManagesToCompleteAllTheCycles() {
        OnStage.theActorInTheSpotlight().attemptsTo(Cycles.cycle());
    }

    @Then("^he can see the hash$")
    public void heCanSeeTheHash() {

    }


}
