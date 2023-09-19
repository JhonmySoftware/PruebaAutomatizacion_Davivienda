package com.davivienda.pruebaautomatizacion.definition;

import com.davivienda.pruebaautomatizacion.interactions.AbrirPagina.IsAbrirPagina;
import com.davivienda.pruebaautomatizacion.interactions.BuscarVuelos.IsBuscarVuelos;
import com.davivienda.pruebaautomatizacion.interactions.SeleccionarVuelo.IsSeleccionarVuelo;
import com.davivienda.pruebaautomatizacion.models.MsVuelos;
import com.davivienda.pruebaautomatizacion.tasks.TsDiligenciarFormulario;
import cucumber.api.DataTable;
import cucumber.api.java.Before;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Entonces;
import cucumber.api.java.es.Y;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import java.util.List;
import java.util.Map;

public class BuscarVuelosSteps {

    IsAbrirPagina isAbrirPagina;
    IsBuscarVuelos isBuscarVuelos;
    IsSeleccionarVuelo isSeleccionarVuelo;
    @Before
    public void IniciarEscenario() {
        OnStage.setTheStage(new OnlineCast());
        System.setProperty("webdriver.edge.driver", "src/test/resources/driver/msedgedriver.exe");
    }

    @Dado("^que el usuario esta en la pagina de busqueda de vuelos$")
    public void queElUsuarioEstaEnLaPaginaDeBusquedaDeVuelos() {
        OnStage.theActorCalled("Usuario").wasAbleTo(IsAbrirPagina.one());
    }

    @Cuando("^Diligencia el formulario de vuelos con los siguientes datos$")
    public void diligenciaElFormularioDeVuelosConLosSiguientesDatos(DataTable datos) {
        List<Map<String, String>> data = datos.asMaps(String.class, String.class);
        MsVuelos msVuelos = new MsVuelos();
        msVuelos.setOrigen(data.get(0).get("Origen"));
        msVuelos.setDestino(data.get(0).get("Destino"));
        OnStage.theActorCalled("Usuario").wasAbleTo(TsDiligenciarFormulario.conEstosDatos(msVuelos));
    }

    @Y("^hace clic en el boton buscar vuelos$")
    public void haceClicEnElBotonBuscarVuelos() {
        OnStage.theActorCalled("usuario").wasAbleTo(IsBuscarVuelos.one());
    }

    @Entonces("^espera y  muestra de resultados seleccionando el segundo vuelo disponible indicando que la prueba es exitosa$")
    public void esperaYMuestraDeResultadosSeleccionandoElSegundoVueloDisponibleIndicandoQueLaPruebaEsExitosa() {
        OnStage.theActorCalled("usuario").wasAbleTo(IsSeleccionarVuelo.one());
    }



    @Cuando("^hace clic en el boton buscar vuelo sin ingresar datos$")
    public void haceClicEnElBotonBuscarVueloSinIngresarDatos() {
    }

    @Entonces("^se espera un mensaje de error indicando que faltan datos$")
    public void seEsperaUnMensajeDeErrorIndicandoQueFaltanDatos() {
    }

    @Dado("^que hay resultados de busqueda de vuelos$")
    public void queHayResultadosDeBusquedaDeVuelos() {
    }

    @Cuando("^el usuario selecciona el segundo vuelo disponible$")
    public void elUsuarioSeleccionaElSegundoVueloDisponible() {
    }

    @Entonces("^se reporta la prueba como exitosa indicando que el vuelo fue seleccionado$")
    public void seReportaLaPruebaComoExitosaIndicandoQueElVueloFueSeleccionado() {
    }

    @Dado("^que hay un unico resultado de busqueda de vuelos$")
    public void queHayUnUnicoResultadoDeBusquedaDeVuelos() {
    }

    @Cuando("^el usuario selecciona el unico vuelo presentado$")
    public void elUsuarioSeleccionaElUnicoVueloPresentado() {
    }

    @Entonces("^se reporta la prueba con advertencia indicando que solo habia un vuelo$")
    public void seReportaLaPruebaConAdvertenciaIndicandoQueSoloHabiaUnVuelo() {
    }


}

