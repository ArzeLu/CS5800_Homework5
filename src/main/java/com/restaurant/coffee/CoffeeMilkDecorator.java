package com.restaurant.coffee;

import com.restaurant.Food;

/// Concrete decorator
public class CoffeeMilkDecorator extends CoffeeDecorator {
    public CoffeeMilkDecorator(Food coffee) {
        super(coffee);
    }

    // Equivalent to init() accessed by the client.
    @Override
    public void addTopping(){
        getToppings().add("Milk, $1.20");
        cost = getCost() + 1.2;
    }
}