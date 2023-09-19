package com.davivienda.pruebaautomatizacion.interactions.AbrirPagina;

import com.davivienda.pruebaautomatizacion.userinterfaces.AbrirPagina.UiAbrirPagina;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.questions.WebElementQuestion;
import net.serenitybdd.screenplay.targets.Target;
import net.serenitybdd.screenplay.waits.Wait;

public class IsAbrirPagina implements Interaction {


    UiAbrirPagina uiAbrirPagina;

    public static IsAbrirPagina one() {
        return Instrumented.instanceOf(IsAbrirPagina.class).withProperties();
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        PageObject UIAbrirPagina;
        actor.attemptsTo(Open.browserOn(uiAbrirPagina));
        // Aceptar los cookies
        Target Aceptarcookies = UiAbrirPagina.Aceptarcookies;

        if (Aceptarcookies.resolveFor(actor).isVisible()) {
            actor.attemptsTo(Wait.until(
                            WebElementQuestion.the(UiAbrirPagina.Aceptarcookies),
                            WebElementStateMatchers.isVisible()
                    ).forNoLongerThan(10).seconds(),
                    Click.on(UiAbrirPagina.Aceptarcookies));
        }

    }


}

