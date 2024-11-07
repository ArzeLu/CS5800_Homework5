package com.restaurant;

import java.util.ArrayList;

/// Component interface
public interface Food {
    void viewInfo();
    void addTopping();
    ArrayList<String> getToppings();
    double getCost();
}