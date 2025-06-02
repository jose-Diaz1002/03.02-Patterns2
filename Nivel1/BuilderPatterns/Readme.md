# 🍕 Pizza Ordering System - Builder Pattern (Java + Gradle)

This project demonstrates the use of the **Builder design pattern** in Java through a pizza ordering system. It's implemented as a Gradle project and includes a `Main` class to illustrate the creation of different types of pizzas with various configurations.

## 📦 Project Structure

- `Pizza`: The product class that represents a customizable pizza.
- `PizzaBuilder` (interface): Defines the steps to build a pizza (size, dough, toppings).
- `HawaianPizzaBuilder`, `VegetarianPizzaBuilder`: Concrete builders for specific types of pizzas.
- `MestrePizzer`: The "director" that orchestrates the construction process using a given builder.
- `Main`: Entry point of the application demonstrating usage.

## 🧱 Builder Pattern Overview

The Builder pattern allows the step-by-step construction of complex objects. In this case, it is used to create pizzas with different combinations of size, dough type, and toppings.

## 🧾 Features

- Customizable pizza creation.
- Predefined builders for:
  - Hawaian pizza
  - Vegetarian pizza
- Clean separation between construction process and final product.

## 🔧 Technologies

- Java 17+
- Gradle
- Object-Oriented Programming
- Design Patterns

## 📂 Class Responsibilities

### `Pizza`
The final product with the following attributes:
- `Size` (e.g. SMALL, MEDIUM, LARGE)
- `Dough` (e.g. THIN, THICK)
- `Toppings` (e.g. CHEESE, PINEAPPLE, MUSHROOM)

### `PizzaBuilder` (Interface)
Defines the builder methods:
```java
PizzaBuilder setSize(Size size);
PizzaBuilder setDough(Dough dough);
PizzaBuilder addTopping(Topping topping);
Pizza build();
