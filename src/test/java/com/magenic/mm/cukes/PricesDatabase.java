package com.magenic.mm.cukes;

import org.springframework.stereotype.Component;

import java.util.Map;

@Component
public class PricesDatabase {
    private Map<String, String> prices;

    public void setPrices(Map<String, String> prices) {
        this.prices = prices;
    }

}
