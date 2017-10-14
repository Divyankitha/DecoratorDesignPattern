package com.drink.SJSU;

public class Cocktails implements Drink
{
    String description;
    public Cocktails(CocktailEnum C)
    {
        description = C.toString();
    }

    public String getDescription() {
        return description;
    }


    public double price()
    {
        return 14.99;
    }
}
