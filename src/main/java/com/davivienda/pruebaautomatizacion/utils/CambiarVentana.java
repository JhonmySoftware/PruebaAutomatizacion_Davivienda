package com.davivienda.pruebaautomatizacion.utils;

import java.util.Set;

import static net.thucydides.core.webdriver.ThucydidesWebDriverSupport.getDriver;

import java.util.Set;

import org.openqa.selenium.WebDriver;

public class CambiarVentana {
    public void cambiarAVentanaSecundaria(WebDriver driver) {
        // Obtener todos los identificadores de las ventanas abiertas
        Set<String> ventanas = driver.getWindowHandles();

        // Iterar sobre las ventanas y cambiar a la segunda ventana encontrada
        int ventanaCount = 0;
        for (String handle : ventanas) {
            ventanaCount++;
            if (ventanaCount == 2) {
                driver.switchTo().window(handle);
                break;
            }
        }
    }
}

