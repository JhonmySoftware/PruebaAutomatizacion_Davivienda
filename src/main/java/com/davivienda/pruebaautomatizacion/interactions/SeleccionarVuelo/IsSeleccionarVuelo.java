package com.davivienda.pruebaautomatizacion.interactions.SeleccionarVuelo;

import com.davivienda.pruebaautomatizacion.userinterfaces.SeleccionarVuelos.UiSeleccionarVuelos;
import com.davivienda.pruebaautomatizacion.utils.CambiarVentana;
import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.questions.WebElementQuestion;
import net.serenitybdd.screenplay.waits.Wait;

import java.sql.Driver;

import static net.thucydides.core.webdriver.ThucydidesWebDriverSupport.getDriver;

public class IsSeleccionarVuelo implements Interaction {

    public static IsSeleccionarVuelo one() {
        return Instrumented.instanceOf(IsSeleccionarVuelo.class).withProperties();
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Wait.until(
                        WebElementQuestion.the(UiSeleccionarVuelos.SeleccionarVuelos),
                        WebElementStateMatchers.isClickable()
                ).forNoLongerThan(30).seconds(),
                Scroll.to(UiSeleccionarVuelos.SeleccionarVuelos),
                Click.on(UiSeleccionarVuelos.SeleccionarVuelos));

        // ir a la segunda ventaa y verificar el itinerario
        // Suponiendo que tienes un WebDriver llamado "driver" inicializado y en uso
        CambiarVentana cambiarVentana = new CambiarVentana();
        cambiarVentana.cambiarAVentanaSecundaria(getDriver());


    }


}
