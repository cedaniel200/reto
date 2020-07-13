package com.cedaniel200.reto.ui;

import net.serenitybdd.screenplay.targets.Target;

public class TarifarioPage {
    public static final Target TARIFARIO_CUENTAS_DE_DEPOSITOS = Target.the("Tarifas de Cuentas de Depósitos")
            .locatedBy("//*[@id=\"main-content\"]/div[1]/div/div/table/tbody/tr[2]/td[2]/span/a");
}
