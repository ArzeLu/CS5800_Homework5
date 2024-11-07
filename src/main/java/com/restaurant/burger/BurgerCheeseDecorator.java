package com.restaurant.burger;

import com.restaurant.Food;

/// Concrete decorator
public class BurgerCheeseDecorator extends BurgerDecorator {
    public BurgerCheeseDecorator(Food burger) {
        super(burger);
    }

    // Equivalent to init() accessed by the client.
    @Override
    public void addTopping(){
        toppings.add("Cheese, $0.50");
        cost += 0.5;
    }
}