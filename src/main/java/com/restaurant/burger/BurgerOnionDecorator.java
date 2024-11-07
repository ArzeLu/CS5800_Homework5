package com.restaurant.burger;

import com.restaurant.Food;

/// Concrete decorator
public class BurgerOnionDecorator extends BurgerDecorator {
    public BurgerOnionDecorator(Food burger) {
        super(burger);
    }

    // Equivalent to init() accessed by the client.
    @Override
    public void addTopping(){
        toppings.add("Onion, $0.20");
        cost += 0.2;
    }
}