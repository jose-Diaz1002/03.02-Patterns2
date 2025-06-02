package org.Pizzeria;

import org.Pizzeria.core.Pizza;
import org.Pizzeria.enums.Dough;
import org.Pizzeria.enums.Size;
import org.Pizzeria.enums.Topping;

public class Main {
    public static void main(String[] args) {

        Pizza pizza = new Pizza.PizzaBuilder()
                .setPizzaHawaian(Dough.CLASSIC, Size.MEDIUM)
                .setPizzaVegetarian(Dough.AMERICAN, Size.SMALL)
                .setDough(Dough.ROMAN)
                .setSize(Size.LARGE)
                .setTopping(Topping.CHEESE)
                .setTopping(Topping.ONION)
                .setTopping(Topping.MOZZARELLA)
                .setTopping(Topping.SAUCE)
                .setTopping(Topping.PEPPERONI)
                .build();
        System.out.println(pizza);

    }

}