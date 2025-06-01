package org.Pizzeria.core;

import org.Pizzeria.domain.PizzaHawaian;
import org.Pizzeria.domain.PizzaVegetarian;
import org.Pizzeria.enums.Dough;
import org.Pizzeria.enums.Size;
import org.Pizzeria.enums.Topping;

import java.util.ArrayList;
import java.util.List;

public class Pizza {
    private Dough dough;
    private Size size;
    private List<Topping> topping;

    private PizzaHawaian pizzaHawaian;
    private PizzaVegetarian pizzaVegetarian;

    public Pizza() {
    }

    public Pizza(Dough dough, Size size, List<Topping> topping,PizzaHawaian pizzaHawaian, PizzaVegetarian pizzaVegetarian) {
        this.dough = dough;
        this.size = size;
        this.topping = topping;
        this.pizzaHawaian = pizzaHawaian;
        this.pizzaVegetarian = pizzaVegetarian;
    }
    //clase interna 1

    public static class PizzaBuilder implements IBuilder<Pizza>{

        private Dough dough;
        private Size size;
        private List<Topping> topping = new ArrayList<>();

        private PizzaHawaian pizzaHawaian;
        private PizzaVegetarian pizzaVegetarian;

        public PizzaBuilder() {
        }

        public PizzaBuilder(Dough dough, Size size, List<Topping> topping, PizzaHawaian pizzaHawaian, PizzaVegetarian pizzaVegetarian) {
            this.dough = dough;
            this.size = size;
            this.topping = topping;
            this.pizzaHawaian = pizzaHawaian;
            this.pizzaVegetarian = pizzaVegetarian;
        }

        public PizzaBuilder setDough(Dough dough) {
            this.dough = dough;
            return this;
        }

        public PizzaBuilder setSize(Size size) {
            this.size = size;
            return this;
        }

        public PizzaBuilder setTopping(Topping topping) {
            this.topping.add(topping);
            return this;
        }

        public PizzaBuilder setPizzaHawaian(Dough dough,Size size) {
            this.pizzaHawaian = new PizzaHawaian(dough,size);
            return this;
        }

        public PizzaBuilder setPizzaVegetarian(Dough dough, Size size) {
            this.pizzaVegetarian = new PizzaVegetarian(dough, size);
            return this;
        }

        @Override
        public Pizza build() {
            return new Pizza(dough,size,topping ,pizzaHawaian,pizzaVegetarian );
        }


    }
    //clase interna 2 MestrePizzer

    public static class MestrePizzer implements IBuilder<Pizza>{

        private Dough dough;
        private Size size;
        private List<Topping> topping = new ArrayList<>();

        public MestrePizzer() {
        }

        public MestrePizzer(Dough dough, Size size, List<Topping> topping) {
            this.dough = dough;
            this.size = size;
            this.topping = topping;
        }

        public MestrePizzer setDough(Dough dough) {
            this.dough = dough;
            return this;
        }

        public MestrePizzer setSize(Size size) {
            this.size = size;
            return this;
        }

        public MestrePizzer setTopping(Topping topping) {
            this.topping.add(topping);
            return this;
        }

        @Override
        public Pizza build() {
            return new Pizza();
        }
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

    public List<Topping> getTopping() {
        return topping;
    }

    public void setTopping(List<Topping> topping) {
        this.topping = topping;
    }

    public PizzaHawaian getPizzaHawaian() {
        return pizzaHawaian;
    }

    public void setPizzaHawaian(PizzaHawaian pizzaHawaian) {
        this.pizzaHawaian = pizzaHawaian;
    }

    public PizzaVegetarian getPizzaVegetarian() {
        return pizzaVegetarian;
    }

    public void setPizzaVegetarian(PizzaVegetarian pizzaVegetarian) {
        this.pizzaVegetarian = pizzaVegetarian;
    }

    @Override
    public String toString() {
        return "\n--------Pizza--------" +
                "\nDough=" + dough +
                "\nsize=" + size +
                "\ntopping=" + topping +
                "\n"+ pizzaHawaian +
                "\n" + pizzaVegetarian +
                '}';
    }
}
