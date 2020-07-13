package com.cedaniel200.reto.ui;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;

@DefaultUrl("https://www.banistmo.com/wps/portal/banistmo/personas/")
public class PortalPersonaPage extends PageObject {

    public static final Target TARIFARIO = Target.the("Tarifario")
            .located(By.linkText("Tarifario"));
}
