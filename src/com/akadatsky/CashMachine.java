package com.akadatsky;

import java.util.ArrayList;
import java.util.List;

public class CashMachine {

    private List<Fruit> fruits = new ArrayList<>();

    public void add(Fruit fruit) {
        fruits.add(fruit);
    }

    public void printBill() {
        double result = 0;
        for (Fruit fruit : fruits) {
            result += fruit.getPricePerKg() * fruit.getWeight() / 1000.0;
        }
        System.out.printf("Result: "+"%(.2f%n", + result);
    }

}
