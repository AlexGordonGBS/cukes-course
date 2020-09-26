package com.magenic.mm.cukes;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "classpath:features"
        , snippets = SnippetType.CAMELCASE
        , dryRun = false
        , tags = {"@focus"}
)
public class CucumberTest {
    
}