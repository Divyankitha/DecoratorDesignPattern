package com.drink.SJSU;

public class AeratedDrink implements Drink
{
    String description;
    public AeratedDrink(AeratedDrinkEnum A)
    {
        description = A.toString();
    }

    public String getDescription() {
        return description;
    }


    public double price()
    {
        return 4.99;
    }
}
