package com.magenic.mm.cukes;

import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

@Component
public class PricesDatabase {
    private Map<String, String> prices = new HashMap<>();

    public void setPrices(Map<String, String> prices) {
        this.prices = prices;
    }

    public Map<String, String> getPrices() {
        return this.prices;
    }

}
