package co.com.choucair.retoevalart.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features ="src/test/resources/features/solucion_reto_evalart.feature",
        tags="@Scenario1",
        glue="co.com.choucair.retoevalart.stepdefinitions",
        snippets = SnippetType.CAMELCASE

)

public class runners {
}
