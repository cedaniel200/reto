package com.cedaniel200.reto.stepdefinitions;

import com.cedaniel200.reto.interactions.Cambiar;
import com.cedaniel200.reto.questions.ElPDF;
import com.cedaniel200.reto.ui.PortalPersonaPage;
import cucumber.api.PendingException;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actions.Switch;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import static com.cedaniel200.reto.ui.PortalPersonaPage.TARIFARIO;
import static com.cedaniel200.reto.ui.TarifarioPage.TARIFARIO_CUENTAS_DE_DEPOSITOS;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class TarifarioStepDefinitions {

    private PortalPersonaPage portalPersonaPage;

    @Before
    public void prepararEscenario(){
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("^(.*) se encuentra en el portal personas$")
    public void cesarSeEncuentraEnElPortalPersonas(String usuario) {
        theActorCalled(usuario).attemptsTo(
                Open.browserOn(portalPersonaPage),
                Click.on(TARIFARIO)
        );
    }

    @When("^[a-zA-z]{3,40} ingresa al tarifario$")
    public void cesarIngresaAlTarifario() {
        theActorInTheSpotlight().attemptsTo(
                Click.on(TARIFARIO_CUENTAS_DE_DEPOSITOS),
                Cambiar.dePestania()
        );
    }

    @Then("^[a-zA-z]{3,40} deberia ver el tarifario$")
    public void cesarDeberiaVerElTarifario() {
        theActorInTheSpotlight().should(seeThat(ElPDF.esAbierto()));
    }
}
