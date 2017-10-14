package com.drink.SJSU;

public class DrinkMenu
{
    public static void main(String args[])
    {
        Drink drink = new Tequila();
        System.out.println(drink.getDescription() + " $" + drink.price());

        drink = new RedBull(drink);
        System.out.println(drink.getDescription() + " $" + drink.price());

        Drink drink2 = new AeratedDrink(AeratedDrinkEnum.Coke);
        System.out.println(drink2.getDescription() + " $" + drink2.price());

        drink2 = new RedBull(drink2);
        System.out.println(drink2.getDescription() + " $" + drink2.price());

        drink2 = new CranberrySyrup(drink2);
        System.out.println(drink2.getDescription() + " $" + drink2.price());

        Drink drink3 = new Cocktails(CocktailEnum.Margarita);
        System.out.println(drink3.getDescription() + " $" + drink3.price());
    }
}
