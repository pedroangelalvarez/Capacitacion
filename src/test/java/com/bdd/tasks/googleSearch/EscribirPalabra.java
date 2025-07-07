package com.bdd.tasks.googleSearch;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.Tasks;
import com.bdd.userinterfaces.GooglePage.*;
import net.thucydides.core.annotations.Step;

public class EscribirPalabra implements Task {

    private final String palabra;

    public EscribirPalabra(String palabra) {
        this.palabra = palabra;
    }

    public static EscribirPalabra enGoogle(String palabra) {
        return Tasks.instrumented(EscribirPalabra.class, palabra);
    }
    @Step("Escribir la palabra {0} en el buscador de Google")
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(palabra).into(GoogleHomePage.SEARCH_BOX)
        );
    }
}