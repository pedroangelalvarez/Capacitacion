package com.bdd.tasks.googleSearch;

import com.bdd.userinterfaces.GooglePage.GoogleSearchResultsPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.thucydides.core.annotations.Step;

public class AccederAPrimeraOpcion implements Task {

    public static AccederAPrimeraOpcion resultado() {
        return Tasks.instrumented(AccederAPrimeraOpcion.class);
    }

    @Step("Acceder a la primera opción de búsqueda en Google")
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(GoogleSearchResultsPage.FIRST_RESULT)
        );
    }
}
