package com.davivienda.pruebaautomatizacion.userinterfaces.AbrirPagina;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.annotations.findby.By;

@DefaultUrl("https://www.atrapalo.com.co/")
public class UiAbrirPagina extends PageObject {

    public static Target Aceptarcookies = Target.the("Aceptar los cookies de la pagina web")
            .located(By.id("CybotCookiebotDialogBodyButtonAccept"));
}
