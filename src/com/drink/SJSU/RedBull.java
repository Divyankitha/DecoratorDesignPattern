package com.drink.SJSU;

public class RedBull extends DrinkAddOn
{
    Drink drink;

    public RedBull(Drink drink)
    {
        this.drink = drink;
    }
    public String getDescription() {
        return drink.getDescription() + " with RedBull";
    }


    public double price()
    {
        return 2.0 + drink.price();
    }
}
