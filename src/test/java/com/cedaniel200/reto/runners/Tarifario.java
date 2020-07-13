package com.cedaniel200.reto.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = {"src/test/resources/features/tarifario.feature"},
        glue = {"com.cedaniel200.reto.stepdefinitions"},
        snippets = SnippetType.CAMELCASE
)
public class Tarifario {
}
