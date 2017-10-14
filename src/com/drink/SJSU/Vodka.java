package com.drink.SJSU;

public class Vodka implements Drink
{
    String description;
    public Vodka()
    {
        description = "Vodka";
    }

    public String getDescription() {
        return description;
    }


    public double price()
    {
        return 9.99;
    }
}
