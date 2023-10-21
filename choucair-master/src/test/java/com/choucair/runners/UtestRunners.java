package com.choucair.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/choucair_testing/registro_usuario.feature"
        ,glue = "com.choucair.steps_definitions"
        ,snippets = SnippetType.CAMELCASE
)

public class UtestRunners {
}
