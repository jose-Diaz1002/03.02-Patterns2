package org.Pizzeria.domain;

import org.Pizzeria.enums.Dough;
import org.Pizzeria.enums.Size;
import org.Pizzeria.enums.Topping;

public class PizzaVegetarian {
    private Dough dough;
    private Size size;
    private final Topping topping = Topping.VEGETABLE;

    public PizzaVegetarian() {
    }

    public PizzaVegetarian(Dough dough, Size size) {
        this.dough = dough;
        this.size = size;
    }

    public Dough getDough() {
        return dough;
    }

    public void setDough(Dough dough) {
        this.dough = dough;
    }

    public Size getSize() {
        return size;
    }

    public void setSize(Size size) {
        this.size = size;
    }

    public Topping getTopping() {
        return topping;
    }

    @Override
    public String toString() {
        return "\n---- vegetarian pizza ----" +
                "\n dough=" + dough +
                "\n size=" + size +
                "\n topping=" + topping;
    }
}
