package com.restaurant.coffee;

import com.restaurant.Food;

import java.util.ArrayList;

/// Abstract decorator
public abstract class CoffeeDecorator implements Food {
    protected Food coffee;
    protected ArrayList<String> toppings;
    protected double cost;

    protected CoffeeDecorator(Food coffee) {
        this.coffee = coffee;
        this.toppings = coffee.getToppings();
        this.cost = coffee.getCost();
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
        System.out.print("An order of Coffee. ");

        if(!toppings.isEmpty()) {
            System.out.println("With toppings: ");

            for (String topping : toppings) {
                System.out.print(topping + "    ");
            }
        }

        System.out.println("\nCost: $" + cost + "\n");
    }
}
