package com.davivienda.pruebaautomatizacion.userinterfaces.Vuelos;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.findby.By;

public class UiVuelos extends PageObject {

    /**
     * PASO 1
     * */

    public static Target InputOrigen = Target.the("Ingresar el Origen del vuelo")
            .located(By.id("origen_vue"));
    public static Target InputDestino = Target.the("Ingresar el Destino del vuelo")
            .located(By.id("destino_vue"));

    public static Target SeleccionFechaIda = Target.the("Seleccionar la fecha de ida del vuelo")
            .located(By.xpath("(//span[@class='input-icon calendar'])[1]"));

    public static Target SeleccionFechaVuelta = Target.the("Seleccionar la fecha de vuelta del vuelo")
            .located(By.xpath("(//span[@class='input-icon calendar'])[2]"));

    public static Target SeleccionFechaCalendario = Target.the("Seleccionar la fecha del vuelo")
            .located(By.xpath("(//div[contains(text(),'30')])[2]"));

    public static Target ButtonBuscarVuelo = Target.the("Botón para buscar el vuelo")
            .located(By.xpath("(//button[@id='main_bt_search_v'])[1]"));



}
