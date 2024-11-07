package com.restaurant.hot_dog;

import com.restaurant.Food;

import java.util.ArrayList;

/// Abstract decorator
public abstract class HotDogDecorator implements Food {
    protected Food hotDog;
    protected ArrayList<String> toppings;
    protected double cost;

    protected HotDogDecorator(Food hotDog) {
        this.hotDog = hotDog;
        this.toppings = hotDog.getToppings();
        this.cost = hotDog.getCost();
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
        System.out.print("An order of Hot Dog. ");

        if(!toppings.isEmpty()) {
            System.out.println("With toppings: ");

            for (String topping : toppings) {
                System.out.print(topping + "    ");
            }
        }

        System.out.println("\nCost: $" + cost + "\n");
    }
}
