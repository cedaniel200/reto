package com.cedaniel200.reto.interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.actions.Switch;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.webdriver.SerenityWebdriverManager;
import org.openqa.selenium.WebDriver;

import java.util.Optional;
import java.util.Set;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class Cambiar implements Interaction {

    private String pestaniaActual;
    private Set<String> pestanias;

    public Cambiar() {
        WebDriver webDriver = SerenityWebdriverManager.inThisTestThread().getCurrentDriver();
        this.pestaniaActual = webDriver.getWindowHandle();
        this.pestanias = webDriver.getWindowHandles();
    }

    @Override
    @Step("Cambiar a la siguiente pestania")
    public <T extends Actor> void performAs(T actor) {
        Optional<String> pestania = pestanias.stream().filter(p -> !p.equals(pestaniaActual)).findFirst();
        actor.attemptsTo(
                Switch.toWindow(pestania.orElse(pestaniaActual))
        );
    }

    public static Performable dePestania() {
        return instrumented(Cambiar.class);
    }
}
