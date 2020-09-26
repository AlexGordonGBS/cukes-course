package com.magenic.mm.cukes;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.assertEquals;

public class StepsDefinition {
    Map<String, Integer> prices = new HashMap<>();

    int bananaPrice = 0;
    int applePrice = 0;
    Checkout checkout = new Checkout();
    //map djfwkjkbksdbv

    @Given("^the price of a \"([^\"]*)\" is (\\d+)c$")
    public void thePriceOfAIsC(String name, int price) throws Throwable {
        if (name.equals("banana")) {
            this.bananaPrice = price;
        } else if (name.equals("apple")) {
            this.applePrice = price;
        } else {
            throw new PendingException("Alex, Unknown product: " + name);
        }
    }

    @When("^I checkout (\\d+) \"([^\"]*)\"$")
    public void iCheckout(int itemCount, String itemName) throws Throwable {
        if (itemName.equals("banana")) {
            checkout.add(itemCount, bananaPrice);
        } else if (itemName.equals("apple")) {
            checkout.add(itemCount, applePrice);
        } else {
            throw new PendingException("Unknown product: " + itemName);
        }
    }

    @Then("^the total price should be (\\d+)c$")
    public void theTotalPriceShouldBeC(int total) throws Throwable {
        assertEquals(total, checkout.total());
    }


}
