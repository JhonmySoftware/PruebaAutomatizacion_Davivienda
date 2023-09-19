package com.davivienda.pruebaautomatizacion.tasks;

import com.davivienda.pruebaautomatizacion.models.MsVuelos;
import com.davivienda.pruebaautomatizacion.userinterfaces.Vuelos.UiVuelos;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.questions.WebElementQuestion;
import net.serenitybdd.screenplay.waits.Wait;

public class TsDiligenciarFormulario implements Task {


    TsDiligenciarFormulario one() {
        return Tasks.instrumented(TsDiligenciarFormulario.class);
    }

    private final MsVuelos msVuelos;

    public TsDiligenciarFormulario(MsVuelos msVuelos) {
        this.msVuelos = msVuelos;
    }

    public static TsDiligenciarFormulario conEstosDatos(MsVuelos msVuelos) {
        return Tasks.instrumented(TsDiligenciarFormulario.class, msVuelos);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        // Diligenciar los campos de Origen y Destino del formulario de vuelos
        actor.attemptsTo(Wait.until(WebElementQuestion.the(UiVuelos.InputOrigen),
                        WebElementStateMatchers.isVisible()).forNoLongerThan(30).seconds(),
                Enter.theValue(msVuelos.getOrigen()).into(UiVuelos.InputOrigen),
                Enter.theValue(msVuelos.getDestino()).into(UiVuelos.InputDestino),
                Click.on(UiVuelos.SeleccionFechaIda),
                Click.on(UiVuelos.SeleccionFechaCalendario),
                Click.on(UiVuelos.SeleccionFechaCalendario));
    }
}
