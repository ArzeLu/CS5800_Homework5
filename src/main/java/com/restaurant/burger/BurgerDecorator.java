package com.restaurant.burger;

import com.restaurant.Food;

import java.util.ArrayList;

/// Abstract decorator
public abstract class BurgerDecorator implements Food {
    protected Food burger;
    protected ArrayList<String> toppings;
    protected double cost;

    protected BurgerDecorator(Food burger) {
        this.burger = burger;
        this.toppings = burger.getToppings();
        this.cost = burger.getCost();
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
        System.out.print("An order of Burger. ");

        if(!toppings.isEmpty()) {
            System.out.println("With toppings: ");

            for (String topping : toppings) {
                System.out.print(topping + "    ");
            }
        }

        System.out.println("\nCost: $" + cost + "\n");
    }
}
