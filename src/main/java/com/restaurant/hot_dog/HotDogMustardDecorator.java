package com.restaurant.hot_dog;

import com.restaurant.Food;

/// Concrete decorator
public class HotDogMustardDecorator extends HotDogDecorator{
    public HotDogMustardDecorator(Food hotDog) {
        super(hotDog);
    }

    // Equivalent to init() accessed by the client.
    @Override
    public void addTopping(){
        getToppings().add("Mustard, $0.20");
        cost += 0.2;
    }
}