package com.magenic.mm.cukes;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Component
public class Checkout {
    int runningTotal = 0;

    public void add(int count, int price){
        runningTotal += count * price;
    }

    public int total() {
        return runningTotal;
    }
}
