package com.davivienda.pruebaautomatizacion.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features"
        , snippets = SnippetType.CAMELCASE
        , tags = "@BuscarVuelos"
        , glue = "com.davivienda.pruebaautomatizacion.definition")

public class RunnerTags {
    // gradle clean test aggregate -Dtags=@AbrirPagina
}
