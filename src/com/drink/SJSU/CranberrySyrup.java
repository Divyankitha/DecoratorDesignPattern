package com.drink.SJSU;

public class CranberrySyrup extends DrinkAddOn
{
    Drink drink;

    public CranberrySyrup(Drink drink)
    {
        this.drink = drink;
    }
    public String getDescription() {
        return drink.getDescription() + " with Cranberry Syrup";
    }


    public double price()
    {
        return 1.0 + drink.price();
    }
}
