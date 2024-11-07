package com.restaurant.burger;

import com.restaurant.Food;

/// Concrete decorator
public class BurgerPicklesDecorator extends BurgerDecorator {
    public BurgerPicklesDecorator(Food burger) {
        super(burger);
    }

    // Equivalent to init() accessed by the client.
    @Override
    public void addTopping(){
        toppings.add("Pickles, $0.30");
        cost += 0.3;
    }
}