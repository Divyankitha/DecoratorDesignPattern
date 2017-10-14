package com.drink.SJSU;

public class Rum implements Drink
{
    String description;
    public Rum()
    {
        description = "Rum";
    }

    public String getDescription()
    {
        return description;
    }


    public double price()
    {
        return 8.99;
    }
}
