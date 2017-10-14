package com.drink.SJSU;

public class Lime extends DrinkAddOn {
    Drink drink;

    public Lime(Drink drink)
    {
        this.drink = drink;
    }
    public String getDescription() {
        return drink.getDescription() + " with Lime";
    }


    public double price()
    {
        return .50 + drink.price();
    }
}
