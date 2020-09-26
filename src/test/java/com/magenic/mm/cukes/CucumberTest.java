package com.magenic.mm.cukes;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "classpath:features"
        , snippets = SnippetType.CAMELCASE
        , dryRun = false
//        // logical OR on tags - comma separated in the same quotes:
//        , tags = {"@focus, @wip"}
        // logical AND on tags - comma separated in the separate quotes:
        , tags = {"@focus"}
)
public class CucumberTest {
    
}