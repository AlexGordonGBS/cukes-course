package com.magenic.mm.cukes;

import com.magenic.mm.cukes.controller.Checkout;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;

import static org.junit.Assert.assertEquals;

@SpringBootTest
@ContextConfiguration(classes = CukesCourseApplication.class)
public class StepsDefinitionSharedState2 {

    @Autowired
    private Checkout checkout;

    @Autowired
    private PricesDatabase pricesDatabase;

    @When("^I checkout a cart of (\\d+), (\\d+),(\\d+),(\\d+)$")
    public void iCheckoutACartOf(int bananaN, int appleN, int potatoN, int unknownN) throws Throwable {
        checkout.add(bananaN, Integer.valueOf(pricesDatabase.getPrices().get("banana")));
        checkout.add(appleN, Integer.valueOf(pricesDatabase.getPrices().get("apple")));
        checkout.add(potatoN, Integer.valueOf(pricesDatabase.getPrices().get("potato")));
        checkout.add(unknownN, Integer.valueOf(pricesDatabase.getPrices().get("unknown")));
    }

    @Then("^The total price should be (\\d+)c$")
    public void theTotalPriceShouldBeC(int total) throws Throwable {
        assertEquals(total, checkout.total());
    }

}
