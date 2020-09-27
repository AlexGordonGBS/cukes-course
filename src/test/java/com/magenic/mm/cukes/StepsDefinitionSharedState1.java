package com.magenic.mm.cukes;

import com.magenic.mm.cukes.controller.Checkout;
import cucumber.api.DataTable;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;

@SpringBootTest
@ContextConfiguration(classes = CukesCourseApplication.class)
public class StepsDefinitionSharedState1 {

    @Autowired
    private Checkout checkout;

    @Autowired
    private PricesDatabase pricesDatabase;

    @Before
    public void initialization() {
        checkout.reset();
    }

    @Given("^The prices are as follows$")
    public void thePricesAsFollows(DataTable table) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        // For automatic transformation, change DataTable to one of
        // List<YourType>, List<List<E>>, List<Map<K,V>> or Map<K,V>.
        // E,K,V must be a scalar (String, Integer, Date, enum etc)
        pricesDatabase.setPrices(table.asMap(String.class, String.class));
    }

}
