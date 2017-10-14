package com.drink.SJSU;

public class Tequila implements Drink
{
    String description;
    public Tequila()
    {
        description = "Tequila";
    }

    public String getDescription() {
        return description;
    }


    public double price()
    {
        return 10.99;
    }
}
