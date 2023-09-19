package com.davivienda.pruebaautomatizacion.userinterfaces.SeleccionarVuelos;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.findby.By;

public class UiSeleccionarVuelos extends PageObject {
    public static Target SeleccionarVuelos = Target.the("Seleccionar El segundo vuelo")
            .located(By.xpath("(//span[contains(text(),'SELECCIONAR')])[2]"));
}
