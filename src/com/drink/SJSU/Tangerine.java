package com.drink.SJSU;

public class Tangerine extends DrinkAddOn
{
    Drink drink;

    public Tangerine(Drink drink)
    {
        this.drink = drink;
    }
    public String getDescription() {
        return drink.getDescription() + " with Tangerine";
    }


    public double price()
    {
        return 1.0 + drink.price();
    }
}

