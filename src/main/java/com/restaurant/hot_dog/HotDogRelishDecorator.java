package com.restaurant.hot_dog;

import com.restaurant.Food;

/// Concrete decorator
public class HotDogRelishDecorator extends HotDogDecorator{
    public HotDogRelishDecorator(Food hotDog) {
        super(hotDog);
    }

    // Equivalent to init() accessed by the client.
    @Override
    public void addTopping(){
        getToppings().add("Relish, $0.25");
        cost += 0.25;
    }
}