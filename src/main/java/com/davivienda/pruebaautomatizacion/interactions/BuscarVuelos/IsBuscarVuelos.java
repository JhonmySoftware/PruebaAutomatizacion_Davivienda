package com.davivienda.pruebaautomatizacion.interactions.BuscarVuelos;

import com.davivienda.pruebaautomatizacion.userinterfaces.Vuelos.UiVuelos;
import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.questions.WebElementQuestion;
import net.serenitybdd.screenplay.waits.Wait;

public class IsBuscarVuelos implements Interaction {

    public static IsBuscarVuelos one() {
        return Instrumented.instanceOf(IsBuscarVuelos.class).withProperties();
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        // hace clic en el boton buscar vuelos
        actor.attemptsTo(Wait.until(
                        WebElementQuestion.the(UiVuelos.ButtonBuscarVuelo),
                        WebElementStateMatchers.isVisible()
                ).forNoLongerThan(20).seconds(),
                Scroll.to(UiVuelos.ButtonBuscarVuelo),
                Click.on(UiVuelos.ButtonBuscarVuelo));
    }
}
