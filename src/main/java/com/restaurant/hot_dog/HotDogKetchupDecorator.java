package com.restaurant.hot_dog;

import com.restaurant.Food;

/// Concrete decorator
public class HotDogKetchupDecorator extends HotDogDecorator{
    public HotDogKetchupDecorator(Food hotDog) {
        super(hotDog);
    }

    // Equivalent to init() accessed by the client.
    @Override
    public void addTopping(){
        getToppings().add("Ketchup, $0.20");
        cost += 0.2;
    }
}