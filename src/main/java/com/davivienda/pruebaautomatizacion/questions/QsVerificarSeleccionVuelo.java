package com.davivienda.pruebaautomatizacion.questions;

import com.davivienda.pruebaautomatizacion.userinterfaces.SeleccionarVuelos.UiSeleccionarVuelos;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class QsVerificarSeleccionVuelo implements Question {

    public static QsVerificarSeleccionVuelo one() {
        return new QsVerificarSeleccionVuelo();
    }

    @Override
    public Object answeredBy(Actor actor) {
        return Text.of(UiSeleccionarVuelos.VerSeleccionarVuelos).viewedBy(actor).asString();
    }
}
