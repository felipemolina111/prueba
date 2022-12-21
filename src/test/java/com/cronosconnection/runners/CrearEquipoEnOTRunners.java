package com.cronosconnection.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = "src/test/resources/features/crearEquipoEnOT.feature",
        glue = "com.cronosconnection.stepDefinitions",
        snippets = SnippetType.CAMELCASE)


public class CrearEquipoEnOTRunners {
}
