package com.restaurant;

import com.restaurant.*;
import com.restaurant.burger.*;
import com.restaurant.customer.CustomerOrder;
import com.restaurant.fries.*;
import com.restaurant.hot_dog.*;
import com.restaurant.coffee.*;

public class Main {
    public static void main(String[] args) {
        Food burger = new OriginalBurger();
        Food coffee = new OriginalCoffee();
        Food fries = new OriginalFries();
        Food hotDog = new OriginalHotDog();
        double totalPrice;

        burger = new BurgerCheeseDecorator(burger);
        burger.addTopping();
        burger = new BurgerLettuceDecorator(burger);
        burger.addTopping();
        burger = new BurgerOnionDecorator(burger);
        burger.addTopping();
        burger = new BurgerPicklesDecorator(burger);
        burger.addTopping();



        coffee = new CoffeeCreamDecorator(coffee);
        coffee.addTopping();
        coffee = new CoffeeMilkDecorator(coffee);
        coffee.addTopping();
        coffee = new CoffeeSyrupDecorator(coffee);
        coffee.addTopping();

        fries = new FriesKetchupDecorator(fries);
        fries.addTopping();
        fries = new FriesSaltDecorator(fries);
        fries.addTopping();

        hotDog = new HotDogKetchupDecorator(hotDog);
        hotDog.addTopping();
        hotDog = new HotDogMustardDecorator(hotDog);
        hotDog.addTopping();
        hotDog = new HotDogRelishDecorator(hotDog);
        hotDog.addTopping();

        CustomerOrder customer = new CustomerOrder(159);
        customer.addFood(burger);
        customer.addFood(coffee);
        customer.addFood(fries);
        customer.addFood(hotDog);

        customer.applyLoyaltyDiscount(true);

        customer.viewOrder();

        System.out.println("Customer loyalty points available: " + customer.getLoyaltyPoints());

        totalPrice = customer.getTotalPrice();

        System.out.println("Total price: " + totalPrice);
        System.out.println("Discount applied: $" + customer.getDiscountApplied());
        System.out.println("Remaining loyalty points: " + customer.getLoyaltyPoints());
    }
}
