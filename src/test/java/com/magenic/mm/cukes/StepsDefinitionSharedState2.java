package com.magenic.mm.cukes;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.assertEquals;

public class StepsDefinitionSharedState2 {

    Checkout checkout = new Checkout();
    Map<String, String> prices;

//    @Given("^SharedState: the prices as follows$")
//    public void thePricesAsFollows(DataTable table) throws Throwable {
//        // Write code here that turns the phrase above into concrete actions
//        // For automatic transformation, change DataTable to one of
//        // List<YourType>, List<List<E>>, List<Map<K,V>> or Map<K,V>.
//        // E,K,V must be a scalar (String, Integer, Date, enum etc)
//        prices = new HashMap<>();
//        prices = table.asMap(String.class, String.class);
////        System.out.println(prices);
//    }

    @When("^SharedState: I checkoutNEW (\\d+) \"([^\"]*)\"$")
    public void iCheckoutNEW(int itemCount, String itemName) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        checkout.add(itemCount, Integer.valueOf(prices.get(itemName)));
    }

    @Then("^SharedState: the NEW total price should be (\\d+)c$")
    public void theNEWTotalPriceShouldBeC(int total) throws Throwable {
        assertEquals(total, checkout.total());
    }

    @When("^SharedState: I checkout a cart of (\\d+), (\\d+),(\\d+),(\\d+)$")
    public void iCheckoutACartOf(int bananaN, int appleN, int potatoN, int unknownN) throws Throwable {
        checkout.add(bananaN, Integer.valueOf(prices.get("banana")));
        checkout.add(appleN, Integer.valueOf(prices.get("apple")));
        checkout.add(potatoN, Integer.valueOf(prices.get("potato")));
        checkout.add(unknownN, Integer.valueOf(prices.get("unknown")));
    }

    @Then("^SharedState: the NEW total price should be (\\d+)$")
    public void theNEWTotalPriceShouldBe(int total) throws Throwable {
        assertEquals(total, checkout.total());
    }

}
