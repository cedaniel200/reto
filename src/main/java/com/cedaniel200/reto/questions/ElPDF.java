package com.cedaniel200.reto.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.annotations.Subject;

@Subject("El PDF es abierto en una nueva pestaña")
public class ElPDF implements Question<Boolean> {

    @Override
    public Boolean answeredBy(Actor actor) {
        // TODO se debe implementar la logica de la validación
        return false;
    }

    public static Question<Boolean> esAbierto() {
        return new ElPDF();
    }

}
