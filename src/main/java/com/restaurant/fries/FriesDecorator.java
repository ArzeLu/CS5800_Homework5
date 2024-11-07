package com.restaurant.fries;

import com.restaurant.Food;

import java.util.ArrayList;

/// Abstract decorator
public abstract class FriesDecorator implements Food {
    protected Food fries;
    protected ArrayList<String> toppings;
    protected double cost;

    protected FriesDecorator(Food fries) {
        this.fries = fries;
        this.toppings = fries.getToppings();
        this.cost = fries.getCost();
    }

    // Equivalent to init() accessed by the client.
    public void addTopping(){
        toppings = getToppings();
        cost = getCost();
    }

    @Override
    public ArrayList<String> getToppings(){
        return toppings;
    }

    @Override
    public double getCost(){
        return cost;
    }

    @Override
    public void viewInfo() {
        System.out.print("An order of Fries. ");

        if(!toppings.isEmpty()) {
            System.out.println("With toppings: ");

            for (String topping : toppings) {
                System.out.print(topping + "    ");
            }
        }

        System.out.println("\nCost: $" + cost + "\n");
    }
}
