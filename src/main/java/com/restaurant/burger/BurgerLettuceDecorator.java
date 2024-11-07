package com.restaurant.burger;

import com.restaurant.Food;

/// Concrete decorator
public class BurgerLettuceDecorator extends BurgerDecorator {
    public BurgerLettuceDecorator(Food burger) {
        super(burger);
    }

    // Equivalent to init() accessed by the client.
    @Override
    public void addTopping(){
        toppings.add("Lettuce, $0.10");
        cost += 0.1;
    }
}